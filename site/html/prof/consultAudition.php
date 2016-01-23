<?php
	header('content-type: text/html; charset=utf-8');
	
	include_once '../../connectBD.php';
	include_once '../../classes/cookie.php';
	$user = getInfoByCookie($dbh);
	if($user['type']!=6){
		header("Location:../../deny.php");
		die();
	}
	include_once '../../classes/audition.php';
	if(isset($_REQUEST['id']))delAudition($_REQUEST['id'],$user['id']);
	getAuditions("../../files/auditions/2015_2016.xml",$user['id'],$dbh);
?>
