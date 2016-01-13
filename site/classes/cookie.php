<?php
	function setMyCookie($ID,$dbh){
		$value=$ID. $_SERVER['HTTP_USER_AGENT'].$_SERVER['REMOTE_ADDR']."gamu".time();
		$sql = "UPDATE utilizador SET cookie=MD5('".$value."') WHERE id_perfil='".$ID."'";
		$res = $dbh->query($sql);
		if($res==false)return false;
		else {
			setcookie($ID,MD5($value),time()+600);
			return true;
		}
	}

	function checkCookie($ID,$dbh){
		if(array_key_exists($ID,$_COOKIE)==false)return false;
		$sql = "SELECT id_perfil FROM utilizador WHERE cookie='".$_COOKIE[$ID]."' and id_perfil='".$ID."'";
		$res = $dbh->query($sql);
		if($res==false)return false;
		if($res->rowCount()>0)return true;
		else return false;
	}

	function checkCookieBD($dbh){
		if(sizeof($_COOKIE)<2)return false;
		$out = array();
		$sql = "SELECT id_perfil,tipo_perfil FROM utilizador WHERE cookie=";
		foreach($_COOKIE as $elem){
			$res = $dbh->query($sql."'".$elem."'");
			if($res->rowCount()>0){
				foreach($res as $row){
					$out['id']=$row['id_perfil'];
					$out['type'] = $row['tipo_perfil'];
					return $out;
				}
			}
		return false;
		}
		return false;
	}
	function delCookie($ID){
		if(array_key_exists($ID,$_COOKIE)==false)return false;
		$sql = "UPDATE utilizador SET cookie='' WHERE id_perfil='".$ID."'";
		$res = $dbh->query($sql);
		if($res==false)return false;
		else{
			SetCookie($ID,"");
			return true;
		}
		
	}

?>
