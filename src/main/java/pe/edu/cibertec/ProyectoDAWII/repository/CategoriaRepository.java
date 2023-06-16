package pe.edu.cibertec.ProyectoDAWII.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.ProyectoDAWII.bd.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {
}
