package ar.com.equifax.dto.purposing.v1.data.innermodel;

import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * @author lxa145
 *
 */
public class DetallesExchSalud {

    @JsonProperty("info_fh")
    private Integer infoFh;
    @JsonProperty("moneda")
    private String moneda;
    @JsonProperty("importe")
    private Double importe;
    @JsonProperty("estado")
    private String estado;
    @JsonProperty("porc_uso")
    private Integer porcUso;
    @JsonProperty("nivel_de_uso")
    private String nivelDeUso;
    @JsonProperty("operaciones")
    private Operaciones operaciones;


    public Integer getInfoFh() {
        return infoFh;
    }

    public void setInfoFh(Integer infoFh) {
        this.infoFh = infoFh;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getPorcUso() {
        return porcUso;
    }

    public void setPorcUso(Integer porcUso) {
        this.porcUso = porcUso;
    }

    public String getNivelDeUso() {
        return nivelDeUso;
    }

    public void setNivelDeUso(String nivelDeUso) {
        this.nivelDeUso = nivelDeUso;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }


    @Override
    public String toString() {
        return "DetallesExchSalud [infoFh=" + infoFh + ", moneda=" + moneda
                + ", importe=" + importe + ", estado=" + estado + ", porcUso="
                + porcUso + ", nivelDeUso=" + nivelDeUso + ", operaciones="
                + operaciones + "]";
    }



}
