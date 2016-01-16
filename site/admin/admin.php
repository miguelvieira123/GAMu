<?php
	include_once '../connectBD.php';
	include_once '../classes/cookie.php';
	$user = getInfoByCookie($dbh);
	if($user==-1||$user==-2||$user==-3){
		header("Location:index.php");
		die();
	}
	if($user['type']!=10)header("Location:deny.php");

?>
<!DOCTYPE html>
<html>
<head>
	<title></title>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
	<link href="../css/css.css" rel="stylesheet" />
	<link href="../css/menu.css" rel="stylesheet" />
	<script src="../js/menu.js" language="JavaScript" type="text/JavaScript"></script>
	<script src="../js/js.js" language="JavaScript" type="text/JavaScript"></script>
</head>

<body>
	<div id="top">
		<span>
		Administrador
		</span>
		<a class="exit" href="../delSession.php">Sair</a>
	</div>
	<div id="right-menu">
		<div id="all-heads">
			<span>Menu</span>
		</div>
		<?php
			include_once 'menuA.php';
		?>
	</div>
	<div id="center">
		<div id="center-heads">
			<span>Pagina Principal</span>
		</div>
		<div id="center-body">
		</div>
	</div>

</body>
</html>
