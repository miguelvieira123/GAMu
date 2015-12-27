<?php
    $dbh = new PDO('mysql:host=127.0.0.1;dbname=gamu', 'usrPRI', 'popo');
    $professores = simplexml_load_file( './dataSets/professores.xml' );
    
    $ninserts=0;
    echo "<pre>";
    foreach($professores->professor as $p){
        $qstring ="INSERT INTO professor(id, nome, dataNsc) 
                            VALUES ('"  .$p['id']."','"
                                        .$p->nome."','"
                                        .$p->dataNasc.
                                 "')";
        echo $qstring;
        $dbh->query($qstring);
        
        // relacao PROFESSOR-CURSO -------------------------------------------
        $qstring = "INSERT INTO professor_curso(id_professor, id_curso) 
                            VALUES ('"  .$p['id']."','"
                                        .$p->curso.
                                 "')";
        echo $qstring;
        $dbh->query($qstring);
        
        // relacao PROFESSOR-HABILITACAO -------------------------------------
        $qstring = "INSERT INTO professor_habilitacao(id_professor, id_habilitacao) 
                            VALUES ('"  .$p['id']."','"
                                        .$p->habilitacoes.
                                 "')";
        echo $qstring;
        $dbh->query($qstring);
        
        
        $ninserts++;
    }
    
    echo "<p>Foram inseridos".$ninserts." professores na BD.</p>";
    echo "</pre>";
?>