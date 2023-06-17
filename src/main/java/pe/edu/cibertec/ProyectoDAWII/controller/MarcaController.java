package pe.edu.cibertec.ProyectoDAWII.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pe.edu.cibertec.ProyectoDAWII.bd.MarcaP;
import pe.edu.cibertec.ProyectoDAWII.service.MarcaService;

import java.util.List;

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

    @GetMapping("/listarMarca")
    @ResponseBody
    public List<MarcaP> listarMarca() {

        return marcaService.listarMarca();
    }

}
