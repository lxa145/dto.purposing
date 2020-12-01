package ar.com.equifax.dto.purposing.v1.data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.DetallesBureaupr;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.AdhSsectorSt;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.AdhSucursal;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Adhmatriz;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Moneda;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Periodicidad;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.TipoPrestamo;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.TipoRefuerzoCuotas;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Vinculacion;


/**
 * @author lxa145
 *
 */
public class DataBureaupr {

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
    @JsonProperty("capital_original")
    private Double capitalOriginal;
    @JsonProperty("cant_cuotas")
    private Integer cantCuotas;
    @JsonProperty("periodicidad")
    private Periodicidad periodicidad;
    @JsonProperty("tipo_refuerzo_cuotas")
    private TipoRefuerzoCuotas tipoRefuerzoCuotas;
    @JsonProperty("vinculacion")
    private Vinculacion vinculacion;
    @JsonProperty("periodo_alta")
    private Integer periodoAlta;
    @JsonProperty("periodo_servicio")
    private Integer periodoServicio;
    @JsonProperty("detalles")
    private List<DetallesBureaupr> detalles;
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

    public Double getCapitalOriginal() {
        return capitalOriginal;
    }

    public void setCapitalOriginal(Double capitalOriginal) {
        this.capitalOriginal = capitalOriginal;
    }

    public Integer getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(Integer cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public Periodicidad getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(Periodicidad periodicidad) {
        this.periodicidad = periodicidad;
    }

    public TipoRefuerzoCuotas getTipoRefuerzoCuotas() {
        return tipoRefuerzoCuotas;
    }

    public void setTipoRefuerzoCuotas(TipoRefuerzoCuotas tipoRefuerzoCuotas) {
        this.tipoRefuerzoCuotas = tipoRefuerzoCuotas;
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

    public List<DetallesBureaupr> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallesBureaupr> detalles) {
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
        return "DataBureaupr [adhMatriz=" + adhMatriz + ", adhSucursal="
                + adhSucursal + ", adhSector=" + adhSector + ", operacionId="
                + operacionId + ", tipoPrestamo=" + tipoPrestamo
                + ", clienteId=" + clienteId + ", moneda=" + moneda
                + ", capitalOriginal=" + capitalOriginal + ", cantCuotas="
                + cantCuotas + ", periodicidad=" + periodicidad
                + ", tipoRefuerzoCuotas=" + tipoRefuerzoCuotas
                + ", vinculacion=" + vinculacion + ", periodoAlta="
                + periodoAlta + ", periodoServicio=" + periodoServicio
                + ", detalles=" + detalles + ", operaciones=" + operaciones
                + "]";
    }



}
