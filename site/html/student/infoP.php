<?php
	include_once '../../connectBD.php';
	include_once '../../classes/cookie.php';
	$user = getIdByCookie($dbh);
	if($user==false){
		echo "sessão é blokiada";
		die();
	}
	include_once '../../classes/student.php';
	$st= new Students();

?>
<h1>
	<?php
		echo $st->getName($user,$dbh);
	?>
</h1>
<h2>
	<?php
		echo $st->getBirthday($user,$dbh);
	?>
</h2>
<h2>
	<?php
		echo $st->getMail($user,$dbh);
	?>
</h2>
<h2>
	<?php
		echo $st->getMobile($user,$dbh);
	?>
</h2>
<ul>
	<?php
		$instrs = $st->getInstruments($user,$dbh);
		foreach($instrs as $instr){
			echo "<li>".$instr['name']."</li>";
		}
	?>
</ul>