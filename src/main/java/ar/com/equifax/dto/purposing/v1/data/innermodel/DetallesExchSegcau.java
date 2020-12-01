package ar.com.equifax.dto.purposing.v1.data.innermodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Estado;


/**
 * @author lxa145
 *
 */
public class DetallesExchSegcau {


    @JsonProperty("info_fh")
    private Integer infoFh;
    @JsonProperty("moneda")
    private String moneda;
    @JsonProperty("monto")
    private Double monto;
    @JsonProperty("estado")
    private Estado estado;
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

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }

    @Override
    public String toString() {
        return "DetallesExchSegcau [infoFh=" + infoFh + ", moneda=" + moneda
                + ", monto=" + monto + ", estado=" + estado + ", operaciones="
                + operaciones + "]";
    }



}
