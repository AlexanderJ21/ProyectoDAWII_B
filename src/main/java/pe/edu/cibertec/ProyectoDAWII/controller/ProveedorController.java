package pe.edu.cibertec.ProyectoDAWII.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.ProyectoDAWII.service.MarcaService;
import pe.edu.cibertec.ProyectoDAWII.service.ProveedorService;

public class ProveedorController {

    @Autowired
    private ProveedorService proveedorService;


    @GetMapping("/frmMantProveedor")
    public String frmMantMarca(Model model){
        model.addAttribute("listarProveedor", proveedorService.listarProveedor());
        return "Proveedor/frmMantProveedor";
    }
}
