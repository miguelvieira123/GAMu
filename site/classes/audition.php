<?php
	function getAuditions($file,$dbh){
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
			echo "<input type=\"button\" value=\"Alterar\" onClick=\"setHtml('./html/prof/changeAudition.php?id=".(string)$audicao['id']."','Audição')\" />";
			//echo "<input type=\"button\" value=\"Eliminar\" onClick=\"setHtml('./html/prof/delAudition.php?id=".(string)$audicao['id']."','Audição')\" />";
			echo "</fieldset>";
			echo "</div>";
		}
		

	}

	function getLastStudentId($dbh){
		$sql = "SELECT id FROM aluno ORDER BY id DESC LIMIT 1";
		$res = $dbh->query($sql);
		if($res == false)return -1;
		if($res->rowCount()>0){
			foreach($res as $row){
				return substr($row['id'],1,strlen($row['id']));
			}
		}
		else return -2;
	}
	function checkStudent($name,$birthday,$dbh){
		$sql = "SELECT id FROM aluno WHERE nome='".$name."' AND dataNsc='".$birthday."'";
		$res = $dbh->query($sql);
		if($res == false)return -1;
		if($res->rowCount()==1){
			foreach($res as $row){
				return $row['id'];
			}
		}
		else if($res->rowCount()>1) return -2;
		else return -3;
	}
	function checkStudentId($ID,$dbh){
		$sql = "SELECT id FROM aluno WHERE id='".$ID."'";
		$res = $dbh->query($sql);
		if($res == false)return -1;
		if($res->rowCount()==1){
			return 1;
		}
		else if($res->rowCount()>1) return -2;
		else return -3;
	}
	function checkMatricula($idA,$idC,$ano,$dbh){
		$sql = "SELECT id_aluno FROM matricula WHERE id_aluno='".$idA."' AND id_curso='".$idC."' AND anoLetivo='".$ano."'";
		$res = $dbh->query($sql);
		if($res == false)return -1;
		if($res->rowCount()==1){
			return 1;
		}
		else return -3;
	}


?>
