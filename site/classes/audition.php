<?php
	function getAuditions($file,$idP,$dbh){
		$xml = new DomDocument();
		$xml->load($file);
		$res = @$xml->schemaValidate("../../schemas/audicoes.xsd");
		if($res == false){
			$error = error_get_last();
			echo substr($error['message'],30,strlen($error['message']));
		}
		//$xslt = new XSLTProcessor();
  		//$xsl = new DOMDocument();
  		//$xsl->load("../../schemas/audition.xsl", LIBXML_NOCDATA);
  		//$xslt->importStylesheet($xsl);
 		//echo $xslt->transformToXML($xml);
		
		$xml = simplexml_load_file($file);
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
			if(data((string)$audicao->metainfo->data)==false&&(string)$audicao->metainfo->organizador['id']==$idP)
			echo "<input type=\"button\" value=\"Alterar\" onClick=\"setHtml('./html/prof/changeAudition.php?id=".(string)$audicao['id']."','Audição')\" />";
			if((string)$audicao->metainfo->organizador['id']==$idP)
			echo "<input type=\"button\" value=\"Eliminar\" onClick=\"setHtmlC('./html/prof/consultAudition.php?id=".(string)$audicao['id']."','Audição')\" />";
			echo "<input type=\"button\" value=\"Gerar PDF\" onClick=\"getFile('./html/prof/gerarPDF.php?id=".(string)$audicao['id']."','Audição')\" />";
			echo "</fieldset>";
			echo "</div>";
		}
		

	}

	function data($str){
		$parte = explode("/", $str);
		$new_data = $parte[2]."/".$parte[1]."/".$parte[0];
		if(@date("Y/m/d")>$new_data)return true;
		else return false;
	}

	function delAudition($idAu,$idP){
		$xml = new DomDocument();
		$xml->load("../../files/auditions/2015_2016.xml");
		$res = @$xml->schemaValidate("../../schemas/audicoes.xsd");
		if($res == false){
			$error = error_get_last();
			echo substr($error['message'],30,strlen($error['message']));
		}
		$xml = simplexml_load_file("../../files/auditions/2015_2016.xml");
		$aud = $xml->xpath("//audicao[@id='".$idAu."']/metainfo/organizador");
		if($idP!=$aud[0]['id']){
			echo "Você não tem acesso para aliminar esta audição";
			die();
		}
		$xml = new DomDocument();
		$xml->load("../../files/auditions/2015_2016.xml");
		$xpath = new DOMXpath($xml);
		$node = $xpath->query("//audicao[@id='".$idAu."']");
		$xml->documentElement->removeChild($node[0]);
		$xml->save("../../files/auditions/2015_2016.xml");
	}

	function getIdByStudentId($idA,$xmlF,$xsdF){
		$out= array();
		$i=0;
		$xml = new DomDocument();
		$xml->load($xmlF);
		$res = @$xml->schemaValidate($xsdF);
		if($res == false){
			$error = error_get_last();
			echo substr($error['message'],30,strlen($error['message']));
		}
		$xml = simplexml_load_file($xmlF);
		$auds = $xml->xpath("//audicao");
		foreach ($auds as $aud){
		$ch = false;
			foreach($aud->atuacoes->atuacao as $atu){
				foreach($atu->musicos->musico as $musico){
					if($musico['id']==$idA){
						$out[$i]=$aud['id'];
						$i++;
						$ch=true;
						break;
					}
				}
			if($ch==true)break;
			}
		}
		return $out;
	}
?>
