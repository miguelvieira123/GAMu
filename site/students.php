<?php
	include_once 'connectBD.php';
	include_once './classes/student.php';
	$st = new Students();
	$stID = array_key_exists("id", $_REQUEST)?$_REQUEST['id']:"";
?>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title></title>
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
				echo $st->getName($stID,$dbh);
				echo "::";
				echo $st->getBirthday($stID,$dbh);
			?>
		</span>
		<a class="exit" href="index.html">Sair</a>
	</div>
	<div id="right-menu">
		<div id="all-heads">
			<span>Menu</span>
		</div>
		<?php
			include_once 'menuS.php';
		?>
	</div>
	<div id="center">
		<div id="center-heads">
			<span>Pagina Principal</span>
		</div>
		<div id="center-body">
		<?php
			include_once './html/mainPage.php';
		?>
		</div>
	</div>

</body>
</html>
