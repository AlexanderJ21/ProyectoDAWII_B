package pe.edu.cibertec.ProyectoDAWII.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.ProyectoDAWII.bd.Proveedor;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor,Integer> {


}
