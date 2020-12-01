package ar.com.equifax.dto.purposing.v1.data.innermodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Estado;



/**
 * @author lxa145
 *
 */
public class DetallesExchInmo {

    @JsonProperty("info_fh")
    private Integer infoFh;
    @JsonProperty("moneda")
    private String moneda;
    @JsonProperty("importe")
    private Double importe;
    @JsonProperty("estado")
    private Estado estado;
    @JsonProperty("consultas_cant")
    private Integer consultasCant;
    @JsonProperty("consultas_desde_fh")
    private Integer consultasDesdeFh;
    @JsonProperty("juicio_actor")
    private Boolean juicioActor;
    @JsonProperty("juicio_juzgado")
    private Boolean juicioJuzgado;
    @JsonProperty("juicio_caratula")
    private Boolean juicioCaratula;
    @JsonProperty("juicio_inicio_fh")
    private Integer juicioInicioFh;
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Integer getConsultasCant() {
        return consultasCant;
    }

    public void setConsultasCant(Integer consultasCant) {
        this.consultasCant = consultasCant;
    }

    public Integer getConsultasDesdeFh() {
        return consultasDesdeFh;
    }

    public void setConsultasDesdeFh(Integer consultasDesdeFh) {
        this.consultasDesdeFh = consultasDesdeFh;
    }

    public Boolean getJuicioActor() {
        return juicioActor;
    }

    public void setJuicioActor(Boolean juicioActor) {
        this.juicioActor = juicioActor;
    }

    public Boolean getJuicioJuzgado() {
        return juicioJuzgado;
    }

    public void setJuicioJuzgado(Boolean juicioJuzgado) {
        this.juicioJuzgado = juicioJuzgado;
    }

    public Boolean getJuicioCaratula() {
        return juicioCaratula;
    }

    public void setJuicioCaratula(Boolean juicioCaratula) {
        this.juicioCaratula = juicioCaratula;
    }

    public Integer getJuicioInicioFh() {
        return juicioInicioFh;
    }

    public void setJuicioInicioFh(Integer juicioInicioFh) {
        this.juicioInicioFh = juicioInicioFh;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }


    @Override
    public String toString() {
        return "DetallesExchInmo [infoFh=" + infoFh + ", moneda=" + moneda
                + ", importe=" + importe + ", estado=" + estado
                + ", consultasCant=" + consultasCant + ", consultasDesdeFh="
                + consultasDesdeFh + ", juicioActor=" + juicioActor
                + ", juicioJuzgado=" + juicioJuzgado + ", juicioCaratula="
                + juicioCaratula + ", juicioInicioFh=" + juicioInicioFh
                + ", operaciones=" + operaciones + "]";
    }



}
