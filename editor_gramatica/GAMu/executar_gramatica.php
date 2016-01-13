<?php
    $vars = $_POST;// melhor seria submeter diretamente o ficheiro para o php
    
    
    //limpar a string que vai ser passada como argumento.
    //$texto = str_replace( "\n", "\\n", $vars["phrase"] );
    //$texto = str_replace( "\"", "\\\"", $texto );
    
    // tornar a string segura
    $texto = mysql_real_escape_string( $vars["phrase"] );
    
    //executar gramatica
    exec("java -jar gramaticaGAMu.jar ". $texto, $out); 
    $i=0;
    foreach($out as $line) {
        $vars["msg"][$i] = $line;
        $i++;
    }
    
    //atribuir id e escrever no ficheiro XML 
    
    
    $vars["phrase"] = $texto;
    //enviar mensagens para o cliente
     echo json_encode($vars);
    
    
?>