<?php
	include_once '../../connectBD.php';
	include_once '../../classes/cookie.php';
	$type = getInfoByCookie($dbh);
	if($type['type']!=6){
		header("Location:../../deny.php");
		die();
	}
	include_once '../../classes/audition.php';
	$xml = new DomDocument();
		$xml->load("../../files/auditions/2015_2016.xml");
		$res = @$xml->schemaValidate("../../schemas/audicoes.xsd");
		if($res == false){
			$error = error_get_last();
			echo substr($error['message'],30,strlen($error['message']));
		}
		$xml = simplexml_load_file("../../files/auditions/2015_2016.xml");
		$aud = $xml->xpath("//audicao[@id='".$_REQUEST['id']."']/metainfo/organizador");
		echo $aud[0]['id'];
		if($type['if']!=$aud[0]['id']){
			echo "Você não tem acesso para aliminar esta audição";
			die();
		}
		$xml->load("../../files/auditions/2015_2016.xml");
		$xpath = new DOMXpath($xml);
		$node = $xpath->query("//audicao[@id='".$_REQUEST['id']."']");
		$xml->documentElement->removeChild($node[0]);
		$xml->save("../../files/auditions/2015_2016.xml");
?>
