<?php
	include_once '../../connectBD.php';
	include_once '../../classes/cookie.php';
	$user = getInfoByCookie($dbh);
	if($user['type']<0||$user['type']!=6)die();
	include_once '../../classes/other.php';
	$usr = new Users();
	$status = $usr->createNews($user['id'],$_REQUEST['curso'],$_REQUEST['title'],$_REQUEST['body'],$dbh);
	if($status==1) echo "O Aviso foi criado!!!";
	else echo "O Aviso <span style='color:red;'>não</span> foi criado!!!";
?>
