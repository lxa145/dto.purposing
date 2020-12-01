package ar.com.equifax.dto.purposing.v1.data.innermodel;

import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * @author lxa145
 *
 */
public class DetallesDataFintechTc {


    @JsonProperty("info_fh")
    private String infoFh;
    @JsonProperty("situacion")
    private String situacion;
    @JsonProperty("saldo_periodo")
    private String saldoPeriodo;
    @JsonProperty("saldo_total")
    private Double saldoTotal;
    @JsonProperty("saldo_vencido")
    private Double saldoVencido;
    @JsonProperty("saldo_financiado")
    private Double saldoFinanciado;
    @JsonProperty("pago_minimo")
    private Double pagoMinimo;
    @JsonProperty("limite_credito")
    private Double limiteCredito;
    @JsonProperty("operaciones")
    private Operaciones operaciones;


    public String getInfoFh() {
        return infoFh;
    }

    public void setInfoFh(String infoFh) {
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

    public Double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(Double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public Double getSaldoVencido() {
        return saldoVencido;
    }

    public void setSaldoVencido(Double saldoVencido) {
        this.saldoVencido = saldoVencido;
    }

    public Double getSaldoFinanciado() {
        return saldoFinanciado;
    }

    public void setSaldoFinanciado(Double saldoFinanciado) {
        this.saldoFinanciado = saldoFinanciado;
    }

    public Double getPagoMinimo() {
        return pagoMinimo;
    }

    public void setPagoMinimo(Double pagoMinimo) {
        this.pagoMinimo = pagoMinimo;
    }

    public Double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(Double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }


    @Override
    public String toString() {
        return "DetallesDataFintechTc [infoFh=" + infoFh + ", situacion="
                + situacion + ", saldoPeriodo=" + saldoPeriodo + ", saldoTotal="
                + saldoTotal + ", saldoVencido=" + saldoVencido
                + ", saldoFinanciado=" + saldoFinanciado + ", pagoMinimo="
                + pagoMinimo + ", limiteCredito=" + limiteCredito
                + ", operaciones=" + operaciones + "]";
    }


}
