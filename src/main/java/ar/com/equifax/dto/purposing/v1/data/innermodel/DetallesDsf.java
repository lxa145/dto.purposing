package ar.com.equifax.dto.purposing.v1.data.innermodel;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Asistencias;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.CodMipyme;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Situacion;



/**
 * @author lxa145
 *
 */
public class DetallesDsf {


    @JsonProperty("periodo")
    private Integer periodo;
    @JsonProperty("situacion")
    private Situacion situacion;
    @JsonProperty("moneda")
    private String moneda;
    @JsonProperty("deuda_total")
    private Double deudaTotal;

    @JsonProperty("monto_prestamos")
    private Double montoPrestamos;
    @JsonProperty("monto_participaciones")
    private Double montoParticipaciones;
    @JsonProperty("monto_garant_otorgadas")
    private Double montoGarantOtorgadas;
    @JsonProperty("monto_otros_conceptos")
    private Double montoOtrosConceptos;
    @JsonProperty("monto_garant_pref_a")
    private Double montoGarantPrefa;
    @JsonProperty("monto_garant_pref_b")
    private Double montoGarantPrefb;
    @JsonProperty("monto_sin_garant_pref")
    private Double montoSinGarantPref;
    @JsonProperty("monto_contragarant_pref_a")
    private Double montoContragarantPrefa;
    @JsonProperty("monto_contragarant_pref_b")
    private Double montoContragarantPrefb;
    @JsonProperty("monto_sin_contragarant_pref")
    private Double montoSinContragarantPref;
    @JsonProperty("monto_previsiones")
    private Double montoPrevisiones;
    @JsonProperty("monto_previsiones_asist_cred")
    private Double montoPrevisionesAsistCred;
    @JsonProperty("monto_previsiones_particip")
    private Double montoPrevisionesParticip;
    @JsonProperty("monto_previsiones_responsab")
    private Double montoPrevisionesResponsab;
    @JsonProperty("monto_inc_prev_min_gral")
    private Double montoIncPrevMinGral;
    @JsonProperty("monto_inc_prev_min_normas")
    private Double montoIncPrevMinNormas;
    @JsonProperty("monto_max_asist_cli_vinc")
    private Double montoMaxAsistCliVinc;


    @JsonProperty("deuda_cubierta")
    private Boolean deudaCubierta;
    @JsonProperty("en_proc_jud")
    private Boolean enProcJud;
    @JsonProperty("en_revision")
    private Boolean enRevision;
    @JsonProperty("tiene_refinanciaciones")
    private Boolean tieneRefinanciaciones;
    @JsonProperty("tiene_recateg_oblig")
    private Boolean tieneRecategOblig;
    @JsonProperty("tiene_situac_juridica")
    private Boolean tieneSituacJuridica;
    @JsonProperty("es_irrecuperable")
    private Boolean esIrrecuperable;


    @JsonProperty("esta_vinculado_entidad")
    private Integer estaVinculadoEntidad;
    @JsonProperty("dias_atraso")
    private Integer diasAtraso;

    @JsonProperty("cod_mipyme")
    private CodMipyme codMipyme;


    @JsonProperty("asistencias")
    private List<Asistencias> asistencias;


