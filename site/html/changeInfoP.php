<?php
	include_once '../connectBD.php';
	include_once '../classes/student.php';
	$st= new Students();
	$stID = array_key_exists("id", $_REQUEST)?$_REQUEST['id']:"";

?>

	<form id="changeInfoP" action="javascript:void(0);" onsubmit="ajax('#changeInfoP','./actions/changeInfoP.php')" method="post">
		<h1></h1>
		<fieldset id="change">
			<legend>Alteração informação pessoal</legend>
			<input type="hidden" name="id" value ="<?php echo $stID;?>">
			<table>
				<tr>
					<td>Nome:</td><td><input type="text"  name="name"  value="<?php echo $st->getName($_REQUEST['id'],$dbh);?>"></td>
				</tr>
				<tr>
					<td>Data de Nascimento:</td><td><input type="text"  name="birthday" value="<?php echo $st->getBirthday($_REQUEST['id'],$dbh);?>"></td>
				</tr>
				<tr>
					<td>Mail:</td><td><input type="text" name="mail" value="<?php echo $st->getMail($_REQUEST['id'],$dbh);?>"></td>
				</tr>
			</table>
			<input id="add" type="submit" value="Alterar">
			</fieldset>
	</form>

