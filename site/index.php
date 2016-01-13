<?php
	include_once './classes/cookie.php';
	include_once 'connectBD.php';
	$res = checkCookieBD($dbh);
	if($res==false);
	else{
		if($res['type']==1){
			$link = "Location:./students.php?id=".$res['id'];
			header($link);
		}
		else if($res['type']==6){
			$link = "Location:./professor.php?id=".$res['id'];
			header($link);
		}
	}
?>
<DOCTYPE html>
<html>
<head>
	<title></title>
	<meta charset="UTF-8" />
	<link href="./css/auth.css" rel="stylesheet" />
</head>

<body>

<form id="loginForm" action="./auth.php" method="post">

	<div class="field">
		<label>Nome do utilizador:</label>
		<div class="input"><input type="text" name="login" value="" id="login" /></div>
	</div>

	<div class="field">
		<label>Palavra-passa:</label>
		<div class="input"><input type="password" name="passwd" value="" id="pass" /></div>
	</div>

	<div class="submit">
		<button type="submit">Entrar</button>
		<label id="remember"><input name="" type="checkbox" value="" /> Remember me</label>
	</div>

</form>

</body>
</html>