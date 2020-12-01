package ar.com.equifax.dto.purposing.v1.data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.DetallesClearing;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.AdhSsectorSt;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.AdhSucursal;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Adhmatriz;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.ObservacionCod;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.OperacionTipo;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Vinculacion;



/**
 * @author lxa145
 *
 */
public class DataClearing {

    @JsonProperty("adh_matriz")
    private Adhmatriz adhmatriz;
    @JsonProperty("adh_sucursal")
    private AdhSucursal adhSucursal;
    @JsonProperty("adh_sector")
    private AdhSsectorSt adhSector;
    @JsonProperty("observacion_cod")
    private ObservacionCod observacionCod;
    @JsonProperty("operacion_numero")
    private String operacionNumero;
    @JsonProperty("operacion_tipo")
    private OperacionTipo operacionTipo;
    @JsonProperty("inicio_mora_fh")
    private Integer inicioMoraFh;
    @JsonProperty("vinculacion")
    private Vinculacion vinculacion;
    @JsonProperty("detalles")
    private List<DetallesClearing> detalles;
    @JsonProperty("operaciones")
    private Operaciones operaciones;


    public Adhmatriz getAdhmatriz() {
        return adhmatriz;
    }

    public void setAdhmatriz(Adhmatriz adhmatriz) {
        this.adhmatriz = adhmatriz;
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

    public ObservacionCod getObservacionCod() {
        return observacionCod;
    }

    public void setObservacionCod(ObservacionCod observacionCod) {
        this.observacionCod = observacionCod;
    }

    public String getOperacionNumero() {
        return operacionNumero;
    }

    public void setOperacionNumero(String operacionNumero) {
        this.operacionNumero = operacionNumero;
    }

    public OperacionTipo getOperacionTipo() {
        return operacionTipo;
    }

    public void setOperacionTipo(OperacionTipo operacionTipo) {
        this.operacionTipo = operacionTipo;
    }

    public Integer getInicioMoraFh() {
        return inicioMoraFh;
    }

    public void setInicioMoraFh(Integer inicioMoraFh) {
        this.inicioMoraFh = inicioMoraFh;
    }

    public Vinculacion getVinculacion() {
        return vinculacion;
    }

    public void setVinculacion(Vinculacion vinculacion) {
        this.vinculacion = vinculacion;
    }

    public List<DetallesClearing> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallesClearing> detalles) {
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
        return "DataClearing [adhmatriz=" + adhmatriz + ", adhSucursal="
                + adhSucursal + ", adhSector=" + adhSector + ", observacionCod="
                + observacionCod + ", operacionNumero=" + operacionNumero
                + ", operacionTipo=" + operacionTipo + ", inicioMoraFh="
                + inicioMoraFh + ", vinculacion=" + vinculacion + ", detalles="
                + detalles + ", operaciones=" + operaciones + "]";
    }



}
