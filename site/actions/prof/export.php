<?php
	include_once '../../connectBD.php';
	include_once '../../classes/cookie.php';
	$type = getTypeByCookie($dbh);
	if($type<0||$type!=6)die();
	include_once '../../classes/export.php';
	header('Content-Type:application/xml');
	header("Last-Modified: ".gmdate("D, d M Y H:i:s")." GMT");
	header("Cache-Control: no-store, no-cache, must-revalidate");
	header("Cache-Control: post-check=0, pre-check=0", false);
	header("Pragma: no-cache");
	header('Content-Type: application/xml');
	switch($_REQUEST['type']){
		case 1:
			header('Content-Disposition: attachment;filename="Alunos.xml"');
			ob_end_clean();
			exportStudents($dbh);
			break;
		case 2:
			header('Content-Disposition: attachment;filename="Professores.xml"');
			ob_end_clean();
			exportProfessors($dbh);
			break;
		case 3:
			header('Content-Disposition: attachment;filename="Audiações.xml"');
			ob_end_clean();
			exportAditions("../../files/aditions/2015_2016.xml");
			break;
		case 4:
			header('Content-Disposition: attachment;filename="Cursos.xml"');
			ob_end_clean();
			exportCourses($dbh);
			break;
		case 5:
			header('Content-Disposition: attachment;filename="Obras.xml"');
			ob_end_clean();
			exportWorks($dbh);
			break;
		default:
			break;
	}

?>