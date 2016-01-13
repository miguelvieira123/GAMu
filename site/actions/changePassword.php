<?php
	include_once '../classes/other.php';
	include_once '../connectBD.php';
	include_once '../classes/cookie.php';
	$user = getIdByCookie($dbh);
	if($user==false){
		echo "sessão é blokiada";
		die();
	}
	if($_REQUEST['oldPass']==""){
		echo "Última palavra-passe não pode ser vasia ...";
		echo "<a class='normLink' onclick=\"setHtml('./html/student/changePassword.php','Alteração do password')\" title=\"Alterar\">Tentar outra vez</a>";
		die();
	}
	else if($_REQUEST['newPass']==""){
		echo "Nova palavra-passe não pode ser vasia ...";
		echo "<a class='normLink' onclick=\"setHtml('./html/student/changePassword.php','Alteração do password')\" title=\"Alterar\">Tentar outra vez</a>";
		die();
	}
	else if ($_REQUEST['newPass']!=$_REQUEST['newPass2']){
		echo "Por favor repite nova  palavra-passe ...";
		echo "<a class='normLink' onclick=\"setHtml('./html/student/changePassword.php','Alteração do password')\" title=\"Alterar\">Tentar outra vez</a>";
		die();
	}
	$users = new Users();
	$status = $users->setNewPassword($user,$dbh,$_REQUEST['oldPass'],$_REQUEST['newPass']);
	switch($status){
		case 1:
			echo "A vassa palavra-passe foi alterada... ";
			break;
		case -1:
			echo "O id do utilizador não está correto ...";
			echo "<a class='normLink' onclick=\"setHtml('./html/student/changePassword.php','Alteração do password')\" title=\"Alterar\">Tentar outra vez</a>";
			break;
		case -2:
			echo "A palavra-passe não está correta...";
			echo "<a class='normLink' onclick=\"setHtml('./html/student/changePassword.php','Alteração do password')\" title=\"Alterar\">Tentar outra vez</a>";
			break;
		case -3:
			echo "Acorreu um erro, palavra'passe não foi alterada...";
			echo "<a class='normLink' onclick=\"setHtml('./html/student/changePassword.php','Alteração do password')\" title=\"Alterar\">Tentar outra vez</a>";
			break;
		default:
			echo $status."<br>";
			echo "<a onclick=\"setHtml('./html/student/changePassword.php','Alteração do password')\" title=\"Alterar\">Tentar outra vez</a>";
			break;
	}
?>

