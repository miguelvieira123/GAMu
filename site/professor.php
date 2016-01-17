<?php
	include_once 'connectBD.php';
	include_once './classes/cookie.php';
	$user = getInfoByCookie($dbh);
	if($user==-1||$user==-1||$user==-2||$user==-3){
		header("Location:index.php");
		die();
	}
	if($user['type']!=6)header("Location:deny.php");
	include_once './classes/professor.php';
	$prof = new Professor();
?>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title></title>
	<meta charset="UTF-8" />
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
	<link href="./css/css.css" rel="stylesheet" />
	<link href="./css/menu.css" rel="stylesheet" />
	<script src="./js/menu.js" language="JavaScript" type="text/JavaScript"></script>
	<script src="./js/js.js" language="JavaScript" type="text/JavaScript"></script>
</head>

<body>
	<div id="top">
		<span>
			<?php
				echo $prof->getName($user['id'],$dbh);
				echo "::";
				echo $prof->getBirthday($user['id'],$dbh);
			?>
		</span>
		<a class="exit" href="delSession.php">Sair</a>
	</div>
	<div id="right-menu">
		<div id="all-heads">
			<span>Menu</span>
		</div>
		<?php
			include_once 'menuP.php';
		?>
	</div>
	<div id="center">
		<div id="center-heads">
			<span>Pagina Principal</span>
		</div>
		<div id="center-body">
		<?php
			include_once './mainPageP.php';
		?>
		</div>
	</div>
</body>
</html>
