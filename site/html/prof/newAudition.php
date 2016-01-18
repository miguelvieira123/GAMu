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
		<script src="./js/jquery-linedtextarea.js"></script>
        <link href="./css/jquery-linedtextarea.css" type="text/css" rel="stylesheet" />
        <script type="text/javascript" src="./js/new_audicao_form.js" charset="UTF-8"></script>
	</head>
	<body>
		<h3>Validar Audição</h3>
		
		<form accept-charset="UTF-8">
			<fieldset class="GA">
                		<legend>Nova Audição</legend>
				
				<br/>
				texto:
				<textarea id="texto" rows="33" cols="55" class="lined">
 ano-letivo: 2015/2016
 titulo: "titulo"
 subtitulo: "subtitulo" 
 tema: "tema da audicao" 
 data: 5/1/2016 
 hora: 15:30
 local: "local da audicao"
 duracao-maxima: 13:00
 atuacoes:
     grupo: "nome da banda" 
     elementos: A1510,I6
                P11,I15
                A20021,I7
     obras: O1,
            O2,
            O3,
            O4,
            O32
     #
     solo: A1510,I6 
     obras: O22,
            O23
     #    
				</textarea>
				<br />
				<input type="button" value="send phrase" id="send_phrase" />
			</fieldset>
			<fieldset id="responceaa">
				<legend>Mensagens do Servidor</legend>
				<div id="msg">
				</div>
			</fieldset>
		</form>
	</body>
</html>