    public Integer getPeriodo() {
        return periodo;
    }


    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }


    public Situacion getSituacion() {
        return situacion;
    }


    public void setSituacion(Situacion situacion) {
        this.situacion = situacion;
    }


    public String getMoneda() {
        return moneda;
    }


    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }


    public Double getDeudaTotal() {
        return deudaTotal;
    }


    public void setDeudaTotal(Double deudaTotal) {
        this.deudaTotal = deudaTotal;
    }


    public Double getMontoPrestamos() {
        return montoPrestamos;
    }


    public void setMontoPrestamos(Double montoPrestamos) {
        this.montoPrestamos = montoPrestamos;
    }


    public Double getMontoParticipaciones() {
        return montoParticipaciones;
    }


    public void setMontoParticipaciones(Double montoParticipaciones) {
        this.montoParticipaciones = montoParticipaciones;
    }


    public Double getMontoGarantOtorgadas() {
        return montoGarantOtorgadas;
    }


    public void setMontoGarantOtorgadas(Double montoGarantOtorgadas) {
        this.montoGarantOtorgadas = montoGarantOtorgadas;
    }


    public Double getMontoOtrosConceptos() {
        return montoOtrosConceptos;
    }


    public void setMontoOtrosConceptos(Double montoOtrosConceptos) {
        this.montoOtrosConceptos = montoOtrosConceptos;
    }


    public Double getMontoGarantPrefa() {
        return montoGarantPrefa;
    }


    public void setMontoGarantPrefa(Double montoGarantPrefa) {
        this.montoGarantPrefa = montoGarantPrefa;
    }


    public Double getMontoGarantPrefb() {
        return montoGarantPrefb;
    }


    public void setMontoGarantPrefb(Double montoGarantPrefb) {
        this.montoGarantPrefb = montoGarantPrefb;
    }


    public Double getMontoSinGarantPref() {
        return montoSinGarantPref;
    }


    public void setMontoSinGarantPref(Double montoSinGarantPref) {
        this.montoSinGarantPref = montoSinGarantPref;
    }


    public Double getMontoContragarantPrefa() {
        return montoContragarantPrefa;
    }


    public void setMontoContragarantPrefa(Double montoContragarantPrefa) {
        this.montoContragarantPrefa = montoContragarantPrefa;
    }


    public Double getMontoContragarantPrefb() {
        return montoContragarantPrefb;
    }


    public void setMontoContragarantPrefb(Double montoContragarantPrefb) {
        this.montoContragarantPrefb = montoContragarantPrefb;
    }


    public Double getMontoSinContragarantPref() {
        return montoSinContragarantPref;
    }


    public void setMontoSinContragarantPref(Double montoSinContragarantPref) {
        this.montoSinContragarantPref = montoSinContragarantPref;
    }


    public Double getMontoPrevisiones() {
        return montoPrevisiones;
    }


    public void setMontoPrevisiones(Double montoPrevisiones) {
        this.montoPrevisiones = montoPrevisiones;
    }


    public Double getMontoPrevisionesAsistCred() {
        return montoPrevisionesAsistCred;
    }


    public void setMontoPrevisionesAsistCred(Double montoPrevisionesAsistCred) {
        this.montoPrevisionesAsistCred = montoPrevisionesAsistCred;
    }


    public Double getMontoPrevisionesParticip() {
        return montoPrevisionesParticip;
    }


    public void setMontoPrevisionesParticip(Double montoPrevisionesParticip) {
        this.montoPrevisionesParticip = montoPrevisionesParticip;
    }


    public Double getMontoPrevisionesResponsab() {
        return montoPrevisionesResponsab;
    }


    public void setMontoPrevisionesResponsab(Double montoPrevisionesResponsab) {
        this.montoPrevisionesResponsab = montoPrevisionesResponsab;
    }


    public Double getMontoIncPrevMinGral() {
        return montoIncPrevMinGral;
    }


    public void setMontoIncPrevMinGral(Double montoIncPrevMinGral) {
        this.montoIncPrevMinGral = montoIncPrevMinGral;
    }


    public Double getMontoIncPrevMinNormas() {
        return montoIncPrevMinNormas;
    }


    public void setMontoIncPrevMinNormas(Double montoIncPrevMinNormas) {
        this.montoIncPrevMinNormas = montoIncPrevMinNormas;
    }


    public Double getMontoMaxAsistCliVinc() {
        return montoMaxAsistCliVinc;
    }


    public void setMontoMaxAsistCliVinc(Double montoMaxAsistCliVinc) {
        this.montoMaxAsistCliVinc = montoMaxAsistCliVinc;
    }


    public Boolean getDeudaCubierta() {
        return deudaCubierta;
    }


    public void setDeudaCubierta(Boolean deudaCubierta) {
        this.deudaCubierta = deudaCubierta;
    }


    public Boolean getEnProcJud() {
        return enProcJud;
    }


    public void setEnProcJud(Boolean enProcJud) {
        this.enProcJud = enProcJud;
    }


    public Boolean getEnRevision() {
        return enRevision;
    }


    public void setEnRevision(Boolean enRevision) {
        this.enRevision = enRevision;
    }


    public Boolean getTieneRefinanciaciones() {
        return tieneRefinanciaciones;
    }


    public void setTieneRefinanciaciones(Boolean tieneRefinanciaciones) {
        this.tieneRefinanciaciones = tieneRefinanciaciones;
    }


    public Boolean getTieneRecategOblig() {
        return tieneRecategOblig;
    }


    public void setTieneRecategOblig(Boolean tieneRecategOblig) {
        this.tieneRecategOblig = tieneRecategOblig;
    }


    public Boolean getTieneSituacJuridica() {
        return tieneSituacJuridica;
    }


    public void setTieneSituacJuridica(Boolean tieneSituacJuridica) {
        this.tieneSituacJuridica = tieneSituacJuridica;
    }


    public Boolean getEsIrrecuperable() {
        return esIrrecuperable;
    }


    public void setEsIrrecuperable(Boolean esIrrecuperable) {
        this.esIrrecuperable = esIrrecuperable;
    }


    public Integer getEstaVinculadoEntidad() {
        return estaVinculadoEntidad;
    }


    public void setEstaVinculadoEntidad(Integer estaVinculadoEntidad) {
        this.estaVinculadoEntidad = estaVinculadoEntidad;
    }


    public Integer getDiasAtraso() {
        return diasAtraso;
    }


    public void setDiasAtraso(Integer diasAtraso) {
        this.diasAtraso = diasAtraso;
    }


    public CodMipyme getCodMipyme() {
        return codMipyme;
    }


    public void setCodMipyme(CodMipyme codMipyme) {
        this.codMipyme = codMipyme;
    }


    public List<Asistencias> getAsistencias() {
        return asistencias;
    }


    public void setAsistencias(List<Asistencias> asistencias) {
        this.asistencias = asistencias;
    }


    @Override
    public String toString() {
        return "DetallesDsf [periodo=" + periodo + ", situacion=" + situacion
                + ", moneda=" + moneda + ", deudaTotal=" + deudaTotal
                + ", montoPrestamos=" + montoPrestamos
                + ", montoParticipaciones=" + montoParticipaciones
                + ", montoGarantOtorgadas=" + montoGarantOtorgadas
                + ", montoOtrosConceptos=" + montoOtrosConceptos
                + ", montoGarantPrefa=" + montoGarantPrefa
                + ", montoGarantPrefb=" + montoGarantPrefb
                + ", montoSinGarantPref=" + montoSinGarantPref
                + ", montoContragarantPrefa=" + montoContragarantPrefa
                + ", montoContragarantPrefb=" + montoContragarantPrefb
                + ", montoSinContragarantPref=" + montoSinContragarantPref
                + ", montoPrevisiones=" + montoPrevisiones
                + ", montoPrevisionesAsistCred=" + montoPrevisionesAsistCred
                + ", montoPrevisionesParticip=" + montoPrevisionesParticip
                + ", montoPrevisionesResponsab=" + montoPrevisionesResponsab
                + ", montoIncPrevMinGral=" + montoIncPrevMinGral
                + ", montoIncPrevMinNormas=" + montoIncPrevMinNormas
                + ", montoMaxAsistCliVinc=" + montoMaxAsistCliVinc
                + ", deudaCubierta=" + deudaCubierta + ", enProcJud="
                + enProcJud + ", enRevision=" + enRevision
                + ", tieneRefinanciaciones=" + tieneRefinanciaciones
                + ", tieneRecategOblig=" + tieneRecategOblig
                + ", tieneSituacJuridica=" + tieneSituacJuridica
                + ", esIrrecuperable=" + esIrrecuperable
                + ", estaVinculadoEntidad=" + estaVinculadoEntidad
                + ", diasAtraso=" + diasAtraso + ", codMipyme=" + codMipyme
                + ", asistencias=" + asistencias + "]";
    }



}
