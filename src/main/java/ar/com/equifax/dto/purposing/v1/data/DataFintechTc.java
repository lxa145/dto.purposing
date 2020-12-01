package ar.com.equifax.dto.purposing.v1.data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.DetallesDataFintechTc;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.AdhSsectorSt;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.AdhSucursal;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Adhmatriz;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.LoginMedio;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.MarcaTarjeta;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.ModoContratacion;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Moneda;



/**
 * @author lxa145
 *
 */
public class DataFintechTc {

    @JsonProperty("adh_matriz")
    private Adhmatriz adhMatriz;
    @JsonProperty("adh_sucursal")
    private AdhSucursal adhSucursal;
    @JsonProperty("adh_sector")
    private AdhSsectorSt adhSector;
    @JsonProperty("marca_tc")
    private MarcaTarjeta marcaTc;
    @JsonProperty("operacion_id")
    private String operacionId;
    @JsonProperty("otorgamiento_fh")
    private Integer otorgamientoFh;
    @JsonProperty("modo_contratacion")
    private ModoContratacion modoContratacion;
    @JsonProperty("moneda")
    private Moneda moneda;
    @JsonProperty("canal_desembolso")
    private String canalDesembolso;
    @JsonProperty("consentimiento_fh")
    private Integer consentimientoFh;
    @JsonProperty("login_medio")
    private LoginMedio loginMedio;
    @JsonProperty("login_id")
    private String loginId;
    @JsonProperty("detalles")
    private List<DetallesDataFintechTc> detalles;
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

    public MarcaTarjeta getMarcaTc() {
        return marcaTc;
    }

    public void setMarcaTc(MarcaTarjeta marcaTc) {
        this.marcaTc = marcaTc;
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

    public List<DetallesDataFintechTc> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallesDataFintechTc> detalles) {
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
        return "DataFintechTc [adhMatriz=" + adhMatriz + ", adhSucursal="
                + adhSucursal + ", adhSector=" + adhSector + ", marcaTc="
                + marcaTc + ", operacionId=" + operacionId + ", otorgamientoFh="
                + otorgamientoFh + ", modoContratacion=" + modoContratacion
                + ", moneda=" + moneda + ", canalDesembolso=" + canalDesembolso
                + ", consentimientoFh=" + consentimientoFh + ", loginMedio="
                + loginMedio + ", loginId=" + loginId + ", detalles=" + detalles
                + ", operaciones=" + operaciones + "]";
    }



}
