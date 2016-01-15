<?php
	include_once '../../connectBD.php';
	include_once '../../classes/cookie.php';
	$type = getTypeByCookie($dbh);
	if($type<0||$type!=6)die();
	include_once '../../classes/import.php';

	if(array_key_exists("f_student",$_FILES)==true){
		if($_FILES['f_student']['error']>0){

			echo "ERROR:".$_FILES['f_student']['error']."<br/>" ;
		}
		else if(substr(strrchr($_FILES['f_student']['name'], '.'), 1)!="xml") echo "O formato do ficheiro tem que ser xml";
		else echo importStudents($_FILES['f_student'],$dbh);
	}
	if(array_key_exists("f_prof",$_FILES)==true){
		if($_FILES['f_prof']['error']>0){

			echo "ERROR:".$_FILES['f_prof']['error']."<br/>" ;
		}
		else if(substr(strrchr($_FILES['f_prof']['name'], '.'), 1)!="xml") echo "O formato do ficheiro tem que ser xml";
	}
	if(array_key_exists("f_audition",$_FILES)==true){
		if($_FILES['f_audition']['error']>0){

			echo "ERROR:".$_FILES['f_audition']['error']."<br/>" ;
		}
		else if(substr(strrchr($_FILES['f_audition']['name'], '.'), 1)!="xml") echo "O formato do ficheiro tem que ser xml";
	}
	if(array_key_exists("f_course",$_FILES)==true){
		if($_FILES['f_course']['error']>0){

			echo "ERROR:".$_FILES['f_course']['error']."<br/>" ;
		}
		else if(substr(strrchr($_FILES['f_course']['name'], '.'), 1)!="xml") echo "O formato do ficheiro tem que ser xml";
	}
	if(array_key_exists("f_work",$_FILES)==true){
		if($_FILES['f_work']['error']>0){

			echo "ERROR:".$_FILES['f_work']['error']."<br/>" ;
		}
		else if(substr(strrchr($_FILES['f_work']['name'], '.'), 1)!="xml") echo "O formato do ficheiro tem que ser xml";
	}

?>