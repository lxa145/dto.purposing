package ar.com.equifax.dto.purposing.v1.data.innermodel.identities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import ar.com.equifax.dto.purposing.v1.data.innermodel.Aportes;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;


/**
 * @author lxa145
 *
 */
public class IdTelefonos {

    @JsonProperty("tel_id")
    private Long telId;
    @JsonProperty("cod_pais")
    private Integer codPais;
    @JsonProperty("cod_area")
    private String codArea;
    @JsonProperty("numero")
    private String numero;
    @JsonProperty("es_celular")
    private Boolean esCelular;
    @JsonProperty("tiene_optin")
    private Boolean tieneOptin;
    @JsonProperty("tiene_optin_desde_fh")
    private Long tieneOptinDesdeFh;
    @JsonProperty("bloqueado")
    private Boolean bloqueado;
    @JsonProperty("bloqueado_desde_fh")
    private Long bloqueadoDesdeFh;
    @JsonProperty("validado")
    private Boolean validado;
    @JsonProperty("validado_fh")
    private Integer validadoFh;
    @JsonProperty("aportes")
    private List<Aportes> aportes;
    @JsonProperty("operaciones")
    private Operaciones operaciones;

    public Long getTelId() {
        return telId;
    }

    public void setTelId(Long telId) {
        this.telId = telId;
    }

    public Integer getCodPais() {
        return codPais;
    }

    public void setCodPais(Integer codPais) {
        this.codPais = codPais;
    }

    public String getCodArea() {
        return codArea;
    }

    public void setCodArea(String codArea) {
        this.codArea = codArea;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Boolean getEsCelular() {
        return esCelular;
    }

    public void setEsCelular(Boolean esCelular) {
        this.esCelular = esCelular;
    }

    public Boolean getTieneOptin() {
        return tieneOptin;
    }

    public void setTieneOptin(Boolean tieneOptin) {
        this.tieneOptin = tieneOptin;
    }

    public Long getTieneOptinDesdeFh() {
        return tieneOptinDesdeFh;
    }

    public void setTieneOptinDesdeFh(Long tieneOptinDesdeFh) {
        this.tieneOptinDesdeFh = tieneOptinDesdeFh;
    }

    public Boolean getBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(Boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public Long getBloqueadoDesdeFh() {
        return bloqueadoDesdeFh;
    }

    public void setBloqueadoDesdeFh(Long bloqueadoDesdeFh) {
        this.bloqueadoDesdeFh = bloqueadoDesdeFh;
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

    public List<Aportes> getAportes() {
        return aportes;
    }

    public void setAportes(List<Aportes> aportes) {
        this.aportes = aportes;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }

    @Override
    public String toString() {
        return "IdTelefonos [telId=" + telId + ", codPais=" + codPais
                + ", codArea=" + codArea + ", numero=" + numero + ", esCelular="
                + esCelular + ", tieneOptin=" + tieneOptin
                + ", tieneOptinDesdeFh=" + tieneOptinDesdeFh + ", bloqueado="
                + bloqueado + ", bloqueadoDesdeFh=" + bloqueadoDesdeFh
                + ", validado=" + validado + ", validadoFh=" + validadoFh
                + ", aportes=" + aportes + ", operaciones=" + operaciones + "]";
    }



}
