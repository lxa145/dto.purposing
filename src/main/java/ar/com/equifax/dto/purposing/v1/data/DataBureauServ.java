package ar.com.equifax.dto.purposing.v1.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.DetalleBureauServ;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.AdhSsectorSt;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.AdhSucursal;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Adhmatriz;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Periodicidad;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Tipo;



/**
 * @author lxa145
 *
 */
public class DataBureauServ {

    @JsonProperty("adh_matriz")
    private Adhmatriz adhMatriz;
    @JsonProperty("adh_sucursal")
    private AdhSucursal adhSucursal;
    @JsonProperty("adh_sector")
    private AdhSsectorSt adhSector;
    @JsonProperty("operacion_id")
    private String operacionId;
    @JsonProperty("cliente_id")
    private String clienteId;
    @JsonProperty("tipo_servicio")
    private Tipo tipoServicio;
    @JsonProperty("moneda")
    private String moneda;
    @JsonProperty("canal_venta")
    private String canalVenta;
    @JsonProperty("periodo_alta")
    private Integer periodoAlta;
    @JsonProperty("contratacion_fh")
    private Integer contratacionFh;
    @JsonProperty("inicio_rel_com_fh")
    private Integer inicioRelComFh;
    @JsonProperty("periodicidad")
    private Periodicidad periodicidad;
    @JsonProperty("detalles")
    private DetalleBureauServ detalles;
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

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public Tipo getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(Tipo tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getCanalVenta() {
        return canalVenta;
    }

    public void setCanalVenta(String canalVenta) {
        this.canalVenta = canalVenta;
    }

    public Integer getPeriodoAlta() {
        return periodoAlta;
    }

    public void setPeriodoAlta(Integer periodoAlta) {
        this.periodoAlta = periodoAlta;
    }

    public Integer getContratacionFh() {
        return contratacionFh;
    }

    public void setContratacionFh(Integer contratacionFh) {
        this.contratacionFh = contratacionFh;
    }

    public Integer getInicioRelComFh() {
        return inicioRelComFh;
    }

    public void setInicioRelComFh(Integer inicioRelComFh) {
        this.inicioRelComFh = inicioRelComFh;
    }

    public Periodicidad getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(Periodicidad periodicidad) {
        this.periodicidad = periodicidad;
    }

    public DetalleBureauServ getDetalles() {
        return detalles;
    }

    public void setDetalles(DetalleBureauServ detalles) {
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
        return "DataBureauServ [adhMatriz=" + adhMatriz + ", adhSucursal="
                + adhSucursal + ", adhSector=" + adhSector + ", operacionId="
                + operacionId + ", clienteId=" + clienteId + ", tipoServicio="
                + tipoServicio + ", moneda=" + moneda + ", canalVenta="
                + canalVenta + ", periodoAlta=" + periodoAlta
                + ", contratacionFh=" + contratacionFh + ", inicioRelComFh="
                + inicioRelComFh + ", periodicidad=" + periodicidad
                + ", detalles=" + detalles + ", operaciones=" + operaciones
                + "]";
    }


}
