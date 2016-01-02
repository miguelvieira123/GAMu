<?php
	include_once 'connectBD.php';
	include_once './classes/professor.php';
	$prof = new Professor();
	$profID = array_key_exists("id", $_REQUEST)?$_REQUEST['id']:"";
?>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title></title>
	<meta charset="UTF-8" />
	<link href="./css/css.css" rel="stylesheet" />
</head>

<body>
	<div id="top">
		<span>
			<?php
				echo $prof->getName($profID,$dbh);
				echo "::";
				echo $prof->getBirthday($profID,$dbh);
			?>
		</span>
	</div>
	<div id="right-menu">
		<div class="heads">
			<span>Menu</span>
		</div>
	</div>
	<div id="center">
		<div class="heads">
			<span>Menu3</span>
		</div>
	</div>

</body>
</html>
