package pe.edu.cibertec.ProyectoDAWII.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ProyectoDAWII.bd.MarcaP;
import pe.edu.cibertec.ProyectoDAWII.repository.MarcaPRepository;

import java.util.List;

@Service
public class MarcaService {

    @Autowired
    private MarcaPRepository marcaPRepository;


    public List<MarcaP> listarMarca(){
        return marcaPRepository.findAll();
    }




}
