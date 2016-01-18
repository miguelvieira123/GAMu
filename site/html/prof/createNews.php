<?php
	include_once '../../connectBD.php';
	include_once '../../classes/cookie.php';
	$user = getIdByCookie($dbh);
	if($user==false){
		echo "sessão é bloqueada";
		die();
	}

	include_once '../../classes/professor.php';
	$prof = new Professor();
	$courses =  $prof->getCourses($user,$dbh);
	//print_r($courses);
?>
	<fieldset class="aviso">
		<legend>Criar novo aviso</legend>
		<form id="createNews" action="javascript:void(0);" onsubmit="ajax('#createNews','./actions/prof/createNews.php')" method="post">
			Escolhe curso:
			<select name="curso">
				
				<?php
					foreach ($courses as $course){
						echo "<option value='".$course."'>".$course."</option>";
					}
				?>
			</select></br>
			Titulo: <input type="text" size="38" name="title"><br>
			<textarea rows="15" cols="50" name="body"> </textarea><br>
			<input type="submit" value="criar">
		</form>
	</fieldset>


	
