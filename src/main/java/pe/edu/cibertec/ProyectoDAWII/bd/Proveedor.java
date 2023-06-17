package pe.edu.cibertec.ProyectoDAWII.bd;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

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


    @JsonManagedReference
    @OneToMany(mappedBy = "Producto",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Producto> listaProducto = new ArrayList<>();


}
