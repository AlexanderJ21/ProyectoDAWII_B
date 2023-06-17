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
@Table(name="Categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoC;

    @Column(name = "nombreC")
    private String nombreC;

    @Column(name = "descripcionC")
    private String descripcionC;

    @JsonManagedReference
    @OneToMany(mappedBy = "Producto",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Producto> listaProducto = new ArrayList<>();
}
