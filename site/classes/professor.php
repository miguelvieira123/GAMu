<?php
class Professor{
	function getName($profID,$dbh){
		if($profID==NULL)return "";
		$sql = "SELECT nome from professor where id='".$profID."' limit 1";
		try{
			$res = $dbh->query($sql);
			if($res==false)return "Não existe coluna nome na tabela professor";
			if($res->rowCount()>0){
				foreach($res as $row){
					return $row['nome'];
				}
			}
			else return "";
		}
		catch (PDOException $e) {
    			 return "Error!: " . $e->getMessage();
		}

	}

	function getBirthday($profID,$dbh){
		if($profID==NULL)return "";
		$sql = "SELECT dataNsc from professor where id='".$profID."' limit 1";
		try{
			$res = $dbh->query($sql);
			if($res==false)return "Não existe coluna dataNsc na tabela professor";
			if($res->rowCount()>0){
				foreach($res as $row){
					return $row['dataNsc'];
				}
			}
			else return "";
		}
		catch (PDOException $e) {
    			 return "Error!: " . $e->getMessage();
		}

	}
		function getMail($stID,$dbh){
		if($stID==NULL)return "";
		$sql = "SELECT mail from professor where id='".$stID."' limit 1";
		try{
			$res = $dbh->query($sql);
			if($res==false)return "Não existe coluna mail na tabela professor";
			if($res->rowCount()>0){
				foreach($res as $row){
					return $row['mail'];
				}
			}
			else return "";
		}
		catch (PDOException $e) {
    			 return "Error!: " . $e->getMessage();
		}
	}
	function getMobile($stID,$dbh){
		if($stID==NULL)return "";
		$sql = "SELECT mobile from professor where id='".$stID."' limit 1";
		try{
			$res = $dbh->query($sql);
			if($res==false)return "Não existe coluna mobile na tabela professor";
			if($res->rowCount()>0){
				foreach($res as $row){
					return $row['mobile'];
				}
			}
			else return "";
		}
		catch (PDOException $e) {
    			 return "Error!: " . $e->getMessage();
		}
	}
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

}
?>


