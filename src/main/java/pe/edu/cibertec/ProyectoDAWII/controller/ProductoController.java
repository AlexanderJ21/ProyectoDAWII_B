package pe.edu.cibertec.ProyectoDAWII.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.cibertec.ProyectoDAWII.service.ProductoService;

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


}
