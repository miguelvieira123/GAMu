<?php
	include_once '../../connectBD.php';
	include_once '../../classes/cookie.php';
	$user = getTypeByCookie($dbh);
	if($user!=6){
		header("Location:../../deny.php");
		die();
	}

?>
	<fieldset class="export">
		<legend>Export</legend>
		<table>
			<tr>
				<td>Alunos</td>
				<td><input type="button" value="Exportar" onclick="getFile('./actions/prof/export.php?type=1')"></td>
			</tr>
			<tr>
				<td>Professores</td>
				<td><input type="button" value="Exportar" onclick="getFile('./actions/prof/export.php?type=2')"></td>
			</tr>
			<tr>
				<td>Audiações</td>
				<td><input type="button" value="Exportar" onclick="getFile('./actions/prof/export.php?type=3')"></td>
			</tr>
			<tr>
				<td>Cursos</td>
				<td><input type="button" value="Exportar" onclick="getFile('./actions/prof/export.php?type=4')"></td>

			</tr>
			<tr>
				<td>Obras</td>
				<td><input type="button" value="Exportar" onclick="getFile('./actions/prof/export.php?type=5')"></td>

			</tr>
		</table>
	</fieldset>
