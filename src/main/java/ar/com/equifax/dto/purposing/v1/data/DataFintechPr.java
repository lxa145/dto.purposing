package ar.com.equifax.dto.purposing.v1.data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.DetallesFintechPr;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.AdhSsectorSt;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.AdhSucursal;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Adhmatriz;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.LoginMedio;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.ModoContratacion;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Moneda;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Periodicidad;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.TipoPrestamo;


/**
 * @author lxa145
 *
 */
public class DataFintechPr {

    @JsonProperty("adh_matriz")
    private Adhmatriz adhMatriz;
    @JsonProperty("adh_sucursal")
    private AdhSucursal adhSucursal;
    @JsonProperty("adh_sector")
    private AdhSsectorSt adhSector;
    @JsonProperty("tipo_prestamo")
    private TipoPrestamo tipoPrestamo;
    @JsonProperty("operacion_id")
    private String operacionId;
    @JsonProperty("otorgamiento_fh")
    private Integer otorgamientoFh;
    @JsonProperty("modo_contratacion")
    private ModoContratacion modoContratacion;
    @JsonProperty("moneda")
    private Moneda moneda;
    @JsonProperty("monto_otorgado")
    private String montoOtorgado;
    @JsonProperty("plazo")
    private Integer plazo;
    @JsonProperty("periodicidad")
    private Periodicidad periodicidad;
    @JsonProperty("canal_desembolso")
    private String canalDesembolso;
    @JsonProperty("consentimiento_fh")
    private Integer consentimientoFh;
    @JsonProperty("login_medio")
    private LoginMedio loginMedio;
    @JsonProperty("login_id")
    private String loginId;
    @JsonProperty("detalles")
    private List<DetallesFintechPr> detalles;
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

    public TipoPrestamo getTipoPrestamo() {
        return tipoPrestamo;
    }

    public void setTipoPrestamo(TipoPrestamo tipoPrestamo) {
        this.tipoPrestamo = tipoPrestamo;
    }

    public String getOperacionId() {
        return operacionId;
    }

    public void setOperacionId(String operacionId) {
        this.operacionId = operacionId;
    }

    public Integer getOtorgamientoFh() {
        return otorgamientoFh;
    }

    public void setOtorgamientoFh(Integer otorgamientoFh) {
        this.otorgamientoFh = otorgamientoFh;
    }

    public ModoContratacion getModoContratacion() {
        return modoContratacion;
    }

    public void setModoContratacion(ModoContratacion modoContratacion) {
        this.modoContratacion = modoContratacion;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public String getMontoOtorgado() {
        return montoOtorgado;
    }

    public void setMontoOtorgado(String montoOtorgado) {
        this.montoOtorgado = montoOtorgado;
    }

    public Integer getPlazo() {
        return plazo;
    }

    public void setPlazo(Integer plazo) {
        this.plazo = plazo;
    }

    public Periodicidad getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(Periodicidad periodicidad) {
        this.periodicidad = periodicidad;
    }



    public String getCanalDesembolso() {
        return canalDesembolso;
    }

    public void setCanalDesembolso(String canalDesembolso) {
        this.canalDesembolso = canalDesembolso;
    }

    public Integer getConsentimientoFh() {
        return consentimientoFh;
    }

    public void setConsentimientoFh(Integer consentimientoFh) {
        this.consentimientoFh = consentimientoFh;
    }

    public LoginMedio getLoginMedio() {
        return loginMedio;
    }

    public void setLoginMedio(LoginMedio loginMedio) {
        this.loginMedio = loginMedio;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public List<DetallesFintechPr> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallesFintechPr> detalles) {
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
        return "DataFintechPr [adhMatriz=" + adhMatriz + ", adhSucursal="
                + adhSucursal + ", adhSector=" + adhSector + ", tipoPrestamo="
                + tipoPrestamo + ", operacionId=" + operacionId
                + ", otorgamientoFh=" + otorgamientoFh + ", modoContratacion="
                + modoContratacion + ", moneda=" + moneda + ", montoOtorgado="
                + montoOtorgado + ", plazo=" + plazo + ", periodicidad="
                + periodicidad + ", canalDesembolso=" + canalDesembolso
                + ", consentimientoFh=" + consentimientoFh + ", loginMedio="
                + loginMedio + ", loginId=" + loginId + ", detalles=" + detalles
                + ", operaciones=" + operaciones + "]";
    }



}
