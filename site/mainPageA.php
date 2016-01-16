<?php
	include_once './connectBD.php';
	include_once './classes/cookie.php';
	$user = getIdByCookie($dbh);
	if($user==false){
		echo "sessão é blokiada";
		die();
	}
	include_once './classes/student.php';
	include_once './classes/other.php';
	$st= new Students();
	$usr= new Users();
	$avisos = $usr->getNewsByIDA($user,$dbh);
	//print_r($avisos);
	foreach($avisos as $aviso){
		echo "<fieldset>";
			echo "<span>CURSO: ".$aviso['idC']."</span>";
			echo "<legend>".$aviso['title']."</legend>";
			echo "<p>".$aviso['text']."</p>";
		echo "</fieldset>";
	}
?>

