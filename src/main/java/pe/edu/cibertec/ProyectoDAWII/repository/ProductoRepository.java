package pe.edu.cibertec.ProyectoDAWII.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.ProyectoDAWII.bd.Producto;

public interface ProductoRepository extends JpaRepository<Producto,Integer> {
}
