<?php
    ini_set('max_execution_time', 300);
    $dbh = new PDO('mysql:host=127.0.0.1;dbname=gamu', 'usrPRI', 'popo');
    $obras = simplexml_load_file( './dataSets/obras.xml' );
    
    $nObras=0;
    $nRIO=0;
    $nPartituras=0;
    echo "<pre>";
    foreach($obras->obra as $o){
    
    
        $qstring ="INSERT INTO obra(id, nome, descricao, anoCriacao, duracao, id_periodo, id_compositor) 
                            VALUES ('"  .$o['id']."','"
                                        .mysql_real_escape_string($o->nome)."','"
                                        .mysql_real_escape_string($o->desc)."','"
                                        .$o->anoCriacao."','"
                                        .$o->duracao."','"
                                        .$o->periodo."','"
                                        .$o->compositor."')";
        echo $qstring;
        $dbh->query($qstring);
        print_r($dbh->errorInfo());
        
        // INSTRUMENTOS ----------------------------------------------------------------
        //echo "<br/>inserir relacoes obra-instrumento:<br/>";
        $instrumentos = $o->instrumentos;
        foreach($instrumentos->instrumento as $inst){
            $qstring2 = "INSERT INTO obra_instrumento(id_obra, id_instrumento) 
                                VALUES ('"  .$o['id']."','"
                                            .$inst.
                                     "')";
            //echo "   ".$qstring2."<br/>";
            $dbh->query($qstring2);
            //print_r($dbh->errorInfo());
            $nRIO++;
        }
        
        // PARTITURAS ------------------------------------------------------------------
        $partituras = $o->partituras;
        foreach($partituras->partitura as $p){
            //echo "PATH:  ".$path_p ."<br/>";
            //$fp      = fopen($path_p, 'r');
            //$content = fread($fp, filesize($path_p));
            $file_parts = pathinfo($p->ficheiro);
            $content = addslashes(file_get_contents($p->ficheiro));
            $tipo = $file_parts['extension'];
            $qstring2 = "INSERT INTO partitura( id_obra, id_instrumento, ficheiro, tipo, descricao) 
                                    VALUES ('"  .$o['id']."','"
                                                .$p->instrumento."','"
                                                .$content."','"
                                                .$tipo."','"
                                                .basename($p->ficheiro, ".".$tipo)."')";
            //echo "   ".$qstring2."<br/>";
            $dbh->query($qstring2);
            //print_r($dbh->errorInfo());
            $nPartituras++;
        }
        
        
        //echo "------------------------------------------------------------------------<br/>";
        $nObras++;
    }
    //$dbh->close();
    echo "<p>Foram inseridos".$nObras." Obras.</p>";
    echo "<p>Foram inseridos".$nRIO." Relacoes obra_intrumento.</p>";
    echo "<p>Foram inseridos".$nPartituras." Partituras.</p>";
    echo "</pre>";
?>