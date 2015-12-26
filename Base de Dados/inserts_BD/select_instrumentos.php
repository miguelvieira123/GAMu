<?php
    $dbh = new PDO('mysql:host=127.0.0.1;dbname=gamu', 'usrPRI', 'popo');
    
    echo "<pre>";
    
    $qstring = "SELECT * FROM instrumento WHERE 1 ORDER BY designacao";
    
    $resultado = $dbh->query($qstring);
    
    foreach($resultado as $res){
        echo "id: ".$res[0]." nome: ".$res[1];
        echo "<br/>";
    }
    
    
    echo "</pre>";
?>