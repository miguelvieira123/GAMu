<?php

	try {
		$dbh = new PDO('mysql:host=127.0.0.1;dbname=gamu', 'usrPRI', 'popo');
	}
	catch (PDOException $e) {
    		print "Error!: " . $e->getMessage() . "<br/>";
    		die();
	}

  // usr = A1510 ; pass = 123 ;
  $usr = "A1510";
  $pass = "123";
  $tipo = "1";
  $sql = "INSERT INTO utilizador(pass, tipo_perfil, id_perfil)
                  VALUES ('".md5($pass)."','"
                            .$tipo."','"
                            .$usr."')";
  echo $sql;

  try {
		$dbh->query($sql);
	}
	catch (PDOException $e) {
    		print "Error!: " . $e->getMessage() . "<br/>";
    		die();
	}
  echo "<p>tamanho da hash md5 = ".strlen(md5($pass))."</p>";

?>
