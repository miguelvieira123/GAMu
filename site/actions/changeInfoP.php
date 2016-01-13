<?php
	include_once '../classes/student.php';
	include_once '../connectBD.php';
	$st = new Students();
	$status = $st->changeInfoP($_REQUEST['id'],$dbh,$_REQUEST['name'],$_REQUEST['birthday'],$_REQUEST['mail']);
	$status2 = $st->changeMobile($_REQUEST['id'],$dbh,$_REQUEST['mobile']);
	switch($status){
		case 1:
			echo "<script>setHtml('./html/infoP.php','Inormação Pessoal','".$_REQUEST['id']."');</script>";
			break;
		case -1:
			echo "As formas não podem ser vazias ...";
			echo "<a class='normLink' onclick=\"setHtml('./html/changeInfoP.php','Alteração do password','".$_REQUEST['id']."')\" title=\"Alterar\">Tentar outra vez</a>";
			break;
		case -2:
			echo "Accoreu um erro durante exucaçaõ do query...";
			echo "<a class='normLink' onclick=\"setHtml('./html/changeInfoP.php','Alteração do password','".$_REQUEST['id']."')\" title=\"Alterar\">Tentar outra vez</a>";
			break;
		default:
			echo $status."<br>";
			echo "<a onclick=\"setHtml('./html/changeInfoP.php','Alteração do password','".$_REQUEST['id']."')\" title=\"Alterar\">Tentar outra vez</a>";
			break;
	}

?>

