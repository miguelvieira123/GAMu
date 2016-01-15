<?php
class Students{
	function getName($stID,$dbh){
		if($stID==NULL)return "";
		$sql = "SELECT nome from aluno where id='".$stID."' limit 1";
		try{
			$res = $dbh->query($sql);
			if($res==false)return "";
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

	function getBirthday($stID,$dbh){
		if($stID==NULL)return "";
		$sql = "SELECT dataNsc from aluno where id='".$stID."' limit 1";
		try{
			$res = $dbh->query($sql);
			if($res==false)return "";
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
	function getInstruments($stID,$dbh){
		$out = array();
		if($stID==NULL)return $out;
		$i=0;
		$sql = "SELECT instrumento.id as id, instrumento.designacao as name FROM aluno_instrumento, instrumento WHERE instrumento.id=aluno_instrumento.id_instrumento and aluno_instrumento.id_aluno='".$stID."'";
		try{
			$res = $dbh->query($sql);
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
	function getAllStudent(){
		$sql = "SELECT * FROM  aluno";
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
