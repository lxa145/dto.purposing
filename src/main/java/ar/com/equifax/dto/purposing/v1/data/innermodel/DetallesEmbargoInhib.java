package ar.com.equifax.dto.purposing.v1.data.innermodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Estado;



/**
 * @author lxa145
 *
 */
public class DetallesEmbargoInhib {


    @JsonProperty("info_fh")
    private Integer infoFh;
    @JsonProperty("importe")
    private Integer importe;
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

    public Integer getImporte() {
        return importe;
    }

    public void setImporte(Integer importe) {
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
        return "DetallesEmbargoInhib [infoFh=" + infoFh + ", importe=" + importe
                + ", estado=" + estado + ", operaciones=" + operaciones + "]";
    }



}
