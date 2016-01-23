	<ul id="menu">
		<li class="l1" onclick="setHtml('./html/prof/mainPage.php','Pagina Principal')"><a href="#" title="Pagina Principal">Pagina Principal</a></li>
		<li class="l1" onclick="ShowHide('l21')"><a href="#" title="Info Pessoal">Info Pessoal</a></li>
			<div id="l21">
				<li class="l2" onclick="setHtml('./html/prof/infoP.php','Informação Pessoal')"><a href="#" title="Informação Pessoal">Informação Pessoal</a></li>
				<li class="l2" onclick="setHtml('./html/prof/changeInfoP.php','Alteração Pessoal')"><a href="#" title="Alterar">Alterar Dados</a></li>
				<li class="l2" onclick="setHtml('./html/changePassword.php','Alteração do password')"><a href="#" title="Alterar">Alterar password</a></li>
			</div>
		<li class="l1" onclick="ShowHide('l22')"><a href="#" title="Audiações">Audições</a></li>
		<div id="l22">
			<li class="l2" onclick="setHtml('./html/prof/newAudition.php','Criar')"><a href="#" title="Criar">Criar</a></li>
			<li class="l2" onclick="setHtml('./html/prof/consultAudition.php','Consultar')"><a href="#" title="Consultar">Consultar</a></li>
		</div>
		<li class="l1" onclick="setHtml('./html/prof/export.php','Exportar')"><a href="#" title="Exportar">Exportar</a></li>
		<li class="l1" onclick="setHtml('./html/prof/import.php','Importar')"><a href="#" title="Importar">Importar</a></li>

		<li class="l1" onclick="ShowHide('l23')"><a href="#" title="Avisos">Avisos</a></li>
		<div id="l23">
			<li class="l2" onclick="setHtml('./html/prof/createNews.php','Criar aviso')"><a href="#" title="Criar">Criar</a></li>
			<li class="l2" onclick="setHtml('./html/prof/deleteNews.php','Eleminar')"><a href="#" title="Eleminar">Eliminar</a></li>
		</div>


	</ul>
