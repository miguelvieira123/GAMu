<?php
    $dbh = new PDO('mysql:host=127.0.0.1;dbname=gamu', 'usrPRI', 'popo');
    $compositores = simplexml_load_file( './dataSets/compositores.xml' );
    
    $ninserts=0;
    echo "<pre>";
    foreach($compositores->compositor as $c){
        $qstring ="INSERT INTO compositor(id, nome, dataNsc, dataObt, periodo, bio) 
                            VALUES ('"  .$c['id']."','"
                                        .$c->nome."','"
                                        .$c->dataNasc."','"
                                        .$c->dataObito."','"
                                        .$c->periodo."','"
                                        .$c->bio."')";
        echo $qstring;
        $dbh->query($qstring);
        
        $ninserts++;
    }
    $dbh->close();
    echo "<p>Foram inseridos".$ninserts." compositores na BD.</p>";
    echo "</pre>";
?>