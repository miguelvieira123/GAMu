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
		$new_xml->save('php://output');
	}

?>