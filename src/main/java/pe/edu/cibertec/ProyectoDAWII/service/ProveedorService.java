package pe.edu.cibertec.ProyectoDAWII.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ProyectoDAWII.bd.Proveedor;
import pe.edu.cibertec.ProyectoDAWII.repository.ProveedorRepository;
import java.util.List;

@Service
public class ProveedorService {

    @Autowired
    private ProveedorRepository proveedorRepository;

    public List<Proveedor> listarProveedor(){
        return proveedorRepository.findAll();
    }

    public void registrarProveedor(Proveedor proveedor){
        proveedorRepository.save(proveedor);
    }

    public void eliminarProveedor(Proveedor proveedor){
        proveedorRepository.deleteById(proveedor.getCodigoPR());
    }


}
