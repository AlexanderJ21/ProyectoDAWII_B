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
@Table(name="MarcaP")
public class MarcaP {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoM;


    @Column(name = "nombreM")
    private String nombreM;


    // @JsonManagedReference
    //@OneToMany(mappedBy = "MarcaP",
    //      cascade = CascadeType.ALL,orphanRemoval = true)
    //   private List<Producto> listaProducto = new ArrayList<>();



}
