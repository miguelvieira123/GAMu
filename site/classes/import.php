<?php
	function importStudents($file,$dbh){
		$out = "";
		$xml = new DomDocument();
		$xml->load($file['tmp_name']);
		$res = @$xml->schemaValidate("../../schemas/alunos.xsd");
		if($res == false){
			$error = error_get_last();
			echo substr($error['message'],30,strlen($error['message']));
		}
		$xml = simplexml_load_file($file['tmp_name']);
		$alunos = $xml->xpath("//aluno");
		foreach($alunos as $aluno){
			$stId =  (string)$aluno['id'];
			$stName =  (string)$aluno['nome'];
			$stDay = (string)$aluno['dataNsc'];
			$stMail = (string)$aluno['mail'];
			$stMobile = (string)$aluno['telemovel'];
			$student = checkStudentId($stId,$dbh);
			switch($student){
				case -1:
					echo "-1<br>";
					break;
				case -2:
					echo "-2<br>";
					break;
				case -3:// Este Estudante nao existe;
					$sql_st = "INSERT INTO aluno VALUES('".$stId."','".$stName."','".$stDay."','".$stMail."','".$stMobile."');";
					$sql_c = "";
					$sql_instr = "";
					foreach($aluno->cursos->curso as $curso){
						$sql_c = "INSERT INTO matricula VALUES('".$stId."','".(string)$curso['id']."','".(string)$curso['anoLetivo']."','".(string)$curso['anoCurso']."');";
						$res = $dbh->query($sql_c);
					}
					foreach($aluno->instrumentos->instrumento as $instr){
						$sql_instr = "INSERT INTO aluno_instrumento VALUES('".$stId."','".(string)$instr['id']."');";
						$res = $dbh->query($sql_instr);
					}
					$res = $dbh->query($sql_st);
					if($res!=false) {
						 $out .="O Aluno  ".$stId." foi inserido<br>";
					}
					else $out .= "O Aluno  ".$stId." NAO foi inserido<br>";
					break;
				case 1:
					$out .=  "O Aluno com id ".$stId." já existe<br>";
					break;

				default:
					break;

			}
		}
	return $out;
	}
	function importProfessors($file,$dbh){
		print_r($file);
	}
	function importAudition($file,$dbh){
		print_r($file);
	}
	function importCourses($file,$dbh){
		print_r($file);
	}
	function importWorks($file,$dbh){
		print_r($file);
	}

	function getLastStudentId($dbh){
		$sql = "SELECT id FROM aluno ORDER BY id DESC LIMIT 1";
		$res = $dbh->query($sql);
		if($res == false)return -1;
		if($res->rowCount()>0){
			foreach($res as $row){
				return substr($row['id'],1,strlen($row['id']));
			}
		}
		else return -2;
	}
	function checkStudent($name,$birthday,$dbh){
		$sql = "SELECT id FROM aluno WHERE nome='".$name."' AND dataNsc='".$birthday."'";
		$res = $dbh->query($sql);
		if($res == false)return -1;
		if($res->rowCount()==1){
			foreach($res as $row){
				return $row['id'];
			}
		}
		else if($res->rowCount()>1) return -2;
		else return -3;
	}
	function checkStudentId($ID,$dbh){
		$sql = "SELECT id FROM aluno WHERE id='".$ID."'";
		$res = $dbh->query($sql);
		if($res == false)return -1;
		if($res->rowCount()==1)return 1;
		else if($res->rowCount()>1) return -2;
		else return -3;
	}
	function checkMatricula($idA,$idC,$ano,$dbh){
		$sql = "SELECT id_aluno FROM matricula WHERE id_aluno='".$idA."' AND id_curso='".$idC."' AND anoLetivo='".$ano."'";
		$res = $dbh->query($sql);
		if($res == false)return -1;
		if($res->rowCount()==1){
			return 1;
		}
		else return -3;
	}


?>
