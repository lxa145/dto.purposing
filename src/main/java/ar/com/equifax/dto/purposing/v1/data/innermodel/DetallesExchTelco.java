package ar.com.equifax.dto.purposing.v1.data.innermodel;

import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * @author lxa145
 *
 */
public class DetallesExchTelco {

    @JsonProperty("info_fh")
    private Integer infoFh;
    @JsonProperty("moneda")
    private String moneda;
    @JsonProperty("importe")
    private Double importe;
    @JsonProperty("estado")
    private String estado;
    @JsonProperty("es_publica")
    private Boolean esPublica;
    @JsonProperty("antiguedad")
    private Integer antiguedad;
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

    public Boolean getEsPublica() {
        return esPublica;
    }

    public void setEsPublica(Boolean esPublica) {
        this.esPublica = esPublica;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }


    @Override
    public String toString() {
        return "DetallesExchTelco [infoFh=" + infoFh + ", moneda=" + moneda
                + ", importe=" + importe + ", estado=" + estado + ", esPublica="
                + esPublica + ", antiguedad=" + antiguedad + ", operaciones="
                + operaciones + "]";
    }



}
