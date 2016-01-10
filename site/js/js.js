function setHtml(file,disc,id)
{

   $.get(file,{id:id}, function onAjaxSuccess(data) {
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
