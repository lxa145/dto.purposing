package ar.com.equifax.dto.purposing.v1.data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Actividad;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Bloqueo;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Documento;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Email;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.IdDigital;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.TipoSocietario;


/**
 * @author lxa145
 *
 */
public class DataPerJuridica {

    @JsonProperty("documentos")
    private List<Documento> documentos;
    @JsonProperty("denominacion")
    private String denominacion;
    @JsonProperty("nombre_fantasia")
    private String nombreFantasia;
    @JsonProperty("tipo_societario")
    private TipoSocietario tipoSocietario;
    @JsonProperty("inscripcion_fh")
    private Integer inscripcionFh;
    @JsonProperty("contrato_social_fh")
    private String contratoSocialFh;
    @JsonProperty("emails")
    private List<Email> emails;
    @JsonProperty("actividades")
    private List<Actividad> actividades;
    @JsonProperty("baja")
    private Boolean baja;
    @JsonProperty("baja_fh")
    private String bajaFh;
    @JsonProperty("ids_digitales")
    private List<IdDigital> idsDigitales;
    @JsonProperty("bloqueos")
    private List<Bloqueo> bloqueos;
    @JsonProperty("operaciones")
    private Operaciones operaciones;
    @JsonProperty("validado")
    private Boolean validado;
    @JsonProperty("validado_fh")
    private String validadoFh;
    @JsonProperty("validado_fuente")
    private String validadoFuente;


    public List<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<Documento> documentos) {
        this.documentos = documentos;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getNombreFantasia() {
        return nombreFantasia;
    }

    public void setNombreFantasia(String nombreFantasia) {
        this.nombreFantasia = nombreFantasia;
    }

    public TipoSocietario getTipoSocietario() {
        return tipoSocietario;
    }

    public void setTipoSocietario(TipoSocietario tipoSocietario) {
        this.tipoSocietario = tipoSocietario;
    }

    public Integer getInscripcionFh() {
        return inscripcionFh;
    }

    public void setInscripcionFh(Integer inscripcionFh) {
        this.inscripcionFh = inscripcionFh;
    }

    public String getContratoSocialFh() {
        return contratoSocialFh;
    }

    public void setContratoSocialFh(String contratoSocialFh) {
        this.contratoSocialFh = contratoSocialFh;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public List<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(List<Actividad> actividades) {
        this.actividades = actividades;
    }

    public Boolean getBaja() {
        return baja;
    }

    public void setBaja(Boolean baja) {
        this.baja = baja;
    }

    public String getBajaFh() {
        return bajaFh;
    }

    public void setBajaFh(String bajaFh) {
        this.bajaFh = bajaFh;
    }

    public List<IdDigital> getIdsDigitales() {
        return idsDigitales;
    }

    public void setIdsDigitales(List<IdDigital> idsDigitales) {
        this.idsDigitales = idsDigitales;
    }

    public List<Bloqueo> getBloqueos() {
        return bloqueos;
    }

    public void setBloqueos(List<Bloqueo> bloqueos) {
        this.bloqueos = bloqueos;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }

    public Boolean getValidado() {
        return validado;
    }

    public void setValidado(Boolean validado) {
        this.validado = validado;
    }

    public String getValidadoFh() {
        return validadoFh;
    }

    public void setValidadoFh(String validadoFh) {
        this.validadoFh = validadoFh;
    }

    public String getValidadoFuente() {
        return validadoFuente;
    }

    public void setValidadoFuente(String validadoFuente) {
        this.validadoFuente = validadoFuente;
    }


    @Override
    public String toString() {
        return "DataPerJuridica [documentos=" + documentos + ", denominacion="
                + denominacion + ", nombreFantasia=" + nombreFantasia
                + ", tipoSocietario=" + tipoSocietario + ", inscripcionFh="
                + inscripcionFh + ", contratoSocialFh=" + contratoSocialFh
                + ", emails=" + emails + ", actividades=" + actividades
                + ", baja=" + baja + ", bajaFh=" + bajaFh + ", idsDigitales="
                + idsDigitales + ", bloqueos=" + bloqueos + ", operaciones="
                + operaciones + ", validado=" + validado + ", validadoFh="
                + validadoFh + ", validadoFuente=" + validadoFuente + "]";
    }



}
