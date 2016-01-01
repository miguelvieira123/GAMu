<?php
class Student{
	function getName($stID,$dbh){
		if($stID==NULL)return "";
		$sql = "SELECT nome from aluno where id='".$stID."' limit 1";
		try{
			$res = $dbh->query($sql);
			if($res->rowCount()>0)
				foreach($res as $row){
					return $row['nome'];
				}
		}
		catch (PDOException $e) {
    			 return "Error!: " . $e->getMessage();
		}

	}

	function getBirthday($stID,$dbh){
		if($stID==NULL)return "";
		$sql = "SELECT dataNsc from aluno where id='".$stID."' limit 1";
		try{
			$res = $dbh->query($sql);
			if($res->rowCount()>0)
				foreach($res as $row){
					return $row['dataNsc'];
				}
		}
		catch (PDOException $e) {
    			 return "Error!: " . $e->getMessage();
		}

	}
}

?>