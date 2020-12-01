package ar.com.equifax.dto.purposing.v1.data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Actividad;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Bloqueo;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Celular;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Documento;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Email;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.IdDigital;


/**
 * @author lxa145
 *
 */
public class DataPerHumana {
    @JsonProperty("documentos")
    private List<Documento> documentos;
    @JsonProperty("nombres")
    private String nombres;
    @JsonProperty("apellidos")
    private String apellidos;
    @JsonProperty("sexo")
    private String sexo;
    @JsonProperty("nacimiento_anio")
    private Integer nacimientoAnio;
    @JsonProperty("nacimiento_fh")
    private Long nacimientoFh;
    @JsonProperty("celulares")
    private List<Celular> celulares;
    @JsonProperty("emails")
    private List<Email> emails;
    @JsonProperty("actividades")
    private List<Actividad> actividades;
    @JsonProperty("fallecido")
    private String fallecido;
    @JsonProperty("fallecido_fh")
    private String fallecidoFh;
    @JsonProperty("sucesion")
    private Boolean sucesion;
    @JsonProperty("sucesion_fh")
    private String sucesionFh;
    @JsonProperty("ids_digitales")
    private List<IdDigital> idsDigitales;
    @JsonProperty("bloqueos")
    private List<Bloqueo> bloqueos;
    @JsonProperty("operaciones")
    private Operaciones operaciones;
    @JsonProperty("validado")
    private Boolean validado;
    @JsonProperty("validado_fh")
    private Integer validadoFh;
    @JsonProperty("validado_fuente")
    private Integer validadoFuente;

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<Documento> documentos) {
        this.documentos = documentos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getNacimientoAnio() {
        return nacimientoAnio;
    }

    public void setNacimientoAnio(Integer nacimientoAnio) {
        this.nacimientoAnio = nacimientoAnio;
    }

    public Long getNacimientoFh() {
        return nacimientoFh;
    }

    public void setNacimientoFh(Long nacimientoFh) {
        this.nacimientoFh = nacimientoFh;
    }

    public List<Celular> getCelulares() {
        return celulares;
    }

    public void setCelulares(List<Celular> celulares) {
        this.celulares = celulares;
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

    public String getFallecidoFh() {
        return fallecidoFh;
    }

    public void setFallecidoFh(String fallecidoFh) {
        this.fallecidoFh = fallecidoFh;
    }

    public Boolean getSucesion() {
        return sucesion;
    }

    public void setSucesion(Boolean sucesion) {
        this.sucesion = sucesion;
    }

    public String getSucesionFh() {
        return sucesionFh;
    }

    public void setSucesionFh(String sucesionFh) {
        this.sucesionFh = sucesionFh;
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

    public Integer getValidadoFh() {
        return validadoFh;
    }

    public void setValidadoFh(Integer validadoFh) {
        this.validadoFh = validadoFh;
    }

    public Integer getValidadoFuente() {
        return validadoFuente;
    }

    public void setValidadoFuente(Integer validadoFuente) {
        this.validadoFuente = validadoFuente;
    }

    public String getFallecido() {
        return fallecido;
    }

    public void setFallecido(String fallecido) {
        this.fallecido = fallecido;
    }

    @Override
    public String toString() {
        return "DataPerHumana [documentos=" + documentos + ", nombres="
                + nombres + ", apellidos=" + apellidos + ", sexo=" + sexo
                + ", nacimientoAnio=" + nacimientoAnio + ", nacimientoFh="
                + nacimientoFh + ", celulares=" + celulares + ", emails="
                + emails + ", actividades=" + actividades + ", fallecido="
                + fallecido + ", fallecidoFh=" + fallecidoFh + ", sucesion="
                + sucesion + ", sucesionFh=" + sucesionFh + ", idsDigitales="
                + idsDigitales + ", bloqueos=" + bloqueos + ", operaciones="
                + operaciones + ", validado=" + validado + ", validadoFh="
                + validadoFh + ", validadoFuente=" + validadoFuente + "]";
    }




}
