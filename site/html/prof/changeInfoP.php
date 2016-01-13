<?php
	include_once '../../connectBD.php';
	include_once '../../classes/professor.php';
	//include_once '../classes/cookie.php';
	$ID = array_key_exists("id", $_REQUEST)?$_REQUEST['id']:"";
	//if(checkCookie($stID,$dbh)==false)header("Location:index.php");
	$st= new Students();
	//print_r($_COOKIE);
?>

	<form id="changeInfoP" action="javascript:void(0);" onsubmit="ajax('#changeInfoP','./actions/changeInfoP.php')" method="post">
		<h1></h1>
		<fieldset id="change">
			<legend>Alteração informação pessoal</legend>
			<input type="hidden" name="id" value ="<?php echo $ID;?>">
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
				<tr>
					<td>Telemovel:</td><td><input type="text" name="mobile" value="<?php echo $st->getMobile($_REQUEST['id'],$dbh);?>"></td>
				</tr>
			</table>
			<input id="add" type="submit" value="Alterar">
			</fieldset>
	</form>

