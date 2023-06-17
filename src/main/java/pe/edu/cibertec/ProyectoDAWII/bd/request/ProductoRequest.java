package pe.edu.cibertec.ProyectoDAWII.bd.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ProductoRequest {
    private Integer codigoPRO;
    private String nombrePRO;
    private String descripcionPRO;
    private Integer codigoC;
    private Integer codigoPR;
    private Integer codigoM;
    private Double precioPRO;
    private Integer stockPRO;

}
