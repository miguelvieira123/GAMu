$(document).ready(function () {
    
    
    $(function () {
        $(".lined").linedtextarea({
            selectedLine: 1
        });
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
                
                $("#msg").append(
                "<p> JSON: " + data +" </p>" // ver 'raw' JSON
                );
                 
                // remover erros anteriores
                $(".lineno").removeClass("lineselect");
                data = JSON.parse(data);
                var linha_erro = -1;
                for (var i = 0; i < data.msg.length; i++) {
                    $("#msg").append("<p><b>msg:</b>" + data[ "msg"][i] + "<p>");
                    data.msg.
                    // marcar linha com erro
                    $("#linha_"+linha_erro).addClass("lineselect");
                }
                
            }
        });
    });
});