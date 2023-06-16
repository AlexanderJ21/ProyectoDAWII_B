package pe.edu.cibertec.ProyectoDAWII.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ProyectoDAWII.bd.Categoria;
import pe.edu.cibertec.ProyectoDAWII.repository.CategoriaRepository;
import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> listarCategoria(){
        return categoriaRepository.findAll();
    }

    public void agregarCategoria(Categoria categoria){
        categoriaRepository.save(categoria);
    }

    public  void eliminarCategoria(Categoria categoria){
        categoriaRepository.deleteById(categoria.getCodigoC());
    }

}
