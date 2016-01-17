<?php
	include_once '../../connectBD.php';
	include_once '../../classes/cookie.php';
	$type = getTypeByCookie($dbh);
	if($type!=6){
		header("Location:../../deny.php");
		die();
	}
	include_once '../../classes/audition.php';
	print_r($_REQUEST);
?>
