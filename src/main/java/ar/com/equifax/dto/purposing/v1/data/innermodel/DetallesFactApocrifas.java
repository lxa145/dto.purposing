package ar.com.equifax.dto.purposing.v1.data.innermodel;

import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * @author lxa145
 *
 */
public class DetallesFactApocrifas {

    @JsonProperty("deteccion_fh")
    private Integer deteccionFh;
    @JsonProperty("publicacion_fh")
    private Integer publicacionFh;
    @JsonProperty("operaciones")
    private Operaciones operaciones;

    public Integer getDeteccionFh() {
        return deteccionFh;
    }

    public void setDeteccionFh(Integer deteccionFh) {
        this.deteccionFh = deteccionFh;
    }

    public Integer getPublicacionFh() {
        return publicacionFh;
    }

    public void setPublicacionFh(Integer publicacionFh) {
        this.publicacionFh = publicacionFh;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }

    @Override
    public String toString() {
        return "DetallesFactApocrifas [deteccionFh=" + deteccionFh
                + ", publicacionFh=" + publicacionFh + ", operaciones="
                + operaciones + "]";
    }



}
