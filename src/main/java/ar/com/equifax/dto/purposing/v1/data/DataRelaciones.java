package ar.com.equifax.dto.purposing.v1.data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.AportesRelaciones;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Integrante;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;



/**
 * @author lxa145
 *
 */
public class DataRelaciones {

    @JsonProperty("integrantes")
    private List<Integrante> integrantes;
    @JsonProperty("relacion_id")
    private String relacionId;
    @JsonProperty("situacion")
    private String situacion;
    @JsonProperty("relacion_desde_fh")
    private Integer relacionDesdeFh;
    @JsonProperty("relacion_hasta_fh")
    private Integer relacionHastaFh;
    @JsonProperty("aportes")
    private List<AportesRelaciones> aportes;
    @JsonProperty("operaciones")
    private Operaciones operaciones;


    public List<Integrante> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(List<Integrante> integrantes) {
        this.integrantes = integrantes;
    }

    public String getRelacionId() {
        return relacionId;
    }

    public void setRelacionId(String relacionId) {
        this.relacionId = relacionId;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    public Integer getRelacionDesdeFh() {
        return relacionDesdeFh;
    }

    public void setRelacionDesdeFh(Integer relacionDesdeFh) {
        this.relacionDesdeFh = relacionDesdeFh;
    }

    public Integer getRelacionHastaFh() {
        return relacionHastaFh;
    }

    public void setRelacionHastaFh(Integer relacionHastaFh) {
        this.relacionHastaFh = relacionHastaFh;
    }

    public List<AportesRelaciones> getAportes() {
        return aportes;
    }

    public void setAportes(List<AportesRelaciones> aportes) {
        this.aportes = aportes;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }


    @Override
    public String toString() {
        return "DataRelaciones [integrantes=" + integrantes + ", relacionId="
                + relacionId + ", situacion=" + situacion + ", relacionDesdeFh="
                + relacionDesdeFh + ", relacionHastaFh=" + relacionHastaFh
                + ", aportes=" + aportes + ", operaciones=" + operaciones + "]";
    }


}
