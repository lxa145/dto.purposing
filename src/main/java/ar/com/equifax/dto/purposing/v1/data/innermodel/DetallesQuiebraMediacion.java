package ar.com.equifax.dto.purposing.v1.data.innermodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Estado;



/**
 * @author lxa145
 *
 */
public class DetallesQuiebraMediacion {

    @JsonProperty("info_fh")
    private Integer infoFh;
    @JsonProperty("estado")
    private Estado estado;
    @JsonProperty("estado_fh")
    private Integer estadoFh;
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Integer getEstadoFh() {
        return estadoFh;
    }

    public void setEstadoFh(Integer estadoFh) {
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
        return "DetallesQuiebraMediacion [infoFh=" + infoFh + ", estado="
                + estado + ", estadoFh=" + estadoFh + ", comentarios="
                + comentarios + ", operaciones=" + operaciones + "]";
    }



}
