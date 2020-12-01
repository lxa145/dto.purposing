package ar.com.equifax.dto.purposing.v1.data.innermodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Estado;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Moneda;



/**
 * @author lxa145
 *
 */
public class DetallesExchAgro {


    @JsonProperty("info_fh")
    private Integer infoFh;
    @JsonProperty("vencimiento_fh")
    private Integer vencimientoFh;
    @JsonProperty("moneda")
    private Moneda moneda;
    @JsonProperty("importe")
    private Double importe;
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

    public Integer getVencimientoFh() {
        return vencimientoFh;
    }

    public void setVencimientoFh(Integer vencimientoFh) {
        this.vencimientoFh = vencimientoFh;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
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

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }

    @Override
    public String toString() {
        return "DetallesExchAgro [infoFh=" + infoFh + ", vencimientoFh="
                + vencimientoFh + ", moneda=" + moneda + ", importe=" + importe
                + ", estado=" + estado + ", operaciones=" + operaciones + "]";
    }



}
