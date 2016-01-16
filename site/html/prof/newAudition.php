<?php
	include_once '../../connectBD.php';
	include_once '../../classes/cookie.php';
	$type = getTypeByCookie($dbh);
	if($type!=6){
		header("Location:../../deny.php");
		die();
	}
?>
	<h3>Validar Audição</h3>
	<h4>atenção dar creditos aos criadores do jQuery - LINED_TEXTAREA</h4>
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
 titulo: "titulo"
 subtitulo: "subtitulo" 
 tema: "tema da audicao" 
 data: 5-1-2016 
 hora: 15:30
 local: "local da audicao"
 organizador: P13
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
			<fieldset id="responce">
				<legend>Mensagens do Servidor</legend>
				<div id="msg">
				</div>
			</fieldset>
		</form>
	</body>
</html>