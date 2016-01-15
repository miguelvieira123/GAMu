<?php
	function setUserCookie($ID,$dbh){
		$value=$ID. $_SERVER['HTTP_USER_AGENT'].$_SERVER['REMOTE_ADDR']."gamu".time();
		$sql = "UPDATE utilizador SET cookie=MD5('".$value."') WHERE id_perfil='".$ID."'";
		$res = $dbh->query($sql);
		if($res==false)return -2;
		else {
			setcookie("KEY",MD5($value),time()+36000);
			return true;
		}
	}

	function getTypeByCookie($dbh){
		if(array_key_exists("KEY",$_COOKIE)==false)return -1;
		$sql = "SELECT tipo_perfil FROM utilizador WHERE cookie='".$_COOKIE['KEY']."'";
		$res = $dbh->query($sql);
		if($res==false)return -2;
		if($res->rowCount()>0){
			foreach($res as $row){
				return $row['tipo_perfil'];
			}
		}
		else return -3;
	}
	function getIdByCookie($dbh){
		if(array_key_exists("KEY",$_COOKIE)==false)return -1;
		$sql = "SELECT id_perfil FROM utilizador WHERE cookie='".$_COOKIE['KEY']."'";
		$res = $dbh->query($sql);
		if($res==false)return -2;
		if($res->rowCount()>0){
			foreach($res as $row){
				return $row['id_perfil'];
			}
		}
		else return -3;
	}

	function getInfoByCookie($dbh){
		if(array_key_exists("KEY",$_COOKIE)==false)return -1;
		$out = array();
		$sql = "SELECT id_perfil,tipo_perfil FROM utilizador WHERE cookie='".$_COOKIE['KEY']."'";
		$res = $dbh->query($sql);
		if($res==false)return -2;
		if($res->rowCount()>0){
			foreach($res as $row){
				$out['id']=$row['id_perfil'];
				$out['type'] = $row['tipo_perfil'];
				return $out;
			}
		}
		else return -3;
	}
	function delCookie($dbh){
		if(array_key_exists("KEY",$_COOKIE)==false)return -1;
		$sql = "UPDATE utilizador SET cookie='' WHERE cookie='".$_COOKIE['KEY']."'";
		$res = $dbh->query($sql);
		if($res==false)return -2;
		else{
			SetCookie("KEY","");
			return true;
		}
	}

?>
