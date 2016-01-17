<?php
	include_once '../../connectBD.php';
	include_once '../../classes/cookie.php';
	$user = getInfoByCookie($dbh);
	if($user['type']!=6){
		header("Location:./deny.php");
		die();
	}
	include_once '../../classes/other.php';
	$usr = new Users();
	if(isset($_REQUEST['id'])){
		$usr->deleteNews($_REQUEST['id'],$dbh);
	}
	$avisos =  $usr->getNewsByIDP($user['id'],$dbh);
?>
	<fieldset class="delNews">
		<legend>Lista dos avisos</legend>
		<?php
			$i = 1;
			foreach($avisos as $aviso){
				echo "<input type=\"button\" value=\"Alterar\" onClick=\"setHtml('./html/prof/changeNews.php?id=".$aviso['id']."','Eleminar')\">";
				echo "<input type=\"button\" value=\"eleminar\" onClick=\"setHtmlC('./html/prof/deleteNews.php?id=".$aviso['id']."','Eleminar')\">";
				echo $i."-CURSO:".($aviso['idC']=="FF"?"Todos":$aviso['idC'])."(".$aviso['title'].")</br>";
			$i++;
			}
		?>
	</fieldset>


	
