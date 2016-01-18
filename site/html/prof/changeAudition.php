<?php
	include_once '../../connectBD.php';
	include_once '../../classes/cookie.php';
	$type = getTypeByCookie($dbh);
	if($type!=6){
		header("Location:../../deny.php");
		die();
	}
	include_once '../../classes/audition.php';
	$str = getStrOfAdition($_REQUEST['id'],"../../files/auditions/2015_2016.xml","../../schemas/audicoes.xsd");
?>
<html>
	<head>
		<script src="./js/jquery-linedtextarea.js"></script>
        <link href="./css/jquery-linedtextarea.css" type="text/css" rel="stylesheet" />
        <script type="text/javascript" src="./js/new_audicao_form.js" charset="UTF-8"></script>
	</head>
	<body>
		<h3>Validar Audição</h3>
		<form accept-charset="UTF-8">
			<fieldset class="GA">
                		<legend>Nova Audição</legend>
				ano:
				<select id="anoLetivo">
					<option value="2015/2016">2015/2016</option>
					<option value="2014/2015">2014/2015</option>
				</select>
				<br/>
				texto:
				<textarea id="texto" rows="33" cols="55" class="lined">
				<?php echo "\n".$str?>
				</textarea>
				<br />
				<input type="button" value="send phrase" id="send_phrase" />
			</fieldset>
			<fieldset id="responce">
				<legend>Mensagens do Servidor</legend>
				<div id="msg">
				</div>
			</fieldset>
		</form>
	</body>
</html>