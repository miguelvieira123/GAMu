	<ul id="menu">
		<li class="l1" onclick="setHtml('./html/prof/mainPage.php','Pagina Principal','<?php echo $ID?>')"><a href="#" title="Pagina Principal">Pagina Principal</a></li>
		<li class="l1" onclick="setHtml('./html/prof/infoP.php','Inormação Pessoal','<?php echo $ID?>')"><a href="#" title="Info Pessoal">Info Pessoal</a></li>
			<li class="l2" onclick="setHtml('./html/prof/changeInfoP.php','Alteração Pessoal','<?php echo $ID?>')"><a href="#" title="Alterar">Alterar Dados</a></li>
			<li class="l2" onclick="setHtml('./html/prof/changePassword.php','Alteração do password','<?php echo $ID?>')"><a href="#" title="Alterar">Alterar password</a></li>
		<li class="l1" onclick="setHtml('./html/prof/perfomances.php','Atuaçoẽs','<?php echo $ID?>')"><a href="#" title="Atuaçoẽs">Atuaçoẽs</a></li>
			<li class="l2" onclick="setHtml('./html/prof/mainPage.php','Atuaçoẽs','<?php echo $ID?>')"><a href="#" title="Info Pessoal">Consulat</a></li>
	</ul>