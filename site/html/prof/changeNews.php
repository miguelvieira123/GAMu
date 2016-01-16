<?php
	include_once '../../connectBD.php';
	include_once '../../classes/cookie.php';
	$user = getInfoByCookie($dbh);
	if($user['type']!=6){
		header ("Location:./deny.php");
		die();
	}

	include_once '../../classes/professor.php';
	include_once '../../classes/other.php';
	$prof = new Professor();
	$avisos = new Users();
	$courses =  $prof->getCourses($user['id'],$dbh);
	if(isset($_REQUEST['id'])){
		$aviso = $avisos->getNewsByID($_REQUEST['id'],$dbh);
	}
	if($aviso['idP']!=$user['id']){
		echo "Voce nao pode alterar este aviso";
		die();
	}
?>
	<fieldset class="aviso">
		<legend>Criar novo aviso</legend>
		<form id="changeNews" action="javascript:void(0);" onsubmit="ajax('#changeNews','./actions/prof/changeNews.php')" method="post">
			<input type="hidden" name="id" value="<?php echo $aviso['id']?>">
			Escolhe curso:
			<select name="curso">
				<option value="FF" 
					<?php 
						if($aviso['id']=="FF")echo  "selected";
					?>
				>Para todos</option>
				<?php
					foreach ($courses as $course){
						echo "<option value='".$course."' ".($course==$aviso['idC']?"selected":"").">".$course."</option>";
					}
				?>
			</select></br>
			Titulo: <input type="text" size="38" name="title" value="<?php echo $aviso['title']?>"><br>
			<textarea rows="15" cols="50" name="body"><?php echo $aviso['text']?> </textarea><br>
			<input type="submit" value="Alterar">
		</form>
	</fieldset>



