package pe.edu.cibertec.ProyectoDAWII.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.ProyectoDAWII.bd.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {
}
