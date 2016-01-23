<?php
	include_once '../../connectBD.php';
	include_once '../../classes/cookie.php';
	$type = getTypeByCookie($dbh);
	if($type!=6){
		header("Location:../../deny.php");
		die();
	}
?>


<html>
	<head>
		<!--
				<script src="./js/jquery-linedtextarea.js"></script>
        <link href="./css/jquery-linedtextarea.css" type="text/css" rel="stylesheet" />
			-->
        <script type="text/javascript" src="./js/load_lines.js" charset="UTF-8"></script>

	</head>
	<body>
		<h3>Validar Audição</h3>
		<p align="center"><input type="button" value="carregar audição exemplo" id="exemplo" /></p>
		<form accept-charset="UTF-8">
			<fieldset class="GA">
      <legend>Nova Audição</legend>
				plano:	<br/>
				<textarea id="texto" rows="33" cols="55" class="lined">
				</textarea>
				<br />
				<input type="button" value="submeter Audicao" id="send_phrase" />

			</fieldset>
			<fieldset id="responceaa">
				<legend>Mensagens do Servidor</legend>
				<div id="msg">
				</div>
				<u>
					<font color="red">
						<div id="erros">
						</div>
					</font>
				</u>
			</fieldset>
		</form>
	</body>
</html>
