package ar.com.equifax.dto.purposing.v1.data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.DetallesExchTelco;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.AdhSsectorSt;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.AdhSucursal;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Adhmatriz;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Tipo;



/**
 * @author lxa145
 *
 */
public class DataExchTelco {

    @JsonProperty("observacion_nro")
    private Long observacionNro;
    @JsonProperty("adh_matriz")
    private Adhmatriz adhMatriz;
    @JsonProperty("adh_sucursal")
    private AdhSucursal adhSucursal;
    @JsonProperty("adh_sector")
    private AdhSsectorSt adhSector;
    @JsonProperty("inicio_mora_fh")
    private Integer inicioMoraFh;
    @JsonProperty("oper_tipo")
    private Tipo operTipo;
    @JsonProperty("tiene_financ_hw")
    private String tieneFinancHw;
    @JsonProperty("es_prim_fact_impaga")
    private String esPrimFactImpaga;
    @JsonProperty("serv_id")
    private String servId;
    @JsonProperty("detalles")
    private List<DetallesExchTelco> detalles;
    @JsonProperty("operaciones")
    private Operaciones operaciones;



    public Long getObservacionNro() {
        return observacionNro;
    }

    public void setObservacionNro(Long observacionNro) {
        this.observacionNro = observacionNro;
    }

    public Adhmatriz getAdhMatriz() {
        return adhMatriz;
    }

    public void setAdhMatriz(Adhmatriz adhMatriz) {
        this.adhMatriz = adhMatriz;
    }

    public AdhSucursal getAdhSucursal() {
        return adhSucursal;
    }

    public void setAdhSucursal(AdhSucursal adhSucursal) {
        this.adhSucursal = adhSucursal;
    }

    public AdhSsectorSt getAdhSector() {
        return adhSector;
    }

    public void setAdhSector(AdhSsectorSt adhSector) {
        this.adhSector = adhSector;
    }

    public Integer getInicioMoraFh() {
        return inicioMoraFh;
    }

    public void setInicioMoraFh(Integer inicioMoraFh) {
        this.inicioMoraFh = inicioMoraFh;
    }

    public Tipo getOperTipo() {
        return operTipo;
    }

    public void setOperTipo(Tipo operTipo) {
        this.operTipo = operTipo;
    }

    public String getTieneFinancHw() {
        return tieneFinancHw;
    }

    public void setTieneFinancHw(String tieneFinancHw) {
        this.tieneFinancHw = tieneFinancHw;
    }

    public String getEsPrimFactImpaga() {
        return esPrimFactImpaga;
    }

    public void setEsPrimFactImpaga(String esPrimFactImpaga) {
        this.esPrimFactImpaga = esPrimFactImpaga;
    }

    public String getServId() {
        return servId;
    }

    public void setServId(String servId) {
        this.servId = servId;
    }

    public List<DetallesExchTelco> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallesExchTelco> detalles) {
        this.detalles = detalles;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }

    @Override
    public String toString() {
        return "DataExchTelco [observacionNro=" + observacionNro
                + ", adhMatriz=" + adhMatriz + ", adhSucursal=" + adhSucursal
                + ", adhSector=" + adhSector + ", inicioMoraFh=" + inicioMoraFh
                + ", operTipo=" + operTipo + ", tieneFinancHw=" + tieneFinancHw
                + ", esPrimFactImpaga=" + esPrimFactImpaga + ", servId="
                + servId + ", detalles=" + detalles + ", operaciones="
                + operaciones + "]";
    }



}
