<?php
    $dbh = new PDO('mysql:host=127.0.0.1;dbname=gamu', 'usrPRI', 'popo');
    $habilitacoes = simplexml_load_file( './dataSets/habilitacoes.xml' );
    
    $ninserts=0;
    echo "<pre>";
    foreach($habilitacoes->habilitacao as $h){
        $qstring ="INSERT INTO habilitacao(id, designacao) 
                            VALUES ('"  .(string)$h['id']."','"
                                        .(string)$h.
                                  "')";
                                                
        echo $qstring;
        $dbh->query($qstring);
        $ninserts++;
    }
    
    echo "<p>Foram inseridos".$ninserts." habilitacoes na BD.</p>";
    echo "</pre>";
?>