<?php
	include_once '../../connectBD.php';
	include_once '../../classes/cookie.php';
	$type = getTypeByCookie($dbh);
	if($type!=6){
		header("Location:../../deny.php");
		die();
	}
	include_once '../../classes/audition.php';
	getAuditions("../../files/auditions/2015_2016.xml",$dbh);
?>
