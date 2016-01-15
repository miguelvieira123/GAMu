function setHtml(file,disc)
{

   $.get(file, function onAjaxSuccess(data) {
   	$('#center-heads').html("<span>"+disc+"</span>");
   	$('#center-body').html(data);
   });
}

function ajax(idForm,script,id) {
	var msg = $(idForm).serialize();
	$.ajax({
		type: "POST",
		url: script,
		data: msg,
		success: function(data) {
			$("#center-body").html(data);
		},
		error:  function(xhr, str,data){
			$("#center-body").html(data);
		}
	});
}


function getFile(script){
	window.location.href=script;
}

function Upload(idForm,script) {
	var file = document.getElementById(idForm).files[0];
	var data = new FormData();
	data.append(idForm, file);
	$.ajax({
		type: "POST",
		url: script,
		data: data,
		cache: false,
		processData: false,
		contentType: false,
		success: function(data) {
			$("#center-body").html(data);
		},
		error:  function(xhr, str,data){
			$("#center-body").html(data);
		}
	});
}

function uploadAll(){

	var data = new FormData();
	var file = document.getElementById("f_student").files[0];
	data.append("f_student", file);
	var file = document.getElementById("f_prof").files[0];
	data.append("f_prof", file);
	var file = document.getElementById("f_audition").files[0];
	data.append("f_audition", file);
	var file = document.getElementById("f_course").files[0];
	data.append("f_course", file);
	var file = document.getElementById("f_work").files[0];
	data.append("f_work", file);
	$.ajax({
		type: "POST",
		url: "./actions/prof/import.php",
		data: data,
		cache: false,
		processData: false,
		contentType: false,
		success: function(data) {
			$("#center-body").html(data);
		},
		error:  function(xhr, str,data){
			$("#center-body").html(data);
		}
	});
}
