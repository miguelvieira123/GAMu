<?php
 /*!
 * This function adds students to $file
 * And return log
 */
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
					break;
				case -2:
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
//----------------------------------------------------------------------------------------------------------------------------------------------------
	/*!
 * This function adds courses to $file
 * And return log
 */
	function importCourses($file,$dbh){
		$out="";
		$sql = "INSERT INTO curso VALUES ";
		$xml = new DomDocument();
		$xml->load($file['tmp_name']);
		$res = @$xml->schemaValidate("../../schemas/cursos.xsd");
		if($res == false){
			$error = error_get_last();
			echo substr($error['message'],30,strlen($error['message']));
		}
		$xml = simplexml_load_file($file['tmp_name']);
		$cursos = $xml->xpath("//curso");
		foreach($cursos as $curso){
			$cId =  (string)$curso['id'];
			$cName =  (string)$curso['designacao'];
			$cTime = (string)$curso['duracao'];
			$cInstr = (string)$curso['idInstr'];
			$course = checkCourseId($cId,$dbh);
			switch($course){
				case -1:
					break;
				case -2:
					break;
				case -3:
					$sql.= "('".$cId."','".$cName."','".$cTime."','".$cInstr."'),";
					break;
				case 1:
					$out.="O Curso com id ".$cId." já existe<br>";;
					break;

				default:
					break;

			}
		}
		$sql[strlen($sql)-1]=';';
		$res = $dbh->query($sql);
		if($res!=false) {
			 $out .="Os outros cursos foram  inseridos<br>";
		}
		else $out .= "Ocurreu um erro no momemto de importação dos cursos <br>";
	return $out;
	}
//-------------------------------------------------------------------------------------------------------------------------------------------
	/*!
 * This function adds professors to $file
 * And return log
 */
	function importProfessors($file,$dbh){
		$out = "";
		$xml = new DomDocument();
		$xml->load($file['tmp_name']);
		$res = @$xml->schemaValidate("../../schemas/professores.xsd");
		if($res == false){
			$error = error_get_last();
			echo substr($error['message'],30,strlen($error['message']));
		}
		$xml = simplexml_load_file($file['tmp_name']);
		$profs = $xml->xpath("//professor");
		foreach($profs as $prof){
			$prId =  (string)$prof['id'];
			$prName =  (string)$prof['nome'];
			$prDay = (string)$prof['dataNsc'];
			$prMail = (string)$prof['mail'];
			$prMobile = (string)$prof['telemovel'];
			$professor = checkProfessorId($prId,$dbh);
			switch($professor){
				case -1:
					break;
				case -2:
					break;
				case -3:// Este Professor nao existe;
					$sql_pr = "INSERT INTO professor VALUES('".$prId."','".$prName."','".$prDay."','".$prMail."','".$prMobile."');";
					$sql_c = "";
					foreach($prof->cursos->curso as $curso){
						$sql_c = "INSERT INTO professor_curso VALUES('".$prId."','".(string)$curso['id']."');";
						$res = $dbh->query($sql_c);
					}
					$res = $dbh->query($sql_pr);
					if($res!=false) {
						 $out .="O Professor  ".$prId." foi inserido<br>";
					}
					else $out .= "O Professor  ".$prId." NAO foi inserido<br>";
					break;
				case 1:
					$out .=  "O professor com id ".$prId." já existe<br>";
					break;

				default:
					break;

			}
		}
	return $out;
	}
//----------------------------------------------------------------------------------------------------------------------------------------------
	/*!
 * This function adds auditions to $file
 * And return log
 */
	function importAudition($file,$dbh){
		$out="";
		$xmlD_new = new DomDocument();
		$xmlD_new->load($file['tmp_name']);
		$res = @$xmlD_new->schemaValidate("../../schemas/audicoes.xsd");
		if($res == false){
			$error = error_get_last();
			echo substr($error['message'],30,strlen($error['message']));
		}
		$xmlD_old = new DomDocument();
		$xmlD_old->load("../../files/auditions/2015_2016.xml");
		$xmlS_new = simplexml_load_file($file['tmp_name']);
		$xmlS_old = simplexml_load_file("../../files/auditions/2015_2016.xml");
		$audNs = $xmlS_new->xpath("//audicao");
		$audOs = $xmlS_old->xpath("//audicao");
		foreach($audNs as $audition){
			$check = false;
			foreach($audOs as $audition2){
				if((string)$audition['id']==(string)$audition2['id']){
					$check = true;
					break;
				}
			}
			if($check==false){
				$audN = $xmlS_new->xpath("//audicao[@id='".$audition['id']."']");
				$xmlD_new->loadXML($audN[0]->asXML());
				$node = $xmlD_new->getElementsByTagName('audicao');
				$node = $xmlD_old->importNode($node[0],true);
				$node2 = $xmlD_old->getElementsByTagName('audicoes');
				$node2[0]->appendChild($node);
				$out .= "Audicao '".$audition['id']."' foi importada<br>";
			}

		}
		$xmlD_old->save("../../files/auditions/2015_2016.xml");
		return $out;
	}
//----------------------------------------------------------------------------------------------------------------------------------------------
		/*!
 * This function returns id of the last student
 * if Query returns false , function return -1
 * Returns -2 if query returned null
 */
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
		/*!
 * This function returns id of the student by student's name and birthday
 * if Query returns false , function return -1
 * Returns -2 if query returned null
 */
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
			/*!
 * Returns 1 if student's id exists in database
 * if Query returns false , function return -1
 * Returns -2 if query returned null
 */
	function checkStudentId($ID,$dbh){
		$sql = "SELECT id FROM aluno WHERE id='".$ID."'";
		$res = $dbh->query($sql);
		if($res == false)return -1;
		if($res->rowCount()==1)return 1;
		else if($res->rowCount()>1) return -2;
		else return -3;
	}
			/*!
 * Returns 1 if course's id exists in database
 * if Query returns false , function return -1
 * Returns -2 if query returned null
 */
	function checkCourseId($ID,$dbh){
		$sql = "SELECT id FROM curso WHERE id='".$ID."'";
		$res = $dbh->query($sql);
		if($res == false)return -1;
		if($res->rowCount()==1)return 1;
		else if($res->rowCount()>1) return -2;
		else return -3;
	}
				/*!
 * Returns 1 if professor's id exists in database
 * if Query returns false , function return -1
 * Returns -2 if query returned null
 */
	function checkProfessorId($ID,$dbh){
		$sql = "SELECT id FROM professor WHERE id='".$ID."'";
		$res = $dbh->query($sql);
		if($res == false)return -1;
		if($res->rowCount()==1)return 1;
		else if($res->rowCount()>1) return -2;
		else return -3;
	}
				/*!
 * Returns 1 if exists registration by student's id, course's id and  school year
 * if Query returns false , function return -1
 * Returns -3 if query returned null
 */
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
