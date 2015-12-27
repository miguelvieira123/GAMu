<?php
    $dbh = new PDO('mysql:host=127.0.0.1;dbname=gamu', 'usrPRI', 'popo');
    $cursos = simplexml_load_file( './dataSets/cursos.xml' );
    
    $ninserts=0;
    echo "<pre>";
    foreach($cursos->curso as $c){
        $qstring ="INSERT INTO curso (id, designacao, duracao, id_instrumento) 
                            VALUES ('"  .$c['id']."','"
                                        .$c->designacao."','"
                                        .$c->duracao."','"
                                        .$c->instrumento.
                                 "')";
                                                
        echo $qstring;
        $dbh->query($qstring);
        $ninserts++;
    }
    
    echo "<p>Foram inseridos".$ninserts." cursos na BD.</p>";
    echo "</pre>";
?>