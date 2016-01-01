<?php
class Student{
	function getName($stID,$dbh){
		if($stID==NULL)return "";
		$sql = "SELECT nome from aluno where id='".$stID."' limit 1";
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

	function getBirthday($stID,$dbh){
		if($stID==NULL)return "";
		$sql = "SELECT dataNsc from aluno where id='".$stID."' limit 1";
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
					//return $row['dataNsc'];
				}
				return $out;
			}
			else return $out;
		}
		catch (PDOException $e) {
    			return $out;
    			 //return "Error!: " . $e->getMessage();
		}
	}

/*	function getQQQ($usr){
		//echo $_REQUEST['id'];
		$usr = $_REQUEST['id'];
		$sql = "SELECT * FROM aluno WHERE id='".$usr."'";

		$sql_inner_join = "SELECT * FROM aluno INNER JOIN aluno_instrumento ON aluno.id = aluno_instrumento.id_aluno INNER JOIN instrumento ON aluno_instrumento.id_instrumento=instrumento.id WHERE aluno.id='A1510'";
		try{
			$result = $dbh->query($sql);
			$result = $result->fetch();
			// informação sobre o aluno
			echo "<br/>id = ".$result['id'];
			echo "<br/>nome = ".$result['nome'];
			echo "<br/>data Nascimento = ".$result['dataNsc'];
			// instrumentos que para os quais tem formação
			$result = $dbh->query($sql_inner_join);
			$result = $result->fetch();
			echo "<br/>id_instrumento = ".$result['id'];
			echo "<br/>designacao instrumento = ".$result['designacao'];

		}catch (PDOException $e) {
			print "Error!: " . $e->getMessage() . "<br/>";
		}
	}*/


}
?>
