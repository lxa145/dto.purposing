package ar.com.equifax.dto.purposing.v1.data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.DetallesFactApocrifas;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;



/**
 * @author lxa145
 *
 */
public class DataFactApocrifas {


    @JsonProperty("estado")
    private String estado;
    @JsonProperty("descripcion")
    private String descripcion;
    @JsonProperty("detalles")
    private List<DetallesFactApocrifas> detalles;
    @JsonProperty("operaciones")
    private Operaciones operaciones;


    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<DetallesFactApocrifas> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallesFactApocrifas> detalles) {
        this.detalles = detalles;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }


    @Override
    public String toString() {
        return "DataFactApocrifas [estado=" + estado + ", descripcion="
                + descripcion + ", detalles=" + detalles + ", operaciones="
                + operaciones + "]";
    }



}
