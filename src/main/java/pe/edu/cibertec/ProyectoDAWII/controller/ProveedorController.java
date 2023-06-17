package pe.edu.cibertec.ProyectoDAWII.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pe.edu.cibertec.ProyectoDAWII.bd.Proveedor;
import pe.edu.cibertec.ProyectoDAWII.service.ProveedorService;

import java.util.List;

@Controller
@RequestMapping("/Proveedor")
public class ProveedorController {


    @Autowired
    private ProveedorService proveedorService;


    @GetMapping("/frmMantProveedor")
    public String frmMantProveedor(Model model){
        model.addAttribute("listarProveedor",proveedorService.listarProveedor());
        return "Proveedor/frmMantProveedor";
    }

    @GetMapping("/listarProveedor")
    @ResponseBody
    public List<Proveedor> listarProveedor() {

        return proveedorService.listarProveedor();
    }
}
