<?php
	include_once '../../connectBD.php';
	include_once '../../classes/cookie.php';
	$user = getIdByCookie($dbh);
	if($user==false){
		echo "sessão é bloqueada";
		die();
	}

?>
	<fieldset class="aviso">
		<legend>Criar novo aviso</legend>
		<input type="text" size="44"><br>
		<textarea rows="15" cols="50" name="body"> </textarea><br>
		<input type="button" value="criar" onclick="getFile('./actions/prof/createNews.php')">
	</fieldset>
