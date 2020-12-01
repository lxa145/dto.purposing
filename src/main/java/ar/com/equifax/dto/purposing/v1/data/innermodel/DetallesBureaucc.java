package ar.com.equifax.dto.purposing.v1.data.innermodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Situacion;



/**
 * @author lxa145
 *
 */
public class DetallesBureaucc {

    @JsonProperty("periodo")
    private Integer periodo;
    @JsonProperty("situacion")
    private Situacion situacion;
    @JsonProperty("monto_autorizado")
    private Double montoAutorizado;
    @JsonProperty("saldo_deudor")
    private Double saldoDeudor;
    @JsonProperty("interes_mensual")
    private Double interesMensual;
    @JsonProperty("monto_exceso_cierre")
    private Double montoExcesoCierre;
    @JsonProperty("saldo_prom_mensual")
    private Double saldoPromMensual;
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

    public Double getMontoAutorizado() {
        return montoAutorizado;
    }

    public void setMontoAutorizado(Double montoAutorizado) {
        this.montoAutorizado = montoAutorizado;
    }

    public Double getSaldoDeudor() {
        return saldoDeudor;
    }

    public void setSaldoDeudor(Double saldoDeudor) {
        this.saldoDeudor = saldoDeudor;
    }

    public Double getInteresMensual() {
        return interesMensual;
    }

    public void setInteresMensual(Double interesMensual) {
        this.interesMensual = interesMensual;
    }

    public Double getMontoExcesoCierre() {
        return montoExcesoCierre;
    }

    public void setMontoExcesoCierre(Double montoExcesoCierre) {
        this.montoExcesoCierre = montoExcesoCierre;
    }

    public Double getSaldoPromMensual() {
        return saldoPromMensual;
    }

    public void setSaldoPromMensual(Double saldoPromMensual) {
        this.saldoPromMensual = saldoPromMensual;
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
        return "DetallesBureaucc [periodo=" + periodo + ", situacion="
                + situacion + ", montoAutorizado=" + montoAutorizado
                + ", saldoDeudor=" + saldoDeudor + ", interesMensual="
                + interesMensual + ", montoExcesoCierre=" + montoExcesoCierre
                + ", saldoPromMensual=" + saldoPromMensual
                + ", saldoMaximoMensual=" + saldoMaximoMensual
                + ", saldoMaximoHist=" + saldoMaximoHist + ", operaciones="
                + operaciones + "]";
    }



}
