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
		$atuas = $xml->xpath("//audicao[@id='".$_REQUEST['id']."']/atuacoes//atuacao");

?>
	<div id="<?php echo (string)$aud[0]['id'];?>">
		<fieldset >
			<legend >Meta informação</legend>
			<table>
				<tr>
					<td>Nome:</td>
					<td><?php echo (string)$aud[0]['id'];?></td>
				</tr>
				<tr>
					<td>Organizador:</td>
					<td><?php echo (string)$aud[0]->metainfo->organizador;?></td>
				</tr>
				<tr>
					<td>Data/Hora:</td>
					<td><?php echo (string)$aud[0]->metainfo->data;?>/<?php echo (string)$aud[0]->metainfo->hora;?></td>
				</tr>
				<tr>
					<td>Lugar:</td>
					<td><?php echo (string)$aud[0]->metainfo->local;?></td>
				</tr>
				<tr>
					<td>Duração:</td>
					<td><?php echo (string)$aud[0]->metainfo->duracao;?></td>
				</tr>
			</table>
		</fieldset>
			<?php
				foreach($atuas as $atua){
					if((string)$atua['tipo']=="grupo"){
					echo "<fieldset><legend >Grupo</legend>";
						echo "<table>";
						echo "<tr><td>Nome:</td><td>".(string)$atua->nome_grupo."</td></tr>";
						echo "<tr><td>Hora:</td><td>".(string)$atua->hora_inicio."</td></tr>";
						echo "<tr><td></td><td></td></tr>";
							$i=1;
							foreach($atua->musicos->musico as $musico){
								if ($i==1)echo "<tr><td>Musicos:</td><td>".(string)$musico->nome." ( ".(string)$musico['tipo'].", ".(string)$musico->instrumento." )</td></tr>";
								else echo "<tr><td></td><td>".(string)$musico->nome." ( ".(string)$musico['tipo'].", ".(string)$musico->instrumento." )</td></tr>";
								$i++;
							}
							$i=1;
							echo "<tr><td></td><td></td></tr>";
							foreach($atua->obras->obra as $obra){
								if ($i==1)echo "<tr><td>Obras:</td><td>".(string)$obra->nome." ( ".(string)$obra->duracao." )</td></tr>";
								else echo "<tr><td></td><td>".(string)$obra->nome." ( ".(string)$obra->duracao." )</td></tr>";
								$i++;
							}
						echo "</table>";
					echo "</fieldset>";
					}
					else if ((string)$atua['tipo']=="solo"){
						echo "<fieldset><legend >Solo</legend>";
						echo "<table>";
						echo "<tr><td>Hora:</td><td>".(string)$atua->hora_inicio."</td></tr>";
						echo "<tr><td>Musicos:</td><td>".(string)$musico->nome." ( ".(string)$musico['tipo'].", ".(string)$musico->instrumento." )</td></tr>";
						echo "<tr><td></td><td></td></tr>";
						$i=1;
						foreach($atua->obras->obra as $obra){
								if ($i==1)echo "<tr><td>Obras:</td><td>".(string)$obra->nome." ( ".(string)$obra->duracao." )</td></tr>";
								else echo "<tr><td></td><td>".(string)$obra->nome." ( ".(string)$obra->duracao." )</td></tr>";
								$i++;
							}
						echo "</table>";
					echo "</fieldset>";
					}
				}
			?>
	</div>

