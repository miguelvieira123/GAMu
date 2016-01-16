<?php
	include_once '../../classes/other.php';
	include_once '../../connectBD.php';
	include_once '../../classes/cookie.php';
	$profile = getTypeByCookie($dbh);
	if($profile!=10){
		header("Location:../../deny.php");
		die();
	}
	if($_REQUEST['login']==""){
		echo "O login não pode ser vasio ...";
		echo "<a class='normLink' onclick=\"setHtml('./html/newUser.php','Alteração do password')\" title=\"Alterar\">Tentar outra vez</a>";
		die();
	}
	else if($_REQUEST['newPass']==""){
		echo "Nova palavra-passe não pode ser vasia ...";
		echo "<a class='normLink' onclick=\"setHtml('./html/newUser.php','Alteração do password')\" title=\"Alterar\">Tentar outra vez</a>";
		die();
	}
	else if ($_REQUEST['newPass']!=$_REQUEST['newPass2']){
		echo "Por favor repite nova  palavra-passe ...";
		echo "<a class='normLink' onclick=\"setHtml('./html/newUser.php','Alteração do password')\" title=\"Alterar\">Tentar outra vez</a>";
		die();
	}
	$users = new Users();
	$status = $users->createNewUser($_REQUEST['login'],$_REQUEST['newPass'],$dbh);
	switch($status){
		case 1:
			echo "O novo utilizador foi criado... ";
			break;
		case -1:
			echo "O id do utilizador não está correto ...";
			echo "<a class='normLink' onclick=\"setHtml('./html/newUser.php','Alteração do password')\" title=\"Alterar\">Tentar outra vez</a>";
			break;
		default:
			echo $status."<br>";
			echo "<a onclick=\"setHtml('./html/newUser.php','Alteração do password')\" title=\"Alterar\">Tentar outra vez</a>";
			break;
	}
?>

