<?php
    $vars = $_POST;
    
    // tornar a string segura
    $texto = mres( $vars["phrase"] );
    
    //executar gramatica
    exec("java -jar gramaticaGAMu.jar ". $texto, $out); 
    $i=0;
    
    // recolher prints
    foreach($out as $line) {
        $vars["msg"][$i] = $line;
        $i++;
    }

    // abrir ficheiro com 1 audicao apenas    
    // escrever no ficheiro XML audicoes.xml 


    
    $vars["phrase"] = $texto;
    //enviar mensagens para o cliente
     echo json_encode($vars);
    
    
    
    function mres($value){
        $search = array("\\",  "\x00", "\n",  "\r",  "'",  '"', "\x1a");
        $replace = array("\\\\","\\0","\\n", "\\r", "\'", '\"', "\\Z");
        return str_replace($search, $replace, $value);
    }
    
    
?>