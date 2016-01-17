<?php
	include_once './connectBD.php';
	include_once './classes/cookie.php';
	$type = getTypeByCookie($dbh);
	if($type!=6){
		header("Location:./deny.php");
		die();
	}

		$xml = new DomDocument();
		$xml->load("./files/auditions/2015_2016.xml");
		$res = @$xml->schemaValidate("./schemas/audicoes.xsd");
		if($res == false){
			$error = error_get_last();
			echo substr($error['message'],30,strlen($error['message']));
		}

		$xml = simplexml_load_file("./files/auditions/2015_2016.xml");
		$audicoes = $xml->xpath("//audicao");
		foreach($audicoes as $audicao){
			echo "<div id='listAudition'>";
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
			echo "</div>";
		}

?>
