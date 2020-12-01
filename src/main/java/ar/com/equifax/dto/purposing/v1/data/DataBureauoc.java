package ar.com.equifax.dto.purposing.v1.data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.DetallesBureauoc;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.AdhSsectorSt;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.AdhSucursal;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Adhmatriz;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Moneda;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.TipoPrestamo;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Vinculacion;



/**
 * @author lxa145
 *
 */
public class DataBureauoc {

    @JsonProperty("adh_matriz")
    private Adhmatriz adhMatriz;
    @JsonProperty("adh_sucursal")
    private AdhSucursal adhSucursal;
    @JsonProperty("adh_sector")
    private AdhSsectorSt adhSector;
    @JsonProperty("operacion_id")
    private String operacionId;
    @JsonProperty("tipo_prestamo")
    private TipoPrestamo tipoPrestamo;
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
    private List<DetallesBureauoc> detalles;
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


    public TipoPrestamo getTipoPrestamo() {
        return tipoPrestamo;
    }

    public void setTipoPrestamo(TipoPrestamo tipoPrestamo) {
        this.tipoPrestamo = tipoPrestamo;
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

    public List<DetallesBureauoc> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallesBureauoc> detalles) {
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
        return "DataBureauoc [adhMatriz=" + adhMatriz + ", adhSucursal="
                + adhSucursal + ", adhSector=" + adhSector + ", operacionId="
                + operacionId + ", tipoPrestamo=" + tipoPrestamo
                + ", clienteId=" + clienteId + ", moneda=" + moneda
                + ", vinculacion=" + vinculacion + ", periodoAlta="
                + periodoAlta + ", periodoServicio=" + periodoServicio
                + ", detalles=" + detalles + ", operaciones=" + operaciones
                + "]";
    }



}
