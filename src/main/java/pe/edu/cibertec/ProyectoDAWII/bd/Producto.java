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
    private Integer codigoPRO;

    @Column(name = "nombrePRO")
    private String nombrePRO;

    @Column(name = "descripcionPRO")
    private String descripcionPRO;



    @Column(name = "precioPRO")
    private Double precioPRO;
    @Column(name = "stockPRO")
    private Integer stockPRO;

      @ManyToOne
      @JoinColumn(name = "codigoC")
      private Categoria categoria;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "codigoPR")
    private Proveedor proveedor;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "codigoM")
    private MarcaP marcaP;


}
