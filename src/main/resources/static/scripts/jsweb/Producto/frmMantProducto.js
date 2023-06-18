$(document).on("click","#btnagregar",function(){
$("#hddcodigoPRO").val("0");
$("#txtNombrePRO").val("");
 $("#txtDescripcionPRO").val("");
 $("#txtPrecioPRO").val("");
 $("#hddcodigoC").empty();
 $("#hddcodigoPR").empty();
 $("#hddcodigoM").empty();
 $("#txtStockPRO").val("");
//CATEGORIA
 $.ajax({
    type: "GET",
    url: "/Categoria/listarCategoria",
    dataType: "json",
    success: function(resultado){

      $.each(resultado, function(index,value){
       $("#cboCategoria").append(
       `<option value="{value.codigoC}">${value.nombreC}</option>`
       )
      })
    }
 })
//PROVEEDOR
 $.ajax({
     type: "GET",
     url: "/Proveedor/listarProveedor",
     dataType: "json",
     success: function(resultado){

       $.each(resultado, function(index,value){
        $("#cboProveedor").append(
        `<option value="{value.codigoPR}">${value.nombrePR}</option>`
        )
       })
     }
  })
//MARCA
 $.ajax({
     type: "GET",
     url: "/Marca/listarMarca",
     dataType: "json",
     success: function(resultado){

       $.each(resultado, function(index,value){
        $("#cboMarca").append(
        `<option value="{value.codigoM}">${value.nombreM}</option>`
        )
       })
     }
  })

  $("#modalNuevo").modal("show");
 });



$(document).on("click",".btnActualizar",function(){

$("#hddcodigoPRO").val($(this).attr("data-codigoPRO"));
 $("#txtNombrePRO").val($(this).attr("data-nombrePRO"));
 $("#txtDescripcionPRO").val($(this).attr("data-descripcionPRO"));
 $("#hddcodigoC").val($(this).attr("data-codigoC"));
 $("#hddcodigoPR").val($(this).attr("data-codigoPR"));
 $("#hddcodigoM").val($(this).attr("data-codigoM"));
 $("#cboCategoria").empty();
 $("#cboProveedor").empty();
 $("#cboMarca").empty();
 $("#txtPrecioPRO").val($(this).attr("data-precioPRO"));
 $("#txtStockPRO").val($(this).attr("data-stockPRO"));
 var codigoC = $(this).attr("data-codigoC");
 var codigoPR = $(this).attr("data-codigoPR");
 var codigoM = $(this).attr("data-codigoM");
//CATEGORIA
 $.ajax({
    type: "GET",
    url: "/Categoria/listarCategoria",
    dataType: "json",
    success: function(resultado){

      $.each(resultado, function(index,value){
       $("#cboCategoria").append(
       `<option value="${value.codigoC}">${value.nombreC}</option>`
       )
      })
      $("#cboCategoria").val(codigoC);
    }
 })
//PROVEEDOR
 $.ajax({
     type: "GET",
     url: "/Proveedor/listarProveedor",
     dataType: "json",
     success: function(resultado){

       $.each(resultado, function(index,value){
        $("#cboProveedor").append(
        `<option value="${value.codigoPR}">${value.nombrePR}</option>`
        )
       })
        $("#cboProveedor").val(codigoPR);
     }
  })
//MARCA
 $.ajax({
      type: "GET",
      url: "/Marca/listarMarca",
      dataType: "json",
      success: function(resultado){

        $.each(resultado, function(index,value){
         $("#cboMarca").append(
         `<option value="${value.codigoM}">${value.nombreM}</option>`
         )
        })
         $("#cboMarca").val(codigoM);
      }
   })
   $("#modalNuevo").modal("show");
 });


$(document).on("click","#btnGuardar",function(){
     $.ajax({
     type:"POST",
     url:"/Producto/registrarProducto",
     contentType: "application/json",
     data: JSON.stringify({
     codigoPRO: $("#hddcodigoPRO").val(),
     nombrePRO: $("#txtNombrePRO").val(),
     descripcionPRO: $("#txtDescripcionPRO").val(),
     codigoC: $("#cboCategoria").val(),
     codigoPR: $("#cboProveedor").val(),
     codigoM: $("#cboMarca").val(),
     precioPRO: $("#txtPrecioPRO").val(),
     stockPRO: $("#txtStockPRO").val()
     }),
             success: function(resultado){
            if(resultado.respuesta){
             ListarProductos();
            }
            alert(resultado.mensaje);

             }
     });
     $("#modalNuevo").modal("hide");
 });


function ListarProductos(){

       $ajax({
       type: "GET",
       url:"/Producto/listarProducto",
       dataType: "json",
       success: function(resultado){
       $("#tblProducto > tbody").html("");
       $.each.(resultado, function(index,value)){

              $("#tblProducto > tbody").append("<tr>" +
              "<td>" + value.codigoPRO+"</td">+
               "<td>" + value.nombrePRO+"</td">+
                "<td>" + value.descripcionPRO+"</td">+
                 "<td>" + value.precioPRO+"</td">+
                  "<td>" + value.stockPRO+"</td">+
               "<td>" +
               "<button type='button' class='btn btn-info btnActualizar'"+
                                  "data-codigoPRO='"+value.codigoPRO}"'"+
                                  "data-nombrePRO='"+value.nombrePRO+"'"+
                                  "data-descripcionPRO='"+value.descripcionPRO+"'"+
                                  "data-codigoC='"+value.codigoC+"'"+
                                  "data-codigoPR='"+value.codigoPR+"'"+
                                  "data-codigoM='"+value.codigoM+"'"+
                                  "data-precioPRO='"+value.precioPRO+"'"+
                                  "data-stockPRO='"+value.stockPRO+"'> Actualizar </button>"+
               "</td>"

                  "<td>" +
                              "<button type='button' class='btn btn-danger btneliminar'"+
                                                 "th:data-codigoPRO='"+value.codigoPRO}"'"+
                                                 "th:data-nombrePRO='"+value.nombrePRO+"'> Actualizar </button>"+
                              "</td></tr>"

              );

       }
       }
       })

}
