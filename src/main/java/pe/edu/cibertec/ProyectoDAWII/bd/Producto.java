package pe.edu.cibertec.ProyectoDAWII.bd;

import com.fasterxml.jackson.annotation.JsonBackReference;
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

    @JsonBackReference
      @ManyToOne(cascade = CascadeType.PERSIST)
      @JoinColumn(name = "codigoC")
      private Categoria categoria;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "codigoPR")
    private Proveedor proveedor;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "codigoM")
    private MarcaP marcaP;


}
