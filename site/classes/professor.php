<?php
  /*!
\class Professor classes/professor.php
*/
class Professor{
	  /*!
	Returns the name of professor in a case of success
	Returns false if in case of failure
	*/
	function getName($profID,$dbh){
		if($profID==NULL)return false;
		$sql = "SELECT nome from professor where id='".$profID."' limit 1";
		try{
			$res = $dbh->query($sql);
			if($res==false)return "Não existe coluna nome na tabela professor";
			if($res->rowCount()>0){
				foreach($res as $row){
					return $row['nome'];
				}
			}
			else return false;
		}
		catch (PDOException $e) {
    			 return "Error!: " . $e->getMessage();
		}

	}
	 /*!
	!*Returns the Birthday of professor in a case of success
	!*Returns false if in case of failure
	*/
	function getBirthday($profID,$dbh){
		if($profID==NULL)return false;
		$sql = "SELECT dataNsc from professor where id='".$profID."' limit 1";
		try{
			$res = $dbh->query($sql);
			if($res==false)return "Não existe coluna dataNsc na tabela professor";
			if($res->rowCount()>0){
				foreach($res as $row){
					return $row['dataNsc'];
				}
			}
			else return false
		}
		catch (PDOException $e) {
    			 return "Error!: " . $e->getMessage();
		}

	}
	  /**
	*Returns professor's mail in a case of success
	*Returns false if in case of failure
	*/
		function getMail($stID,$dbh){
		if($stID==NULL)return false;
		$sql = "SELECT mail from professor where id='".$stID."' limit 1";
		try{
			$res = $dbh->query($sql);
			if($res==false)return "Não existe coluna mail na tabela professor";
			if($res->rowCount()>0){
				foreach($res as $row){
					return $row['mail'];
				}
			}
			else return false;
		}
		catch (PDOException $e) {
    			 return "Error!: " . $e->getMessage();
		}
	}
	 /**
	*Returns  professor's mobile number in a case of success
	*Returns false if in case of failure
	*/
	function getMobile($stID,$dbh){
		if($stID==NULL)return false;
		$sql = "SELECT mobile from professor where id='".$stID."' limit 1";
		try{
			$res = $dbh->query($sql);
			if($res==false)return "Não existe coluna mobile na tabela professor";
			if($res->rowCount()>0){
				foreach($res as $row){
					return $row['mobile'];
				}
			}
			else return false;
		}
		catch (PDOException $e) {
    			 return "Error!: " . $e->getMessage();
		}
	}
	 /**
	Changing professors's name, birthday,mail in the case of success
	*Returns 1 in a case of success
	*Returns -1 if any of atribute is null
	*Returns -2 if transaction returns false
	*/
	function changeInfoP($stID,$dbh,$name,$birthday,$mail){
		if($stID==NULL||$name==NULL||$birthday==NULL||$mail==NULL)return -1;
		$sql = "UPDATE  professor set nome='".$name."',dataNsc='".$birthday."',mail='".$mail."' where id='".$stID."'";
		try{
			if($dbh->query($sql)==false)return -2;
			else return 1;
		}
		catch (PDOException $e) {
    			 return "Error!: " . $e->getMessage();
		}
	}
	 /**
	Changing professors's mobile number in the case of success
	*Returns 1 in a case of success
	*Returns -1 if any of atribute is null
	*Returns -2 if transaction returns false
	*/
	function changeMobile($stID,$dbh,$mobile){
		if($stID==NULL||$mobile==NULL)return -1;
		$sql = "UPDATE  professor set mobile='".$mobile."' where id='".$stID."'";
		try{
			if($dbh->query($sql)==false)return -2;
			else return 1;
		}
		catch (PDOException $e) {
    			 return "Error!: " . $e->getMessage();
		}
	}
	 /**
	*Returns array of courses in the case of success
	*Returns -1 if any of atribute is null
	*Returns -2 if transaction returns false
	*/
	function getCourses($ID,$dbh){
		if($ID==NULL)return -1;
		$out = array();
		$i = 0;
		$sql = "SELECT  id_curso FROM professor_curso WHERE id_professor='".$ID."'";
		try{
			$res = $dbh->query($sql);
			if($res==false)return -2;
			if($res->rowCount()>0){
				foreach($res as $row){
					$out[$i] = $row['id_curso'];
					$i++;
				}
				return $out;
			}
			else return -3;
			
		}
		catch (PDOException $e) {
    			 return "Error!: " . $e->getMessage();
		}
	}

}
?>


