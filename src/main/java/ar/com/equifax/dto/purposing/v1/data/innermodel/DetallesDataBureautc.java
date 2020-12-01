package ar.com.equifax.dto.purposing.v1.data.innermodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.SituacionN;



/**
 * @author lxa145
 *
 */
public class DetallesDataBureautc {

    @JsonProperty("periodo")
    private Integer periodo;
    @JsonProperty("situacion")
    private SituacionN situacion;
    @JsonProperty("limite_compra")
    private Double limiteCompra;
    @JsonProperty("limite_credito")
    private Double limiteCredito;
    @JsonProperty("saldo_mensual")
    private Double saldoMensual;
    @JsonProperty("pago_minimo")
    private Double pagoMinimo;
    @JsonProperty("saldo_cuotas")
    private Double saldoCuotas;
    @JsonProperty("saldo_vencido")
    private Double saldoVencido;
    @JsonProperty("saldo_financiado")
    private Double saldoFinanciado;
    @JsonProperty("saldo_maximo_hist")
    private Double saldoMaximoHist;
    @JsonProperty("ult_fecha_compra")
    private Integer ultFechaCompra;
    @JsonProperty("operaciones")
    private Operaciones operaciones;


    public Integer getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    public SituacionN getSituacion() {
        return situacion;
    }

    public void setSituacion(SituacionN situacion) {
        this.situacion = situacion;
    }

    public Double getLimiteCompra() {
        return limiteCompra;
    }

    public void setLimiteCompra(Double limiteCompra) {
        this.limiteCompra = limiteCompra;
    }

    public Double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(Double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public Double getSaldoMensual() {
        return saldoMensual;
    }

    public void setSaldoMensual(Double saldoMensual) {
        this.saldoMensual = saldoMensual;
    }

    public Double getPagoMinimo() {
        return pagoMinimo;
    }

    public void setPagoMinimo(Double pagoMinimo) {
        this.pagoMinimo = pagoMinimo;
    }

    public Double getSaldoCuotas() {
        return saldoCuotas;
    }

    public void setSaldoCuotas(Double saldoCuotas) {
        this.saldoCuotas = saldoCuotas;
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

    public Double getSaldoMaximoHist() {
        return saldoMaximoHist;
    }

    public void setSaldoMaximoHist(Double saldoMaximoHist) {
        this.saldoMaximoHist = saldoMaximoHist;
    }

    public Integer getUltFechaCompra() {
        return ultFechaCompra;
    }

    public void setUltFechaCompra(Integer ultFechaCompra) {
        this.ultFechaCompra = ultFechaCompra;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }


    @Override
    public String toString() {
        return "DetallesDataBureautc [periodo=" + periodo + ", situacion="
                + situacion + ", limiteCompra=" + limiteCompra
                + ", limiteCredito=" + limiteCredito + ", saldoMensual="
                + saldoMensual + ", pagoMinimo=" + pagoMinimo + ", saldoCuotas="
                + saldoCuotas + ", saldoVencido=" + saldoVencido
                + ", saldoFinanciado=" + saldoFinanciado + ", saldoMaximoHist="
                + saldoMaximoHist + ", ultFechaCompra=" + ultFechaCompra
                + ", operaciones=" + operaciones + "]";
    }



}
