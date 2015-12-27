<?php
    $dbh = new PDO('mysql:host=127.0.0.1;dbname=gamu', 'usrPRI', 'popo');
    
    echo "<pre>";
    
    $qstring = "SELECT * FROM curso WHERE 1 ";
    
    $resultado = $dbh->query($qstring);
    
    foreach($resultado as $res){
        echo "id: ".$res[0]." nome: ".$res[1]." duracao: ". $res[2] ." id_instrumento: ".$res[3];
        echo "<br/>";
    }
    
    
    echo "</pre>";
?>