<?php

	if(!array_key_exists("login", $_REQUEST)||!array_key_exists("passwd", $_REQUEST))header("Location:index.html");
	if($_REQUEST['login']==NULL)header("Location:index.php");
	include_once 'connectBD.php';
	include_once './classes/cookie.php';

	$sql = "SELECT * from utilizador where id_perfil='".$_REQUEST['login']."' and pass='".md5($_REQUEST['passwd'])."' limit 1";
	try{
		$res = $dbh->query($sql);
		$row_count = $res->rowCount();
		if ($row_count>0) {
			setMyCookie($_REQUEST['login'],$dbh);
        		foreach($res as $row) {
        			switch($row['tipo_perfil']){
        				case "1":
        					$link = "Location:students.php?id=".$row['id_perfil'];
        					header($link);
        					break;
        				case "6":
        					$link = "Location:professor.php?id=".$row['id_perfil'];
        					header($link);
        					break;
        				default:
        					header("Location:index.php");
        			}
   			}
   		}
   		else {
   			header("Location:index.php");
   		}
   	}
	catch (PDOException $e) {
		print "Error!: " . $e->getMessage() . "<br/>";
		die();
	}
?>
