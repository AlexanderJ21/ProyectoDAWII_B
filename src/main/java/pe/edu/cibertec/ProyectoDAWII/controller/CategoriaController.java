package pe.edu.cibertec.ProyectoDAWII.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.cibertec.ProyectoDAWII.service.CategoriaService;

@Controller
@RequestMapping("/Categoria")
public class CategoriaController {


    @Autowired
    private CategoriaService categoriaService;


    @GetMapping("/frmMantCategoria")
    public String frmMantCategoria(Model model){
        model.addAttribute("listarCategoria",categoriaService.listarCategoria());
        return "Categoria/frmMantCategoria";
    }


}
