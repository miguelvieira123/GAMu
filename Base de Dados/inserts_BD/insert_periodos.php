<?php
    $dbh = new PDO('mysql:host=127.0.0.1;dbname=gamu', 'usrPRI', 'popo');
    $periodos = simplexml_load_file( './dataSets/periodos.xml' );
    
    $ninserts=0;
    echo "<pre>";
    foreach($periodos->periodo as $p){
        $qstring ="INSERT INTO periodo(id, designacao) 
                            VALUES ('"  .(string)$p['id']."','"
                                        .(string)$p.
                                  "')";
                                                
        echo $qstring;
        $dbh->query($qstring);
        $ninserts++;
    }
    
    echo "<p>Foram inseridos".$ninserts." periodos na BD.</p>";
    echo "</pre>";
?>