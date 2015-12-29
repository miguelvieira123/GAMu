<?php
	if(!array_key_exists("login", $_REQUEST)||!array_key_exists("passwd", $_REQUEST))header("Location:index.html");
	if($_REQUEST['login']==NULL)header("Location:index.html");
	include_once 'connectBD.php';

	$sql = "SELECT * from auth where login='".$_REQUEST['login']."' and passwd='".md5($_REQUEST['passwd'])."' limit 1";
	try{
		$res = $dbh->query($sql);
		$row_count = $res->rowCount();
		if ($row_count>0) {
        		foreach($res as $row) {
        			switch($row['accessLevel']){
        				case '1':
        					$link = "Location:students.php?id=".$row['login'];
        					header($link);
        					break;
        				case 6:
        					$link = "Location:professor.php?id=".$row['login'];
        					header($link);
        					break;
        				default:
        					header("Location:index.html");
        			}
   			}
   		}
   		else {
   			header("Location:index.html");
   		}
   	}
	catch (PDOException $e) {
		print "Error!: " . $e->getMessage() . "<br/>";
		die();
	}
?>