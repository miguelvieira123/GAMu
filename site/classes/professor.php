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

}
?>
