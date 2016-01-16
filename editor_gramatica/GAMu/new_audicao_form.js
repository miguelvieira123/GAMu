$(document).ready(function () {
    $(function () {
        $(".lined").linedtextarea({});
    });
    // Gramatica
    $("#send_phrase").click(function () {
        t = $('#texto').val();
        $("#msg").empty();
        $.ajax({
            type: "POST",
            url: 'executar_gramatica.php',
            data: {msg: "", phrase: t},
            success: function (data) {
                /*
                $("#msg").append(
                "<p> JSON: " + data +" </p>" // ver 'raw' JSON
                );
                 */
                // remover erros anteriores
                $(".lineno").removeClass("lineselect");
                data = JSON.parse(data);
                var linha_erro = 12;
                for (var i = 0; i < data.msg.length; i++) {
                    // marcar linha com erro
                    var str = data["msg"][i];
                    var patt = new RegExp("line [0-9]+");
                    linha_erro = patt.exec(str);
                    var pos; 
                    if(linha_erro != null){
                        pos = linha_erro[0].indexOf(' ');
                        var num = linha_erro[0].substr(pos+1,linha_erro[0].length);
                        $("#linha_"+num).addClass("lineselect");
                    }
                    $("#msg").append("<p>" + data["msg"][i] + "<p>");
                }
            }
        });
    });
});