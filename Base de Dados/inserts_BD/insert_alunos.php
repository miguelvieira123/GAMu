<?php
    $dbh = new PDO('mysql:host=127.0.0.1;dbname=gamu', 'usrPRI', 'popo');
    $alunos = simplexml_load_file( './dataSets/alunos.xml' );
    $anoLectivo = "2015/2016";
    $ninserts=0;
    echo "<pre>";
    foreach($alunos->aluno as $a){
        $qstring ="INSERT INTO aluno(id, nome, dataNsc) 
                            VALUES ('"  .$a['id']."','"
                                        .$a->nome."','"
                                        .$a->dataNasc.
                                 "')";
        echo $qstring;
        $dbh->query($qstring);
        
        // instrumentos que sabe tocar
        $qstring = "INSERT INTO aluno_instrumento(id_aluno, id_instrumento) 
                            VALUES ('"  .$a['id']."','"
                                        .$a->instrumento."')";
        echo $qstring;
        $dbh->query($qstring);
        
        
        // inserir 1a Matricula 
        $qstring = "INSERT INTO matricula(id_aluno, id_curso, anoLetivo, anoCurso) 
                            VALUES ('"  .$a['id']."','"
                                        .$a->curso."','"
                                        .$anoLectivo."','"
                                        .$a->anoCurso."')";
        
        echo $qstring;
        $dbh->query($qstring);
        
        
        
        
        $ninserts++;
    }
    
    echo "<p>Foram inseridos".$ninserts." alunos na BD.</p>";
    echo "</pre>";
?>