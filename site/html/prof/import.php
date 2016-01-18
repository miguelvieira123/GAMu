<?php
	include_once '../../connectBD.php';
	include_once '../../classes/cookie.php';
	$user = getIdByCookie($dbh);
	if($user==false){
		echo "sessão é bloqueada";
		die();
	}

?>
	<fieldset class="import">
		<legend>Import</legend>
		<form id="import" action="javascript:void(0);" onsubmit="uploadAll()" method="post">
		<table>
			<tr>
				<td>Alunos</td>
				<td>
					<input class="in"  type="button" value="import" onClick="Upload('f_student','./actions/prof/import.php')">
					<input  type="file" multiple="multiple" id="f_student">
				</td>
			</tr>
			<tr>
				<td>Professores</td>
				<td>
					<input class="in"  type="button" value="import" onClick="Upload('f_prof','./actions/prof/import.php')">
					<input type="file" multiple="multiple" id="f_prof">

				</td>
			</tr>
			<tr>
				<td>Audiações</td>
				<td>
					<input class="in"  type="button" value="import" onClick="Upload('f_audition','./actions/prof/import.php')">
					<input  type="file" multiple="multiple" id="f_audition">

				</td>
			</tr>
			<tr>
				<td>Cursos</td>
				<td>
					<input class="in"  type="button" value="import" onClick="Upload('f_course','./actions/prof/import.php')">
					<input  type="file" multiple="multiple" id="f_course">

				</td>

			</tr>
			
		</table>
			<input  class="in1"  type="submit" value="Importar tudo">
		</from>
	</fieldset>

