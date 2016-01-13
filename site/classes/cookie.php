<?php
	function setUserCookie($ID,$dbh){
		$value=$ID. $_SERVER['HTTP_USER_AGENT'].$_SERVER['REMOTE_ADDR']."gamu".time();
		$sql = "UPDATE utilizador SET cookie=MD5('".$value."') WHERE id_perfil='".$ID."'";
		$res = $dbh->query($sql);
		if($res==false)return false;
		else {
			setcookie("KEY",MD5($value),time()+600);
			return true;
		}
	}

	function getTypeByCookie($dbh){
		if(array_key_exists("KEY",$_COOKIE)==false)return false;
		$sql = "SELECT tipo_perfil FROM utilizador WHERE cookie='".$_COOKIE['KEY']."'";
		$res = $dbh->query($sql);
		if($res==false)return false;
		if($res->rowCount()>0){
			foreach($res as $row){
				return $row['tipo_perfil'];
			}
		}
		else return false;
	}
	function getIdByCookie($dbh){
		if(array_key_exists("KEY",$_COOKIE)==false)return false;
		$sql = "SELECT id_perfil FROM utilizador WHERE cookie='".$_COOKIE['KEY']."'";
		$res = $dbh->query($sql);
		if($res==false)return false;
		if($res->rowCount()>0){
			foreach($res as $row){
				return $row['id_perfil'];
			}
		}
		else return false;
	}

	function getInfoByCookie($dbh){
		if(array_key_exists("KEY",$_COOKIE)==false)return false;
		$out = array();
		$sql = "SELECT id_perfil,tipo_perfil FROM utilizador WHERE cookie='".$_COOKIE['KEY']."'";
		$res = $dbh->query($sql);
		if($res==false)return false;
		if($res->rowCount()>0){
			foreach($res as $row){
				$out['id']=$row['id_perfil'];
				$out['type'] = $row['tipo_perfil'];
				return $out;
			}
		}
		else return false;
	}
	function delCookie($dbh){
		if(array_key_exists("KEY",$_COOKIE)==false)return false;
		$sql = "UPDATE utilizador SET cookie='' WHERE cookie='".$_COOKIE['KEY']."'";
		$res = $dbh->query($sql);
		if($res==false)return false;
		else{
			SetCookie("KEY","");
			return true;
		}
	}

?>
