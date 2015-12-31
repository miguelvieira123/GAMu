<?php
	include_once 'connectBD.php';
	//echo $_REQUEST['id'];
	$usr = $_REQUEST['id'];
	$sql = "SELECT * FROM aluno WHERE id='".$usr."'";

	$sql_inner_join = 	"SELECT * FROM aluno
												INNER JOIN aluno_instrumento ON aluno.id = aluno_instrumento.id_aluno
    										INNER JOIN instrumento ON aluno_instrumento.id_instrumento=instrumento.id
												WHERE aluno.id='A1510'
											";
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



?>
