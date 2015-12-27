<?php
    $dbh = new PDO('mysql:host=127.0.0.1;dbname=gamu', 'usrPRI', 'popo');
    $alunos = simplexml_load_file( './dataSets/alunos.xml' );
    
    $ninserts=0;
    echo "<pre>";
    foreach($alunos->aluno as $a){
        $qstring ="INSERT INTO aluno(id, nome, dataNsc, id_curso, anoCurso, id_instrumento) 
                            VALUES ('"  .$a['id']."','"
                                        .$a->nome."','"
                                        .$a->dataNasc."','"
                                        .$a->curso."','"
                                        .$a->anoCurso."','"
                                        .$a->instrumento.
                                 "')";
                                                
        echo $qstring;
        $dbh->query($qstring);
        $ninserts++;
    }
    
    echo "<p>Foram inseridos".$ninserts." alunos na BD.</p>";
    echo "</pre>";
?>