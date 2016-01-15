	<ul id="menu">
		<li class="l1" onclick="setHtml('./html/student/mainPage.php','Pagina Principal')"><a href="#" title="Pagina Principal">Pagina Principal</a></li>
		<li class="l1" onclick="ShowHide('l21')"><a href="#" title="Info Pessoal">Info Pessoal</a></li>
			<div id="l21">
				<li class="l2" onclick="setHtml('./html/student/infoP.php','Informação Pessoal')"><a href="#" title="Informação Pessoal">Informação Pessoal</a></li>
				<li class="l2" onclick="setHtml('./html/student/changeInfoP.php','Alteração Pessoal')"><a href="#" title="Alterar">Alterar Dados</a></li>
				<li class="l2" onclick="setHtml('./html/changePassword.php','Alteração do password')"><a href="#" title="Alterar">Alterar password</a></li>
			</div>
		<li class="l1" onclick="ShowHide('l22')"><a href="#" title="Atuaçoẽs">Atuaçoẽs</a></li>
			<div id="l22">
				<li class="l2" onclick="setHtml('./html/student/perfomances.php','Atuaçoẽs')"><a href="#" title="Info Pessoal">Consulat</a></li>
			</div>
	</ul>