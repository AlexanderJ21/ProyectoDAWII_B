package pe.edu.cibertec.ProyectoDAWII.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.ProyectoDAWII.bd.Categoria;
import pe.edu.cibertec.ProyectoDAWII.bd.MarcaP;
import pe.edu.cibertec.ProyectoDAWII.bd.Producto;
import pe.edu.cibertec.ProyectoDAWII.bd.Proveedor;
import pe.edu.cibertec.ProyectoDAWII.bd.request.ProductoRequest;
import pe.edu.cibertec.ProyectoDAWII.bd.response.ResultadoResponse;
import pe.edu.cibertec.ProyectoDAWII.service.ProductoService;
import java.util.List;

@Controller
@RequestMapping("/Producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;


    @GetMapping("/frmMantProducto")
    public String frmMantProducto(Model model){
        model.addAttribute("listarProducto" , productoService.listarProducto());
        return "/Producto/frmMantProducto";
    }

    @PostMapping("/registrarProducto")
    @ResponseBody
    public ResultadoResponse registrarProducto(@RequestBody ProductoRequest productoRequest){
        String mensaje = "Producto registrado correctamente";
        Boolean respuesta = true;
        try {
            Producto objProd = new Producto();

            if(productoRequest.getCodigoPRO() > 0 ){
                objProd.setCodigoPRO(productoRequest.getCodigoPRO());
            }

            objProd.setNombrePRO(productoRequest.getNombrePRO());
            objProd.setDescripcionPRO(productoRequest.getDescripcionPRO());
            Categoria objCategoria = new Categoria();
            objCategoria.setCodigoC(productoRequest.getCodigoC());
            Proveedor objProveedor = new Proveedor();
            objProveedor.setCodigoPR(productoRequest.getCodigoPR());
            MarcaP objMarca = new MarcaP();
            objMarca.setCodigoM(productoRequest.getCodigoM());
            objProd.setPrecioPRO(productoRequest.getPrecioPRO());
            objProd.setStockPRO(productoRequest.getStockPRO());

        }catch (Exception ex){
             mensaje = "Producto no registrado";
             respuesta = false;
        }
         return  ResultadoResponse.builder().mensaje(mensaje).respuesta(respuesta).build();
    }
    @DeleteMapping("/eliminarProducto")
    @ResponseBody
    public ResultadoResponse eliminarProducto(@RequestBody ProductoRequest productoRequest){
        String mensaje = "Producto eliminado correctamente";
        Boolean respuesta = true;
        try {
             //productoService.eliminarProducto(productoRequest.getCodigoPRO());
        }catch (Exception ex){
            mensaje = "Producto no eliminado";
            respuesta = false;
        }
        return  ResultadoResponse.builder().mensaje(mensaje).respuesta(respuesta).build();
    }



    @GetMapping("/listarProductos")
    @ResponseBody
    public List<Producto> listarProductos() {

        return productoService.listarProducto();
    }
 }


