<?php
	include_once '../../connectBD.php';
	include_once '../../classes/cookie.php';
	$user = getInfoByCookie($dbh);
	if($user['type']!=6){
		header ("Location:./deny.php");
		die();
	}

	include_once '../../classes/other.php';
	$avisos = new Users();
	if(isset($_REQUEST['id'])){
		$aviso = $avisos->changeNews($_REQUEST['id'],$user['id'],$_REQUEST['curso'],$_REQUEST['title'],$_REQUEST['body'],$dbh);
		if($aviso==1)echo "O Aviso foi altarado";
		else echo "O Aviso <span style='color:red'>não</span> foi altarado";
	}
?>



