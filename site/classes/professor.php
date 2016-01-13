<?php
class Professor{
	function getName($profID,$dbh){
		if($profID==NULL)return "";
		$sql = "SELECT nome from professor where id='".$profID."' limit 1";
		try{
			$res = $dbh->query($sql);
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

	function getBirthday($profID,$dbh){
		if($profID==NULL)return "";
		$sql = "SELECT dataNsc from professor where id='".$profID."' limit 1";
		try{
			$res = $dbh->query($sql);
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
		function getMail($stID,$dbh){
		if($stID==NULL)return "";
		$sql = "SELECT mail from aluno where id='".$stID."' limit 1";
		try{
			$res = $dbh->query($sql);
			if($res==false)return "Não existe coluna mail na tabela aluno";
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
	function getMobile($stID,$dbh){
		if($stID==NULL)return "";
		$sql = "SELECT mobile from aluno where id='".$stID."' limit 1";
		try{
			$res = $dbh->query($sql);
			if($res==false)return "Não existe coluna mobile na tabela aluno";
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


