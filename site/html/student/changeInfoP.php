<?php
	include_once '../../connectBD.php';
	include_once '../../classes/cookie.php';
	$user = getIdByCookie($dbh);
	if($user == false){
		echo "sessão é blokiada";
		die();
	}
	include_once '../../classes/student.php';
	$st= new Students();
	
?>

	<form id="changeInfoP" action="javascript:void(0);" onsubmit="ajax('#changeInfoP','./actions/changeInfoP.php')" method="post">
		<h1></h1>
		<fieldset id="change">
			<legend>Alteração informação pessoal</legend>
			<table>
				<tr>
					<td>Nome:</td><td><input type="text"  name="name"  value="<?php echo $st->getName($user,$dbh);?>"></td>
				</tr>
				<tr>
					<td>Data de Nascimento:</td><td><input type="text"  name="birthday" value="<?php echo $st->getBirthday($user,$dbh);?>"></td>
				</tr>
				<tr>
					<td>Mail:</td><td><input type="text" name="mail" value="<?php echo $st->getMail($user,$dbh);?>"></td>
				</tr>
				<tr>
					<td>Telemovel:</td><td><input type="text" name="mobile" value="<?php echo $st->getMobile($user,$dbh);?>"></td>
				</tr>
			</table>
			<input id="add" type="submit" value="Alterar">
			</fieldset>
	</form>

