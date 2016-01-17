<?php
	include_once '../../connectBD.php';
	include_once '../../classes/cookie.php';
	$user = getIdByCookie($dbh);
	if($user==false){
		echo "sessão é blokiada";
		die();
	}
	include_once '../../classes/student.php';
	include_once '../../classes/other.php';
	include_once '../../classes/audition.php';
	$st= new Students();
	$usr= new Users();
	$avisos = $usr->getNewsByIDA($user,$dbh);
	$i=0;
	echo "<fieldset class='avisos'>";
	echo "<legend>Avisos</legend>";
	foreach($avisos as $aviso){
		echo "<fieldset>";
			echo "<span>CURSO: ".$aviso['idC']."</span>";
			echo "<legend onClick=\"ShowHide('".$i."')\"><a href='#'>".$aviso['title']."</a></legend>";
			echo "<p id='".$i."' style='display:none'>".$aviso['text']."</p>";
		echo "</fieldset>";
	$i++;
	}
	echo "</fieldset>";
	echo "<fieldset class='audicoes'>";
	echo "<legend>Audicoes</legend>";
	$auds = @getIdByStudentId($user,"../../files/auditions/2015_2016.xml","../../schemas/audicoes.xsd");
	$xml = new DomDocument();
	$xml->load("../../files/auditions/2015_2016.xml");
	$res = $xml->schemaValidate("../../schemas/audicoes.xsd");
	if($res == false){
		$error = error_get_last();
		echo substr($error['message'],30,strlen($error['message']));
	}
	$xml = simplexml_load_file("../../files/auditions/2015_2016.xml");
	foreach($auds as $aud){
		$audicoes = $xml->xpath("//audicao[@id='".$aud."']");
		foreach($audicoes as $audicao){
			echo "<fieldset id='".(string)$audicao['id']."'>";
			echo "<legend>".(string)$audicao['id']."</legend>";
			echo "<table>";
			echo "<tr><td>Organizador:</td><td>".(string)$audicao->metainfo->organizador."</td></tr>";
			echo "<tr><td>Tema:</td><td>".(string)$audicao->metainfo->tema."</td></tr>";
			echo "<tr><td>Data:</td><td>".(string)$audicao->metainfo->data."</td></tr>";
			echo "<tr><td>Hora:</td><td>".(string)$audicao->metainfo->hora."</td></tr>";
			echo "<tr><td>Lugar:</td><td>".(string)$audicao->metainfo->local."</td></tr>";
			echo "<tr><td>Duracao:</td><td>".(string)$audicao->metainfo->duracao."</td></tr>";

			echo "</table>";
			echo "<input type=\"button\" value=\"Ver mais\" onClick=\"setHtml('./html/prof/audition.php?id=".(string)$audicao['id']."','Audição')\" />";
			echo "</fieldset>";
			$i++;
		}
	}
	echo "</fieldset>";
?>

		

