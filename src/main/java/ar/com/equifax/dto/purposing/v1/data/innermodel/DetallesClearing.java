package ar.com.equifax.dto.purposing.v1.data.innermodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Estado;



/**
 * @author lxa145
 *
 */
public class DetallesClearing {


    @JsonProperty("info_fh")
    private Integer infoFh;
    @JsonProperty("importe")
    private Double importe;
    @JsonProperty("estado")
    private Estado estado;
    @JsonProperty("estado_fh")
    private String estadoFh;
    @JsonProperty("comentarios")
    private String comentarios;
    @JsonProperty("operaciones")
    private Operaciones operaciones;


    public Integer getInfoFh() {
        return infoFh;
    }

    public void setInfoFh(Integer infoFh) {
        this.infoFh = infoFh;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getEstadoFh() {
        return estadoFh;
    }

    public void setEstadoFh(String estadoFh) {
        this.estadoFh = estadoFh;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }


    @Override
    public String toString() {
        return "DetallesClearing [infoFh=" + infoFh + ", importe=" + importe
                + ", estado=" + estado + ", estadoFh=" + estadoFh
                + ", comentarios=" + comentarios + ", operaciones="
                + operaciones + "]";
    }



}
