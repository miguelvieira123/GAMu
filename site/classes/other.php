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
}

?>
