<?php
class Users{

	function setNewPassword($userID,$dbh,$oldPass,$newPass){
		if($userID==NULL)return -1;
		$sql = "SELECT pass from utilizador where id_perfil='".$userID."' and pass=MD5('".$oldPass."') limit 1";
		try{
			$res = $dbh->query($sql);
			if($res==false)return -2;
			if($res->rowCount()>0){
				$sql = "UPDATE utilizador set pass=MD5('".$newPass."') where id_perfil='".$userID."'  limit 1";
				$res1 = $dbh->query($sql);
				if($res1==false)return -3;
				else return 1;
			}
			else return -2;
		}
		catch (PDOException $e) {
    			 return "Error!: " . $e->getMessage();
		}

	}
	function createNewUser($id,$pass,$dbh){
		if($id==NULL||$pass==NULL)return -1;
		$sql = "INSERT INTO utilizador values(MD5('".$pass."'),'1','".$id."','');";
		//return $sql;
		$res = $dbh->query($sql);
		if($res==false)return -2;
		else return 1;
	}

	function createNews($idP,$idC,$title,$text,$dbh){
		if($idP==NULL||$idC==NULL||$title==NULL||$text==NULL)return -1;
		$sql = "INSERT INTO news(id_professor,id_curso,titulo,texto) values('".$idP."','".$idC."','".$title."','".$text."');";
		$res = $dbh->query($sql);
		if($res==false)return -2;
		else return 1;
	}
	function changeNews($id,$idP,$idC,$title,$text,$dbh){
		if($id==NULL||$idP==NULL||$idC==NULL||$title==NULL||$text==NULL)return -1;
		$sql = "UPDATE news set id_curso='".$idC."', titulo='".$title."', texto='".$text."' WHERE id=".$id." and id_professor='".$idP."';";
		$res = $dbh->query($sql);
		if($res==false)return -2;
		else return 1;
	}
	function deleteNews($id,$dbh){
		if($id==NULL)return -1;
		$sql = "DELETE FROM news WHERE id=".$id.";";
		$res = $dbh->query($sql);
		if($res==false)return -2;
		else return 1;
	}
	function getNewsByIDP($idP,$dbh){
		$out = array();
		$i = 0;
		if($idP==NULL)return -1;
		$sql = "SELECT id, titulo, id_curso from news WHERE id_professor='".$idP."';";
		//return $sql;
		$res = $dbh->query($sql);
		if($res==false)return -2;
		if($res->rowCount()>0){
			foreach($res as $row){
				$out[$i]['id'] = $row['id'];
				$out[$i]['title'] = $row['titulo'];
				$out[$i]['idC'] = $row['id_curso'];
				$i++;
			}
			return $out;
		}
		else return -3;
	}
	function getNewsByIDA($idA,$dbh){
		$out = array();
		$i = 0;
		if($idA==NULL)return -1;
		$sql = "select news.id_curso, titulo, texto from matricula, news where matricula.id_aluno='".$idA."' and matricula.id_curso=news.id_curso;";
		$res = $dbh->query($sql);
		if($res==false)return -2;
		if($res->rowCount()>0){
			foreach($res as $row){
				$out[$i]['title'] = $row['titulo'];
				$out[$i]['idC'] = $row['id_curso'];
				$out[$i]['text'] = $row['texto'];
				$i++;
			}
			return $out;
		}
		else return -3;
	}
	function getNewsByID($id,$dbh){
		$out = array();
		if($id==NULL)return -1;
		$sql = "SELECT * from news WHERE id='".$id."';";
		//return $sql;
		$res = $dbh->query($sql);
		if($res==false)return -2;
		if($res->rowCount()>0){
			foreach($res as $row){
				$out['id'] = $row['id'];
				$out['title'] = $row['titulo'];
				$out['idC'] = $row['id_curso'];
				$out['text'] = $row['texto'];
				$out['idP'] = $row['id_professor'];
			}
			return $out;
		}
		else return -3;
	}
}

?>
