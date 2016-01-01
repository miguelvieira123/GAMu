<?php
	include_once 'connectBD.php';
	include_once 'functions.php';
	$st = new Student();
	$stID = array_key_exists("id", $_REQUEST)?$_REQUEST['id']:"";
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
				echo $st->getName($stID,$dbh);
				echo "::";
				echo $st->getBirthday($stID,$dbh);
			?>
		</span>
	</div>
	<div id="right-menu">
		<div class="heads">
			<span>Menu</span>
		</div>
	</div>
	<div id="top_center">
		<div class="heads">
			<span>Menu2</span>
		</div>
	</div>
	<div id="center">
		<div class="heads">
			<span>Menu3</span>
		</div>
		<?php
			echo "<ul>";
			$instrs = $st->getInstruments($stID,$dbh);
			foreach($instrs as $instr){
				echo "<li>".$instr['name']."</li>";
			}
			echo "</ul>";
		?>
	</div>
	<div id="left-menu">
		<div class="heads">
			<span>Menu4</span>
		</div>
	</div>

</body>
</html>
