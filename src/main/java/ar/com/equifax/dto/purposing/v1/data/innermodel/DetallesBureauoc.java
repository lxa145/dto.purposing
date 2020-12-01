package ar.com.equifax.dto.purposing.v1.data.innermodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Situacion;


/**
 * @author lxa145
 *
 */
public class DetallesBureauoc {


    @JsonProperty("periodo")
    private Integer periodo;
    @JsonProperty("situacion")
    private Situacion situacion;
    @JsonProperty("monto_acordado")
    private Double montoAcordado;
    @JsonProperty("saldo_periodo")
    private Double saldoPeriodo;
    @JsonProperty("saldo_total_adeudado")
    private Double saldoTotalAdeudado;
    @JsonProperty("monto_exceso_cierre")
    private Double montoExcesoCierre;
    @JsonProperty("saldo_maximo_mensual")
    private Double saldoMaximoMensual;
    @JsonProperty("saldo_maximo_hist")
    private Double saldoMaximoHist;
    @JsonProperty("operaciones")
    private Operaciones operaciones;


    public Integer getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    public Situacion getSituacion() {
        return situacion;
    }

    public void setSituacion(Situacion situacion) {
        this.situacion = situacion;
    }

    public Double getMontoAcordado() {
        return montoAcordado;
    }

    public void setMontoAcordado(Double montoAcordado) {
        this.montoAcordado = montoAcordado;
    }

    public Double getSaldoPeriodo() {
        return saldoPeriodo;
    }

    public void setSaldoPeriodo(Double saldoPeriodo) {
        this.saldoPeriodo = saldoPeriodo;
    }

    public Double getSaldoTotalAdeudado() {
        return saldoTotalAdeudado;
    }

    public void setSaldoTotalAdeudado(Double saldoTotalAdeudado) {
        this.saldoTotalAdeudado = saldoTotalAdeudado;
    }

    public Double getMontoExcesoCierre() {
        return montoExcesoCierre;
    }

    public void setMontoExcesoCierre(Double montoExcesoCierre) {
        this.montoExcesoCierre = montoExcesoCierre;
    }

    public Double getSaldoMaximoMensual() {
        return saldoMaximoMensual;
    }

    public void setSaldoMaximoMensual(Double saldoMaximoMensual) {
        this.saldoMaximoMensual = saldoMaximoMensual;
    }

    public Double getSaldoMaximoHist() {
        return saldoMaximoHist;
    }

    public void setSaldoMaximoHist(Double saldoMaximoHist) {
        this.saldoMaximoHist = saldoMaximoHist;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }


    @Override
    public String toString() {
        return "DetallesBureauoc [periodo=" + periodo + ", situacion="
                + situacion + ", montoAcordado=" + montoAcordado
                + ", saldoPeriodo=" + saldoPeriodo + ", saldoTotalAdeudado="
                + saldoTotalAdeudado + ", montoExcesoCierre="
                + montoExcesoCierre + ", saldoMaximoMensual="
                + saldoMaximoMensual + ", saldoMaximoHist=" + saldoMaximoHist
                + ", operaciones=" + operaciones + "]";
    }



}
