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

	<form id="changeInfoP" action="javascript:void(0);" onsubmit="ajax('#changeInfoP','./actions/student/changeInfoP.php')" method="post">
		<h1></h1>
		<fieldset id="change">
			<legend>Alteração informação pessoal</legend>
			<table>
				<tr>
					<td>Nome:</td><td><input type="text"  name="name"  value="<?php echo $st->getName($user,$dbh);?>"></td>
				</tr>
				<tr>
					<td>Data de Nascimento:</td>
					<td>
						<?php
							date_default_timezone_set('Portugal');
							$birthday = $st->getBirthday($user,$dbh);
							list($year,$month, $day) = sscanf($birthday,"%d-%d-%d");
						?>
						<select name="year">
							<?php
								for($i=1930;$i<=getdate()['year'];$i++){

									echo "<option value='".$i."' ".($i==$year?"selected":"").">".$i."</option>";
								}
							?>
						</select>
						<select name="month">
							<?php
								for($i=1;$i<=12;$i++){

									echo "<option value='".$i."' ".($i==$month?"selected":"").">".$i."</option>";
								}
							?>
						</select>
						<select name="day">
							<?php
								for($i=1;$i<=31;$i++){
									echo "<option value='".$i."' ".($i==$day?"selected":"").">".$i."</option>";
								}
							?>
						</select>
					</td>
				</tr>
				<tr>
					<td>Mail:</td>
					<td><input type="text" name="mail" value="<?php echo $st->getMail($user,$dbh);?>"></td>
				</tr>
				<tr>
					<td>Telemovel:</td><td><input type="text" name="mobile" value="<?php echo $st->getMobile($user,$dbh);?>"></td>
				</tr>
			</table>
			<input id="add" type="submit" value="Alterar">
			</fieldset>
	</form>
