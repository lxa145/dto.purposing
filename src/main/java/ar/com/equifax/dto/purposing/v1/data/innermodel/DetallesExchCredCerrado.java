package ar.com.equifax.dto.purposing.v1.data.innermodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Estado;



/**
 * @author lxa145
 *
 */
public class DetallesExchCredCerrado {

    @JsonProperty("info_fh")
    private Integer infoFh;
    @JsonProperty("importe")
    private Double importe;
    @JsonProperty("estado")
    private Estado estado;
    @JsonProperty("estado_fh")
    private Integer estadoFh;
    @JsonProperty("es_publica")
    private Boolean esPublica;
    @JsonProperty("comentarios")
    private String comentarios;
    @JsonProperty("situacion")
    private String situacion;
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

    public Integer getEstadoFh() {
        return estadoFh;
    }

    public void setEstadoFh(Integer estadoFh) {
        this.estadoFh = estadoFh;
    }

    public Boolean getEsPublica() {
        return esPublica;
    }

    public void setEsPublica(Boolean esPublica) {
        this.esPublica = esPublica;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }


    @Override
    public String toString() {
        return "DetallesExchCredCerrado [infoFh=" + infoFh + ", importe="
                + importe + ", estado=" + estado + ", estadoFh=" + estadoFh
                + ", esPublica=" + esPublica + ", comentarios=" + comentarios
                + ", situacion=" + situacion + ", operaciones=" + operaciones
                + "]";
    }



}
