	<ul id="menu">
		<li class="l1" onclick="setHtml('./html/mainPage.php','Pagina Principal','<?php echo $stID?>')"><a href="#" title="Pagina Principal">Pagina Principal</a></li>
		<li class="l1" onclick="setHtml('./html/infoP.php','Inormação Pessoal','<?php echo $stID?>')"><a href="#" title="Info Pessoal">Info Pessoal</a></li>
			<li class="l2" onclick="setHtml('./html/changeInfoP.php','Alteração Pessoal','<?php echo $stID?>')"><a href="#" title="Alterar">Alterar Dados</a></li>
			<li class="l2" onclick="setHtml('./html/changePassword.php','Alteração do password','<?php echo $stID?>')"><a href="#" title="Alterar">Alterar password</a></li>
		<li class="l1" onclick="setHtml('./html/perfomances.php','Atuaçoẽs','<?php echo $stID?>')"><a href="#" title="Atuaçoẽs">Atuaçoẽs</a></li>
			<li class="l2" onclick="setHtml('./html/mainPage.php','Atuaçoẽs','<?php echo $stID?>')"><a href="#" title="Info Pessoal">Consulat</a></li>
	</ul>