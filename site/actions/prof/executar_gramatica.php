<?php
	include_once '../../classes/mutex.php';
	include_once '../../connectBD.php';
	include_once '../../classes/cookie.php';
	$prof = getInfoByCookie($dbh);
	if($prof['type']!=6){
		header("Location:../../deny.php");
		die();
	}

	$vars = $_POST;

    $vars["phrase"] = " organizador:".$prof['id']." \n".$vars["phrase"];
	// tornar a string segura
    $texto = mres( $vars["phrase"] );

    //apenas organizador pode mexer na audicao
//-------------------------------------------------------------------------------------------
	$xml = new DomDocument();
	@$xml->load("../../files/auditions/2015_2016.xml");
	$res = @$xml->schemaValidate("../../schemas/audicoes.xsd");
	if($res == false){
		//$error = error_get_last();
		//echo substr($error['message'],30,strlen($error['message']));
		die();
	}
	$xml = simplexml_load_file("../../files/auditions/2015_2016.xml");
	$pattern ='(titulo:(.)*)';
	preg_match($pattern,$vars["phrase"],$res);
	$title = explode("\"", $res[0]);//$title[1] tem nome da audicao
	$organiz = $xml->xpath("//audicao[@id='".$title[1]."']/metainfo/organizador");


	if(sizeof($organiz)>0){
		//Aqui bloco diz que existe audicao com o mesmo nome
		if($organiz[0]['id']!=$prof['id']){
			$vars['msg'][0]="apenas o professor ".$organiz[0]['id']." tem Permissao para alterar";
			echo json_encode($vars);
			die();
		}//se Id do PROF que altera não coincide com o ID do organizador ... para
	}

//não existe audicao, continuar o script
//--------------------------------------------------------------------------------------------


		$mutex = new Mutex("race_1", "mutex.lock");
		if($mutex->isLocked()){
			sleep(0.3);
		}
		$mutex->getLock();
    //executar gramatica
    @exec("java -jar gramaticaGAMu.jar ". $texto, $out);
		$mutex->releaseLock();

    $i=0;
    // recolher prints
    foreach($out as $line) {
        $vars["msg"][$i] = $line;
        $i++;
    }

    //enviar mensagens para o cliente
    echo json_encode($vars);



		// funcoes auxiliares --------------------------------------------
    function mres($value){
        $search = array("\\",  "\x00", "\n",  "\r",  "'",  '"', "\x1a");
        $replace = array("\\\\","\\0","\\n", "\\r", "\'", '\"', "\\Z");
        return str_replace($search, $replace, $value);
    }


?>
