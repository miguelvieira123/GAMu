$(document).ready( function(){
    
    
    $("#send_phrase").click(function(){
         t = $('#texto').val();
         $("#msg").empty();
         $.ajax({
                type: "POST",
                url: 'executar_gramatica.php',
                data: {msg:"" , phrase:t},
                success: function(data) {
                    /*
                    $("#msg").append(
                        "<p> JSON: " + data +" </p>" // ver 'raw' JSON
                    );
                    */
                    data = JSON.parse(data);
                    for(var i=0; i<data.msg.length ;i++){
                        $("#msg").append("<p><b>msg:</b>"+ data["msg"][i] +"<p>");
                    }
                }
        });
     });
     
     
});