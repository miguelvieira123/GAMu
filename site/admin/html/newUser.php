
	<form id="newUser" method="post" action="javascript:void(0);" onsubmit="ajax('#newUser','./actions/newUser.php')">
		<h1></h1>
		<fieldset >
			<legend>Criar novo  utilizador</legend>
			<table>
				<tr>
					<td>Login:</td><td><input type="text"  name="login" ></td>
				</tr>
				<tr>
					<td>Novo passe:</td><td><input type="password"  name="newPass" ></td>
				</tr>
				<tr>
					<td>Repita novo passe:</td><td><input type="password"  name="newPass2"></td>
				</tr>
			</table>
			<input id="add" type="submit" value="Adicionar">
			</fieldset>
	</form>

