
$(document).ready(function () {
	$(function () {
		$(".lined").linedtextarea({});
	});

	// Gramatica
	$(document).on('click',"#send_phrase", function () {

		t = $('#texto').val();
		$("#msg").empty();
		$("#erros").empty();
		$.ajax({
			type: "POST",
			url: './actions/prof/executar_gramatica.php',
			data: {msg: "", phrase: t},
			success: function (data) {
				$(".lineno").removeClass("lineselect");
				data = JSON.parse(data);
				var linha_erro = -1;
				for (var i = 0; i < data.msg.length; i++) {
					var str = data["msg"][i];
					var patt = new RegExp("line [0-9]+");
					linha_erro = patt.exec(str);
					var pos;
					if(linha_erro != null){
						pos = linha_erro[0].indexOf(' ');
						var num = linha_erro[0].substr(pos+1,linha_erro[0].length);
						$("#linha_"+num).addClass("lineselect");
						$("#erros").append("<p>" + data["msg"][i] + "<p>");
					}else{
						$("#msg").append("<p>" + data["msg"][i] + "<p>");
					}
				}
			}
		});
	});

		$(document).on('click',"#exemplo", function(){
			var exemplo =
                    " ano-letivo: 2015/2016\n" +
                    " titulo: \"Titulo\"\n" +
                    " subtitulo: \"subtitulo\" \n" +
                    " tema: \"tema\" \n" +
                    " data: 20/12/2016\n" +
                    " hora: 13:30\n" +
                    " local: \"local da audicao\"\n" +
                    " duracao-maxima: 13:00\n" +
                    " atuacoes:\n" +
                    "     grupo: \"nome da banda\" \n" +
                    "     elementos: A1510,I66\n" +
                    "                P11,I15\n" +
                    "                A20021,I7\n" +
                    "     obras: O1,\n" +
                    "            O2,\n" +
                    "            O3,\n" +
                    "            O4,\n" +
                    "            O32\n" +
                    "     #\n" +
                    "     solo: A1510,I6 \n" +
                    "     obras: O22,\n" +
                    "            O23\n" +
                    "     #  ";
	     $('#texto').val(exemplo);

		});










});
