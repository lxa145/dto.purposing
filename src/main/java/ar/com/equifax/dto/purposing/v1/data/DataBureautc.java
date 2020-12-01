package ar.com.equifax.dto.purposing.v1.data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.DetallesDataBureautc;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.AdhSsectorSt;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.AdhSucursal;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Adhmatriz;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.MarcaTarjeta;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Moneda;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Vinculacion;



/**
 * @author lxa145
 *
 */
public class DataBureautc {

    @JsonProperty("adh_matriz")
    private Adhmatriz adhmatriz;
    @JsonProperty("adh_sucursal")
    private AdhSucursal adhSucursal;
    @JsonProperty("adh_sector")
    private AdhSsectorSt adhSector;
    @JsonProperty("operacion_id")
    private String operacionId;
    @JsonProperty("marca_tarjeta")
    private MarcaTarjeta marcaTarjeta;
    @JsonProperty("cliente_id")
    private String clienteId;
    @JsonProperty("moneda")
    private Moneda moneda;
    @JsonProperty("vinculacion")
    private Vinculacion vinculacion;
    @JsonProperty("periodo_alta")
    private Integer periodoAlta;
    @JsonProperty("periodo_servicio")
    private Integer periodoServicio;
    @JsonProperty("detalles")
    private List<DetallesDataBureautc> detalles;
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

    public String getOperacionId() {
        return operacionId;
    }

    public void setOperacionId(String operacionId) {
        this.operacionId = operacionId;
    }

    public MarcaTarjeta getMarcaTarjeta() {
        return marcaTarjeta;
    }

    public void setMarcaTarjeta(MarcaTarjeta marcaTarjeta) {
        this.marcaTarjeta = marcaTarjeta;
    }

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public Vinculacion getVinculacion() {
        return vinculacion;
    }

    public void setVinculacion(Vinculacion vinculacion) {
        this.vinculacion = vinculacion;
    }

    public Integer getPeriodoAlta() {
        return periodoAlta;
    }

    public void setPeriodoAlta(Integer periodoAlta) {
        this.periodoAlta = periodoAlta;
    }

    public Integer getPeriodoServicio() {
        return periodoServicio;
    }

    public void setPeriodoServicio(Integer periodoServicio) {
        this.periodoServicio = periodoServicio;
    }

    public List<DetallesDataBureautc> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallesDataBureautc> detalles) {
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
        return "DataBureautc [adhmatriz=" + adhmatriz + ", adhSucursal="
                + adhSucursal + ", adhSector=" + adhSector + ", operacionId="
                + operacionId + ", marcaTarjeta=" + marcaTarjeta
                + ", clienteId=" + clienteId + ", moneda=" + moneda
                + ", vinculacion=" + vinculacion + ", periodoAlta="
                + periodoAlta + ", periodoServicio=" + periodoServicio
                + ", detalles=" + detalles + ", operaciones=" + operaciones
                + "]";
    }



}
