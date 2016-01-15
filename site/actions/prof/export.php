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
	header('Content-Disposition: attachment;filename="Alunos.xml"');
	ob_end_clean();
	switch($_REQUEST['type']){
		case 1:
			exportStudents($dbh);
			break;
		case 2:
			exportStudents($dbh);
			break;
		case 3:
			exportStudents($dbh);
			break;
		case 4:
			exportStudents($dbh);
			break;
		case 5:
			exportStudents($dbh);
			break;
		default:
			break;
	}

?>