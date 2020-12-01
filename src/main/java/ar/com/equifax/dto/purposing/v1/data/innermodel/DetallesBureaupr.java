package ar.com.equifax.dto.purposing.v1.data.innermodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Situacion;



/**
 * @author lxa145
 *
 */
public class DetallesBureaupr {

    @JsonProperty("periodo")
    private Integer periodo;
    @JsonProperty("situacion")
    private Situacion situacion;
    @JsonProperty("monto_otorgado")
    private Double montoOtorgado;
    @JsonProperty("monto_cuota")
    private Double montoCuota;
    @JsonProperty("saldo_periodo")
    private Double saldoPeriodo;
    @JsonProperty("saldo_total_adeudado")
    private Double saldoTotalAdeudado;
    @JsonProperty("saldo_vencido")
    private Double saldoVencido;
    @JsonProperty("cant_cuotas_pend")
    private Integer cantCuotasPend;
    @JsonProperty("cant_meses_gracia")
    private Integer cantMesesGracia;
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

    public Double getMontoOtorgado() {
        return montoOtorgado;
    }

    public void setMontoOtorgado(Double montoOtorgado) {
        this.montoOtorgado = montoOtorgado;
    }

    public Double getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(Double montoCuota) {
        this.montoCuota = montoCuota;
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

    public Double getSaldoVencido() {
        return saldoVencido;
    }

    public void setSaldoVencido(Double saldoVencido) {
        this.saldoVencido = saldoVencido;
    }

    public Integer getCantCuotasPend() {
        return cantCuotasPend;
    }

    public void setCantCuotasPend(Integer cantCuotasPend) {
        this.cantCuotasPend = cantCuotasPend;
    }

    public Integer getCantMesesGracia() {
        return cantMesesGracia;
    }

    public void setCantMesesGracia(Integer cantMesesGracia) {
        this.cantMesesGracia = cantMesesGracia;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }

    @Override
    public String toString() {
        return "DetallesBureaupr [periodo=" + periodo + ", situacion="
                + situacion + ", montoOtorgado=" + montoOtorgado
                + ", montoCuota=" + montoCuota + ", saldoPeriodo="
                + saldoPeriodo + ", saldoTotalAdeudado=" + saldoTotalAdeudado
                + ", saldoVencido=" + saldoVencido + ", cantCuotasPend="
                + cantCuotasPend + ", cantMesesGracia=" + cantMesesGracia
                + ", operaciones=" + operaciones + "]";
    }



}
