package pe.edu.cibertec.ProyectoDAWII.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ProyectoDAWII.bd.Producto;
import pe.edu.cibertec.ProyectoDAWII.repository.ProductoRepository;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;


    public List<Producto> listarProducto(){
        return productoRepository.findAll();
    }

      public void agregarProducto(Producto producto){
         productoRepository.save(producto);
      }

      public void eliminarProducto(Producto producto){
         productoRepository.deleteById(producto.getCodigoPRO());
      }

}
