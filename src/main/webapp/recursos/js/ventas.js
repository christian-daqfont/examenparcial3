$(document).ready(function(){
    listar();
    limpiar();
	
});

function listar(){
    $.get("vc", {"opc":1}, function(data){
        var x= JSON.parse(data);
        console.log(x);
        $("#tablita tbody tr").remove();
        for(var i=0;i<x.length;i++){
            $("#tablita").append("<tr><td>"+(i+1)+"</td><td>"+x[i].nomsucursal+"</td><td>"+x[i].nombre+"</td><td>"+x[i].fecha+"</td><td>"+x[i].tipodoc+"</td><td><a href='#' class='btn btn-danger'>Borrar</a></td></tr>");
        }
    });
    $.get("vc", {"opc":2}, function(data){
        var x= JSON.parse(data);
        console.log(x);
        for(var i=0;i<x.length;i++){
            $("#cliente").append("<option value= "+x[i].idcliente+">"+x[i].nombre+"</option>");
        }
    });
    $.get("vc", {"opc":3}, function(data){
        var x= JSON.parse(data);
        console.log(x);
        for(var i=0;i<x.length;i++){
            $("#sucursal").append("<option value= "+x[i].idsucursal+">"+x[i].nombre+"</option>");
        }
    });
}
function crear() {
    var sucursal = $("#sucursal").val()
    var cliente=$("#cliente").val()
    var fecha=$("#fecha").val()
    var tipodoc=$("#tipodoc").val()
    var param = {"idsucursal":sucursal, "idcliente": cliente, "fecha":fecha, "tipodoc":tipodoc, "opc":4};
    $.ajax({
        data: param,
        url: 'vc',
        type: 'GET',
        success: function(response){
            alert(response);
            listar();
        },
        error: function(jqXHR, estado, error){
        console.log(estado)
        console.log(error)
        },
        complete: function (jqXHR, estado){
                console.log(estado)
        }		
    });
}
function eliminar(id){
	$.get("vc",{"idventa":id,"opc":5},function () {
        listar();
    });
}
function limpiar(){
	
}


