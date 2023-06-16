package pe.edu.cibertec.ProyectoDAWII.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.cibertec.ProyectoDAWII.service.MarcaService;

@Controller
@RequestMapping("/Marca")
public class MarcaController {


    @Autowired
    private MarcaService marcaService;


    @GetMapping("/frmMantMarca")
    public String frmMantMarca(Model model){
        model.addAttribute("listarMarca", marcaService.listarMarca());
        return "Marca/frmMantMarca";
    }

}
