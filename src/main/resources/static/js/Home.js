$(document).ready(function(){
     $.ajax({
            type: "POST",
            contentType: "application/json",
            url: "/getRegion",
            dataType: 'json',
            cache: false,
            timeout: 600000,
            success: function (data){
                console.log("SUCCESS : ", data);

                alert(data[0].name);
                alert(data[1].name);
            },
            error: function (e) {
                               console.log("ERROR : ", e);


            }
        });
});