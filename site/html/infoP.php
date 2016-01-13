<?php
	include_once '../connectBD.php';
	include_once '../classes/student.php';
	$st= new Students();

?>
<h1>
	<?php
		echo $st->getName($_REQUEST['id'],$dbh);
	?>
</h1>
<h2>
	<?php
		echo $st->getBirthday($_REQUEST['id'],$dbh);
	?>
</h2>
<h2>
	<?php
		echo $st->getMail($_REQUEST['id'],$dbh);
	?>
</h2>
<h2>
	<?php
		echo $st->getMobile($_REQUEST['id'],$dbh);
	?>
</h2>
<ul>
	<?php
		$instrs = $st->getInstruments($_REQUEST['id'],$dbh);
		foreach($instrs as $instr){
			echo "<li>".$instr['name']."</li>";
		}
	?>
</ul>