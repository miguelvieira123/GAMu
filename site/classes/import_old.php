<?php
	function importStudents($file,$dbh){
		$xml = new DomDocument();
		$xml->load($file['tmp_name']);
		$res = @$xml->schemaValidate("../../schemas/alunos.xsd");
		if($res == false){
			$error = error_get_last();
			echo substr($error['message'],30,strlen($error['message']));
		}
		$xml = simplexml_load_file($file['tmp_name']);
		$alunos = $xml->xpath("//aluno");
		$lastID = getLastStudentId($dbh);
		//echo $lastID."<br>";
		foreach($alunos as $aluno){
			$stId =  (string)$aluno['id'];
			$stName =  (string)$aluno['nome'];
			$stDay = (string)$aluno['dataNsc'];
			$stMail = (string)$aluno['mail'];
			$stMobile = (string)$aluno['telemovel'];
			$student = checkStudent($stName,$stDay,$dbh);
			switch($student){
				case -1:
					break;
				case -2:
					break;
				case -3:// Este Estudante nao existe;

					$checkID = checkStudentId($stId,$dbh);
					if($checkID==-3){
						$sql_st = "INSERT INTO aluno VALUES('".$stId."','".$stName."','".$stDay."','".$stMail."','".$stMobile."');";
						echo $sql_st."<br>";
						//echo "ID  ".$stId." nao existe<br>";
					}
					else if($checkID == 1){
						$lastID++;
						$sql_st = "INSERT INTO aluno VALUES('A".$lastID."','".$stName."','".$stDay."','".$stMail."','".$stMobile."');";
						echo $sql_st."<br>";
						//echo "ID  ".$stId." nao existe, new id A".$lastID."<br>";
					}
					$sql_c = "";
					foreach($aluno->cursos->curso as $curso){
						//print_r($curso);
						//$sql_c .= "INSERT INTO "
						echo (string)$curso['id']."<br>";
					}
					break;
				default://Este Estudante ja existe

					//if($stId == $student){
					//	continue;
					//}
					//$checkID = checkStudentId($stId,$dbh);
					//if($checkID==-3){
						//echo "ID  ".$stId." nao existe<br>";
					//}
					//else if($checkID == 1){
						//$lastID++;
						//echo "ID  ".$stId." ja existe, new id A".$lastID."<br>";
					//}

			}
			//echo "<pre>";
			//print_r($aluno);
			//echo "</pre>";
		}

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
		if($res->rowCount()==1){
			return 1;
		}
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
