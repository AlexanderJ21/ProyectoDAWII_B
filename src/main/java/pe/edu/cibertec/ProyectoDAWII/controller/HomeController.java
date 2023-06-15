package pe.edu.cibertec.ProyectoDAWII.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

    @GetMapping("/home")
    public String home(Model model)
    {
        return "home";
    }
}
