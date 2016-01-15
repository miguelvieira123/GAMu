<?php

	include_once '../../connectBD.php';
	include_once '../../classes/cookie.php';
	$user = getIdByCookie($dbh);
	if($user==false){
		echo "sessão é blokiada";
		die();
	}
	include_once '../../classes/professor.php';
	$st = new Professor();
	$birthday = $_REQUEST['year']."-".$_REQUEST['month']."-".$_REQUEST['day'];
	$status = $st->changeInfoP($user,$dbh,$_REQUEST['name'],$birthday,$_REQUEST['mail']);
	$status2 = $st->changeMobile($user,$dbh,$_REQUEST['mobile']);
	switch($status){
		case 1:
			echo "<script>setHtml('./html/prof/infoP.php','Inormação Pessoal');</script>";
			break;
		case -1:
			echo "As formas não podem ser vazias ...";
			echo "<a class='normLink' onclick=\"setHtml('./html/prof/changeInfoP.php','Alteração do password')\" title=\"Alterar\">Tentar outra vez</a>";
			break;
		case -2:
			echo "Accoreu um erro durante exucaçaõ do query...";
			echo "<a class='normLink' onclick=\"setHtml('./html/prof/changeInfoP.php','Alteração do password')\" title=\"Alterar\">Tentar outra vez</a>";
			break;
		default:
			echo $status."<br>";
			echo "<a onclick=\"setHtml('./html/prof/changeInfoP.php','Alteração do password')\" title=\"Alterar\">Tentar outra vez</a>";
			break;
	}

?>

