package ar.com.equifax.dto.purposing.v1.data.innermodel;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.ActividadCod;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Establecimientos;


/**
 * @author lxa145
 *
 */
public class ActividadesAgroRuca {

    @JsonProperty("actividad_cod")
    private ActividadCod actividadCod;
    @JsonProperty("estado")
    private String estado;
    @JsonProperty("alta_fh")
    private Integer altaFh;
    @JsonProperty("baja_fh")
    private Integer bajaFh;
    @JsonProperty("establecimientos")
    private List<Establecimientos> establecimientos;
    @JsonProperty("operaciones")
    private Operaciones operaciones;


    public ActividadCod getActividadCod() {
        return actividadCod;
    }

    public void setActividadCod(ActividadCod actividadCod) {
        this.actividadCod = actividadCod;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getAltaFh() {
        return altaFh;
    }

    public void setAltaFh(Integer altaFh) {
        this.altaFh = altaFh;
    }

    public Integer getBajaFh() {
        return bajaFh;
    }

    public void setBajaFh(Integer bajaFh) {
        this.bajaFh = bajaFh;
    }

    public List<Establecimientos> getEstablecimientos() {
        return establecimientos;
    }

    public void setEstablecimientos(List<Establecimientos> establecimientos) {
        this.establecimientos = establecimientos;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }

    @Override
    public String toString() {
        return "ActividadesAgroRuca [actividadCod=" + actividadCod + ", estado="
                + estado + ", altaFh=" + altaFh + ", bajaFh=" + bajaFh
                + ", establecimientos=" + establecimientos + ", operaciones="
                + operaciones + "]";
    }



}
