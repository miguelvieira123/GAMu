<?php
    $dbh = new PDO('mysql:host=127.0.0.1;dbname=gamu', 'usrPRI', 'popo');
    $obras = simplexml_load_file( './dataSets/obras.xml' );
    
    $ninserts=0;
    echo "<pre>";
    foreach($obras->obra as $o){
        $qstring ="INSERT INTO obra(id, nome, descricao, anoCriacao, duracao, id_periodo, id_compositor) 
                            VALUES ('"  .$o['id']."','"
                                        .$o->nome."','"
                                        .$o->desc."','"
                                        .$o->anoCriacao."','"
                                        .$o->periodo."','"
                                        .$o->compositor."','"
                                        .$o->duracao."')";
        echo $qstring;
        $dbh->query($qstring);
        
        echo "<br/>inserir relacoes obra-instrumento:<br/>";
        $instrumentos = $o->instrumentos;
        foreach($instrumentos->instrumento as $inst){
            $qstring2 = "INSERT INTO obra_instrumento(id_obra, id_instrumento) 
                                VALUES ('"  .$o['id']."','"
                                            .$inst.
                                     "')";
            echo "   ".$qstring2."<br/>";
            $dbh->query($qstring2);
            print_r($dbh->errorInfo());
        }
        
        echo "------------------------------------------------------------------------<br/>";
        $ninserts++;
    }
    $dbh->close();
    echo "<p>Foram inseridos".$ninserts." cursos na BD.</p>";
    echo "</pre>";
?>