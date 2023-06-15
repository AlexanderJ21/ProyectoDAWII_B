package pe.edu.cibertec.ProyectoDAWII.bd;

import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="MarcaP")
public class MarcaP {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoM;


    @Column(name = "nombreM")
    private String nombreM;


}
