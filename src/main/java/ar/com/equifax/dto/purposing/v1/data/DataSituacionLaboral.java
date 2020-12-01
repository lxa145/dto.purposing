package ar.com.equifax.dto.purposing.v1.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Situacion;



/**
 * @author lxa145
 *
 */
public class DataSituacionLaboral {

    @JsonProperty("periodo")
    private Integer periodo;
    @JsonProperty("situacion")
    private Situacion situacion;
    @JsonProperty("iup_empleador")
    private Long iupEmpleador;
    @JsonProperty("ult_liquidacion_desempleo_fh")
    private Integer ultLiquidacionDesempleoFh;
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

    public Long getIupEmpleador() {
        return iupEmpleador;
    }

    public void setIupEmpleador(Long iupEmpleador) {
        this.iupEmpleador = iupEmpleador;
    }

    public Integer getUltLiquidacionDesempleoFh() {
        return ultLiquidacionDesempleoFh;
    }

    public void setUltLiquidacionDesempleoFh(
            Integer ultLiquidacionDesempleoFh) {
        this.ultLiquidacionDesempleoFh = ultLiquidacionDesempleoFh;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }


    @Override
    public String toString() {
        return "DataSituacionLaboral [periodo=" + periodo + ", situacion="
                + situacion + ", iupEmpleador=" + iupEmpleador
                + ", ultLiquidacionDesempleoFh=" + ultLiquidacionDesempleoFh
                + ", operaciones=" + operaciones + "]";
    }



}
