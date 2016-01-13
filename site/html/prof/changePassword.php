<?php
	$stID = array_key_exists("id", $_REQUEST)?$_REQUEST['id']:"";
?>

	<form id="changePass" method="post" action="javascript:void(0);" onsubmit="ajax('#changePass','./actions/changePassword.php')">
		<h1></h1>
		<fieldset id="change">
			<legend>Alteração de  passe</legend>
			<input type="hidden" name="id" value ="<?php echo $stID;?>">
			<table>
				<tr>
					<td>Último passe:</td><td><input type="password"  name="oldPass" ></td>
				</tr>
				<tr>
					<td>Novo passe:</td><td><input type="password"  name="newPass" ></td>
				</tr>
				<tr>
					<td>Repita novo passe:</td><td><input type="password"  name="newPass2"></td>
				</tr>
			</table>
			<input id="add" type="submit" value="Alterar">
			</fieldset>
	</form>
