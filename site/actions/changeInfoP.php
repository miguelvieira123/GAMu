<?php

	include_once '../connectBD.php';
	include_once '../classes/cookie.php';
	$user = getIdByCookie($dbh);
	if($user==false){
		echo "sessão é blokiada";
		die();
	}
	//print_r($_REQUEST);
	//die();
	include_once '../classes/student.php';
	$st = new Students();
	$status = $st->changeInfoP($user,$dbh,$_REQUEST['name'],$_REQUEST['birthday'],$_REQUEST['mail']);
	$status2 = $st->changeMobile($user,$dbh,$_REQUEST['mobile']);
	switch($status){
		case 1:
			echo "<script>setHtml('./html/student/infoP.php','Inormação Pessoal');</script>";
			break;
		case -1:
			echo "As formas não podem ser vazias ...";
			echo "<a class='normLink' onclick=\"setHtml('./html/student/changeInfoP.php','Alteração do password')\" title=\"Alterar\">Tentar outra vez</a>";
			break;
		case -2:
			echo "Accoreu um erro durante exucaçaõ do query...";
			echo "<a class='normLink' onclick=\"setHtml('./html/student/changeInfoP.php','Alteração do password')\" title=\"Alterar\">Tentar outra vez</a>";
			break;
		default:
			echo $status."<br>";
			echo "<a onclick=\"setHtml('./html/student/changeInfoP.php','Alteração do password')\" title=\"Alterar\">Tentar outra vez</a>";
			break;
	}

?>

