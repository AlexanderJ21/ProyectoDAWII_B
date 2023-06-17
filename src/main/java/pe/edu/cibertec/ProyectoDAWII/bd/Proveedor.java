package pe.edu.cibertec.ProyectoDAWII.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="Proveedor")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoPR;

    @Column(name = "nombrePR")
    private String nombrePR;
    @Column(name = "descripcionPR")
    private String descripcionPR;


}
