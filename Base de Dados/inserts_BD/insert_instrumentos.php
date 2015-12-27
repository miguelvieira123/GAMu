<?php
    $dbh = new PDO('mysql:host=127.0.0.1;dbname=gamu', 'usrPRI', 'popo');
    $instrumentos = simplexml_load_file( './dataSets/instrumentos.xml' );
    
    $ninstrumentos=0;
    echo "<pre>";
    foreach($instrumentos->instrumento as $instr){
        $qstring ="INSERT INTO instrumento(id, designacao) 
                            VALUES ('"  .(string)$instr['id']."','"
                                        .(string)$instr.
                                  "')";
                                                
        echo $qstring;
        $dbh->query($qstring);
        $ninstrumentos++;
    }
    
    echo "<p>Foram inseridos".$ninstrumentos." instrumentos na BD.</p>";
    echo "</pre>";
?>