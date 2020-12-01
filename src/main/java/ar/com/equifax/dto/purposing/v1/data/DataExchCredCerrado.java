package ar.com.equifax.dto.purposing.v1.data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.DetallesExchCredCerrado;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.AdhSsectorExch;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.AdhSucursal;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Adhmatriz;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.OperacionTipo;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Vinculacion;



/**
 * @author lxa145
 *
 */
public class DataExchCredCerrado {

    @JsonProperty("adh_matriz")
    private Adhmatriz adhMatriz;
    @JsonProperty("adh_sucursal")
    private AdhSucursal adhSucursal;
    @JsonProperty("adh_sector")
    private AdhSsectorExch adhSector;
    @JsonProperty("operacion_numero")
    private String operacionNumero;
    @JsonProperty("operacion_tipo")
    private OperacionTipo operacionTipo;
    @JsonProperty("inicio_mora_fh")
    private Integer inicioMoraFh;
    @JsonProperty("vinculacion")
    private Vinculacion vinculacion;
    @JsonProperty("detalles")
    private List<DetallesExchCredCerrado> detalles;
    @JsonProperty("operaciones")
    private Operaciones operaciones;


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

    public AdhSsectorExch getAdhSector() {
        return adhSector;
    }

    public void setAdhSector(AdhSsectorExch adhSector) {
        this.adhSector = adhSector;
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

    public List<DetallesExchCredCerrado> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallesExchCredCerrado> detalles) {
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
        return "DataExchCredCerrado [adhMatriz=" + adhMatriz + ", adhSucursal="
                + adhSucursal + ", adhSector=" + adhSector
                + ", operacionNumero=" + operacionNumero + ", operacionTipo="
                + operacionTipo + ", inicioMoraFh=" + inicioMoraFh
                + ", vinculacion=" + vinculacion + ", detalles=" + detalles
                + ", operaciones=" + operaciones + "]";
    }



}
