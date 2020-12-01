package ar.com.equifax.dto.purposing.v1.data.innermodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Estado;


/**
 * @author lxa145
 *
 */
public class DetalleBureauServ {


    @JsonProperty("periodo")
    private Integer periodo;
    @JsonProperty("status")
    private Estado status;
    @JsonProperty("compromiso_mes")
    private Double compromisoMes;
    @JsonProperty("saldo_deuda")
    private Double saldoDeuda;
    @JsonProperty("medio_pago")
    private Double medioPago;
    @JsonProperty("vencimiento_fh")
    private Integer vencimientoFh;
    @JsonProperty("pago_fh")
    private Integer pagoFh;
    @JsonProperty("operaciones")
    private Operaciones operaciones;


    public Integer getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    public Estado getStatus() {
        return status;
    }

    public void setStatus(Estado status) {
        this.status = status;
    }

    public Double getCompromisoMes() {
        return compromisoMes;
    }

    public void setCompromisoMes(Double compromisoMes) {
        this.compromisoMes = compromisoMes;
    }

    public Double getSaldoDeuda() {
        return saldoDeuda;
    }

    public void setSaldoDeuda(Double saldoDeuda) {
        this.saldoDeuda = saldoDeuda;
    }

    public Double getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(Double medioPago) {
        this.medioPago = medioPago;
    }

    public Integer getVencimientoFh() {
        return vencimientoFh;
    }

    public void setVencimientoFh(Integer vencimientoFh) {
        this.vencimientoFh = vencimientoFh;
    }

    public Integer getPagoFh() {
        return pagoFh;
    }

    public void setPagoFh(Integer pagoFh) {
        this.pagoFh = pagoFh;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }


    @Override
    public String toString() {
        return "DetalleBureauServ [periodo=" + periodo + ", status=" + status
                + ", compromisoMes=" + compromisoMes + ", saldoDeuda="
                + saldoDeuda + ", medioPago=" + medioPago + ", vencimientoFh="
                + vencimientoFh + ", pagoFh=" + pagoFh + ", operaciones="
                + operaciones + "]";
    }



}
