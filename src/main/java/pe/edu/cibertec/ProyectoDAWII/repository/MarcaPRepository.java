package pe.edu.cibertec.ProyectoDAWII.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.ProyectoDAWII.bd.MarcaP;

@Repository
public interface MarcaPRepository extends JpaRepository<MarcaP,Integer> {



}
