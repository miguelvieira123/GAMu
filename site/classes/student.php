<?php
  /**
\class Students classes/student.php
*/
class Students{
   /*!
	Returns the name of student in a case of success
	Returns false if in case of failure
	*/
	function getName($stID,$dbh){
		if($stID==NULL)return false;
		$sql = "SELECT nome from aluno where id='".$stID."' limit 1";
		try{
			$res = $dbh->query($sql);
			if($res==false)return false;
			if($res->rowCount()>0){
				foreach($res as $row){
					return $row['nome'];
				}
			}
		}
		catch (PDOException $e) {
    			 return "Error!: " . $e->getMessage();
		}

	}
/*!
	!*Returns the Birthday of student in a case of success
	!*Returns false if in case of failure
	*/
	function getBirthday($stID,$dbh){
		if($stID==NULL)return false;
		$sql = "SELECT dataNsc from aluno where id='".$stID."' limit 1";
		try{
			$res = $dbh->query($sql);
			if($res==false)return false;
			if($res->rowCount()>0){
				foreach($res as $row){
					return $row['dataNsc'];
				}
			}
		}
		catch (PDOException $e) {
    			 return "Error!: " . $e->getMessage();
		}

	}
	 /**
	*Returns student's mail in a case of success
	*Returns false if in case of failure
	*/
	function getMail($stID,$dbh){
		if($stID==NULL)return false;
		$sql = "SELECT mail from aluno where id='".$stID."' limit 1";
		try{
			$res = $dbh->query($sql);
			if($res==false)return false;
			if($res->rowCount()>0){
				foreach($res as $row){
					return $row['mail'];
				}
			}
		}
		catch (PDOException $e) {
    			 return "Error!: " . $e->getMessage();
		}
	}
	 /**
	*Returns  student's mobile number in a case of success
	*Returns false if in case of failure
	*/
	function getMobile($stID,$dbh){
		if($stID==NULL)return "";
		$sql = "SELECT mobile from aluno where id='".$stID."' limit 1";
		try{
			$res = $dbh->query($sql);
			if($res==false)return false;
			if($res->rowCount()>0){
				foreach($res as $row){
					return $row['mobile'];
				}
			}
		}
		catch (PDOException $e) {
    			 return "Error!: " . $e->getMessage();
		}
	}
	 /**
	*Returns  array of instruments by student's id
	*Returns false if in case of failure
	*/
	function getInstruments($stID,$dbh){
		$out = array();
		if($stID==NULL)return $out;
		$i=0;
		$sql = "SELECT instrumento.id as id, instrumento.designacao as name FROM aluno_instrumento, instrumento WHERE instrumento.id=aluno_instrumento.id_instrumento and aluno_instrumento.id_aluno='".$stID."'";
		try{
			$res = $dbh->query($sql);
			if($res==false)return false;
			if($res->rowCount()>0){
				foreach($res as $row){
					$out[$i]['id'] = $row['id'];
					$out[$i]['name']= $row['name'];
					$i++;
				}
				return $out;
			}
			else return $out;
		}
		catch (PDOException $e) {
    			return $out;
		}
	}
	 /**
	*Changes information of student
	*Returns -1 if any field is null
	*Returns -2 if transaction returned false
	*/
	function changeInfoP($stID,$dbh,$name,$birthday,$mail){
		if($stID==NULL||$name==NULL||$birthday==NULL||$mail==NULL)return -1;
		$sql = "UPDATE  aluno set nome='".$name."',dataNsc='".$birthday."',mail='".$mail."' where id='".$stID."'";
		try{
			if($dbh->query($sql)==false)return -2;
			else return 1;
		}
		catch (PDOException $e) {
    			 return "Error!: " . $e->getMessage();
		}
	}
	/**
	*Changes mobile number of student
	*Returns -1 if any field is null
	*Returns -2 if transaction returned false
	*/
	function changeMobile($stID,$dbh,$mobile){
		if($stID==NULL||$mobile==NULL)return -1;
		$sql = "UPDATE  aluno set mobile='".$mobile."' where id='".$stID."'";
		try{
			if($dbh->query($sql)==false)return -2;
			else return 1;
		}
		catch (PDOException $e) {
    			 return "Error!: " . $e->getMessage();
		}
	}
	

}
?>
