package ar.com.equifax.dto.purposing.v1.data.innermodel;

import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * @author lxa145
 *
 */
public class DetallesFintechPr {

    @JsonProperty("info_fh")
    private Integer infoFh;
    @JsonProperty("situacion")
    private String situacion;
    @JsonProperty("saldo_periodo")
    private String saldoPeriodo;
    @JsonProperty("saldo_total")
    private String saldoTotal;
    @JsonProperty("saldo_vencido")
    private String saldoVencido;
    @JsonProperty("saldo_financiado")
    private String saldoFinanciado;
    @JsonProperty("cuotas_pendientes")
    private Integer cuotasPendientes;
    @JsonProperty("operaciones")
    private Operaciones operaciones;


    public Integer getInfoFh() {
        return infoFh;
    }

    public void setInfoFh(Integer infoFh) {
        this.infoFh = infoFh;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    public String getSaldoPeriodo() {
        return saldoPeriodo;
    }

    public void setSaldoPeriodo(String saldoPeriodo) {
        this.saldoPeriodo = saldoPeriodo;
    }

    public String getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(String saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public String getSaldoVencido() {
        return saldoVencido;
    }

    public void setSaldoVencido(String saldoVencido) {
        this.saldoVencido = saldoVencido;
    }

    public String getSaldoFinanciado() {
        return saldoFinanciado;
    }

    public void setSaldoFinanciado(String saldoFinanciado) {
        this.saldoFinanciado = saldoFinanciado;
    }

    public Integer getCuotasPendientes() {
        return cuotasPendientes;
    }

    public void setCuotasPendientes(Integer cuotasPendientes) {
        this.cuotasPendientes = cuotasPendientes;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }


    @Override
    public String toString() {
        return "DetallesFintechPr [infoFh=" + infoFh + ", situacion="
                + situacion + ", saldoPeriodo=" + saldoPeriodo + ", saldoTotal="
                + saldoTotal + ", saldoVencido=" + saldoVencido
                + ", saldoFinanciado=" + saldoFinanciado + ", cuotasPendientes="
                + cuotasPendientes + ", operaciones=" + operaciones + "]";
    }



}
