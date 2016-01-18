<?php
	function exportStudents($dbh){
		$new_xml = new DomDocument();
		$sql = "SELECT * from aluno ORDER BY id";
		$res = $dbh->query($sql);
		$str="";
		foreach($res as $student){
			$str.="&#10;&#9;<aluno id='".$student['id']."' nome='".$student['nome']."' dataNsc='".$student['dataNsc']."' mail='".$student['mail']."' telemovel='".$student['mobile']."'>";
			$sql = "SELECT id, anoLetivo, anoCurso, id_instrumento FROM matricula, curso WHERE matricula.id_aluno='".$student['id']."' AND matricula.id_curso=curso.id;";
			$courses = $dbh->query($sql);
			$str_course="";
			$str_instr="";
			foreach($courses as $course){
				$str_course.= "&#10;&#9;&#9;&#9;<curso id='".$course['id']."'  id_instrumento='".$course['id_instrumento']."' anoLetivo='".$course['anoLetivo']."' anoCurso='".$course['anoCurso']."'></curso>";
			}
			$sql = "SELECT id_instrumento as idI from aluno_instrumento where id_aluno='".$student['id']."'";
			$instrs = $dbh->query($sql);
			foreach($instrs as $instr){
				$str_instr.= "&#10;&#9;&#9;&#9;<instrumento id='".$instr['idI']."'></instrumento>";
			}
			$str.="&#10;&#9;&#9;<cursos>".$str_course."&#10;&#9;&#9;</cursos>&#10;&#9;&#9;<instrumentos>".$str_instr."&#10;&#9;&#9;</instrumentos>&#10;&#9;</aluno>";
		}
		$strFULL="<alunos>&#10;".$str."&#10;</alunos>";
		$new_xml->LoadXML($strFULL);
		$res = @$new_xml->schemaValidate("../../schemas/alunos.xsd");
		if($res == false){
			$error = error_get_last();
			echo substr($error['message'],30,strlen($error['message']));
			die();
		}
		$new_xml->save('php://output');
	}
	function exportProfessors($dbh){
		$new_xml = new DomDocument();
		$sql = "SELECT * from professor ORDER BY id";
		$res = $dbh->query($sql);
		$str="";
		foreach($res as $prof){
			$str.="&#10;&#9;<professor id='".$prof['id']."' nome='".$prof['nome']."' dataNsc='".$prof['dataNsc']."' mail='".$prof['mail']."' telemovel='".$prof['mobile']."'>";
			$sql = "SELECT id_curso FROM professor_curso WHERE id_professor='".$prof['id']."';";
			$courses = $dbh->query($sql);
			$str_course="";
			foreach($courses as $course){
				$str_course.= "&#10;&#9;&#9;&#9;<curso id='".$course['id_curso']."'></curso>";
			}
			$str.="&#10;&#9;&#9;<cursos>".$str_course."&#10;&#9;&#9;</cursos>&#10;&#9;</professor>";
		}
		$strFULL="<professores>".$str."&#10;</professores>";
		$new_xml->LoadXML($strFULL);
		$res = @$new_xml->schemaValidate("../../schemas/professores.xsd");
		if($res == false){
			$error = error_get_last();
			echo substr($error['message'],30,strlen($error['message']));
			die();
		}
		$new_xml->save('php://output');
	}
	
	function exportCourses($dbh){
		$new_xml = new DomDocument();
		$sql = "SELECT * from curso ORDER BY id";
		$res = $dbh->query($sql);
		$str="";
		foreach($res as $course){
			$str.="&#10;&#9;<curso id='".$course['id']."' designacao='".$course['designacao']."' duracao='".$course['duracao']."' idInstr='".$course['id_instrumento']."'></curso>";
		}
		$strFULL="<cursos>".$str."&#10;</cursos>";
		$new_xml->LoadXML($strFULL);
		$res = @$new_xml->schemaValidate("../../schemas/cursos.xsd");
		if($res == false){
			$error = error_get_last();
			echo substr($error['message'],30,strlen($error['message']));
			die();
		}
		$new_xml->save('php://output');
	}

	function exportWorks($dbh){
		$new_xml = new DomDocument();
		$sql = "SELECT * from obra ORDER BY id";
		$res = $dbh->query($sql);
		$str="";
		foreach($res as $obra){
			//$str.="&#10;&#9;<obra id='".$obra['id']."' nome='".$obra['nome']."'  duracao='".$obra['duracao']."' ano='".$obra['anoCriacao']."' idPeriodo='".$obra['id_periodo']."'></obra>";
			$str .="&#10;&#9;<obra>&#10;&#9;</obra>";
			//$sql = "SELECT id_curso FROM professor_curso WHERE id_professor='".$prof['id']."';";
			//$courses = $dbh->query($sql);
			//$str_course="";
			//$str_instr="";
			//foreach($courses as $course){
			//	$str_course.= "&#10;&#9;&#9;&#9;<curso id='".$course['id_curso']."'></curso>";
			//}
			//$sql = "SELECT id_instrumento as idI from aluno_instrumento where id_aluno='".$student['id']."'";
			//$instrs = $dbh->query($sql);
			//foreach($instrs as $instr){
			//	$str_instr.= "&#10;&#9;&#9;&#9;<instrumento id='".$instr['idI']."'></instrumento>";
			//}
			//$str.="&#10;&#9;&#9;<cursos>".$str_course."&#10;&#9;&#9;</cursos>&#10;&#9;&#9;<instrumentos>".$str_instr."&#10;&#9;&#9;</instrumentos>&#10;&#9;</aluno>";
			//$str.="&#10;&#9;&#9;<cursos>".$str_course."&#10;&#9;&#9;</cursos>&#10;&#9;</professor>";
		}
		$strFULL="<obras>".$str."&#10;</obras>";
		$new_xml->LoadXML($strFULL);
		$new_xml->save('php://output');
	}
	function exportAditions($file){
		$new_xml = new DomDocument();
		$new_xml->load($file);
		$new_xml->save('php://output');
	}
?>
