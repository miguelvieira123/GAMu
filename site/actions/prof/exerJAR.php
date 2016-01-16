<html >
    <head>
        <meta charset="UTF-8"/>
    </head>

<?php
    
    $myfile = fopen("audicao.txt", "r") or die("Unable to open file!");
    $texto = fread($myfile,filesize("audicao.txt"));
    
    //$vars["msg"] =  exec("java -jar gramaticaGAMu.jar ". $vars["msg"]);
    //echo "<p>". exec("java -jar gramaticaGAMu.jar ".$texto ) ."</p>";
    
    //echo "<br/><p>". $result = var_dump( explode(' ',exec("java -jar gramaticaGAMu.jar ".$texto )) )."</p>";
    
    
    
    $texto = str_replace( "\n", " ", $texto );
    
    $out = array();
    exec("java -jar gramaticaGAMu.jar ". $texto, $out);
    //echo implode("\n", $out);
    foreach($out as $line) {
        echo "<p>".$line."</p>";
    }
    
    
    /*
    exec("ipconfig", $out);
    //echo implode("\n", $out);
    foreach($out as $line) {
        echo "<p>".$line."</p>";
    }*/
    
    
    
    echo "<br/><p>fim</p>";
    
    
?>