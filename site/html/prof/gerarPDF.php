<?php
	include_once '../../connectBD.php';
	include_once '../../classes/cookie.php';
	$type = getInfoByCookie($dbh);
	if($type['type']<0){
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
	$aud = $xml->xpath("//audicao[@id='".$_REQUEST['id']."']");
	$xml = new DOMDocument();
  	$xml->loadXML($aud[0]->asXML());
  	
	header('Content-Type:application/xml');
	header("Last-Modified: ".gmdate("D, d M Y H:i:s")." GMT");
	header("Cache-Control: no-store, no-cache, must-revalidate");
	header("Cache-Control: post-check=0, pre-check=0", false);
	header("Pragma: no-cache");
	header('Content-Type: application/xml');
	header('Content-Disposition: attachment;filename="Audicao.xml"');
	ob_end_clean();
 	
	$xml->save("php://output");
	
	
	
	
	/*
	$xslt = new XSLTProcessor();
  	$xsl = new DOMDocument();
  	$xsl->load("../../audicoes2PDF.xsl", LIBXML_NOCDATA);
  	$xslt->importStylesheet($xsl);
 	header('Content-Type:application/pdf');
	header("Last-Modified: ".gmdate("D, d M Y H:i:s")." GMT");
	header("Cache-Control: no-store, no-cache, must-revalidate");
	header("Cache-Control: post-check=0, pre-check=0", false);
	header("Pragma: no-cache");
	header('Content-Type: application/xml');
	header('Content-Disposition: attachment;filename="Audicao.pdf"');
	ob_end_clean();
 	//echo $xslt->transformToXML($xml);
 	$pdf = $xslt->transformToXML($xml);
	file_put_contents("./aa.pdf", $pdf);
 	//$pdf->save('php://output');
 	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
?>
