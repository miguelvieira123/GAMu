<?php
	function data($str){
		$parte = explode("/", $str);
		$new_data = $parte[2]."/".$parte[1]."/".$parte[0];
		if(@date("Y/m/d")>$new_data)return true;
		else return false;
	}
?>