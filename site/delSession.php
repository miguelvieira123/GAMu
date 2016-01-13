<?php
	include_once './classes/cookie.php';
	include_once 'connectBD.php';
	$status = delCookie($dbh);
	//setcookie("KEY","");
	header("Location:index.php");
?>