<?php
	include_once '../classes/other.php';
	include_once '../connectBD.php';
	
	if($_REQUEST['oldPass']==""){
		echo "Última palavra-passe não pode ser vasia ...";
		echo "<a class='normLink' onclick=\"setHtml('./html/changePassword.php','Alteração do password','".$_REQUEST['id']."')\" title=\"Alterar\">Tentar outra vez</a>";
		die();
	}
	else if($_REQUEST['newPass']==""){
		echo "Nova palavra-passe não pode ser vasia ...";
		echo "<a class='normLink' onclick=\"setHtml('./html/changePassword.php','Alteração do password','".$_REQUEST['id']."')\" title=\"Alterar\">Tentar outra vez</a>";
		die();
	}
	else if ($_REQUEST['newPass']!=$_REQUEST['newPass2']){
		echo "Por favor repite nova  palavra-passe ...";
		echo "<a class='normLink' onclick=\"setHtml('./html/changePassword.php','Alteração do password','".$_REQUEST['id']."')\" title=\"Alterar\">Tentar outra vez</a>";
		die();
	}
	$user = new Users();
	$status = $user->setNewPassword($_REQUEST['id'],$dbh,$_REQUEST['oldPass'],$_REQUEST['newPass']);
	switch($status){
		case 1:
			echo "A vassa palavra-passe foi alterada... ";
			break;
		case -1:
			echo "O id do utilizador não está correto ...";
			echo "<a class='normLink' onclick=\"setHtml('./html/changePassword.php','Alteração do password','".$_REQUEST['id']."')\" title=\"Alterar\">Tentar outra vez</a>";
			break;
		case -2:
			echo "A palavra-passe não está correta...";
			echo "<a class='normLink' onclick=\"setHtml('./html/changePassword.php','Alteração do password','".$_REQUEST['id']."')\" title=\"Alterar\">Tentar outra vez</a>";
			break;
		case -3:
			echo "Acorreu um erro, palavra'passe não foi alterada...";
			echo "<a class='normLink' onclick=\"setHtml('./html/changePassword.php','Alteração do password','".$_REQUEST['id']."')\" title=\"Alterar\">Tentar outra vez</a>";
			break;
		default:
			echo $status."<br>";
			echo "<a onclick=\"setHtml('./html/changePassword.php','Alteração do password','".$_REQUEST['id']."')\" title=\"Alterar\">Tentar outra vez</a>";
			break;
	}
?>

