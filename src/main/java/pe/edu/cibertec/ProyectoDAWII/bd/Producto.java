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
    private int codigoPRO;

    @Column(name = "nombrePRO")
    private String nombrePRO;

    @Column(name = "descripcionPRO")
    private String descripcionPRO;

    @Column(name = "codigoC")
    private int codigoC;

    @Column(name = "codigoPR")
    private int codigoPR;

    @Column(name = "codigoM")
    private int codigoM;

    @Column(name = "precioPRO")
    private double precioPRO;
    @Column(name = "stockPRO")
    private int stockPRO;




}
