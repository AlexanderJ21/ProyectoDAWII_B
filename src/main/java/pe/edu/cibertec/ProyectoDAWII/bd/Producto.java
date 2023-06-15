package pe.edu.cibertec.ProyectoDAWII.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="Producto")
public class Producto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoP;

    @Column(name = "nombreP")
    private String nombreP;

    @Column(name = "descripcionP")
    private String descripcionP;

    @Column(name = "codigoC")
    private String codigoC;

    @Column(name = "codigoPr")
    private String codigoPr;

    @Column(name = "precioP")
    private double precioP;
    @Column(name = "stockP")
    private int stockP;

}
