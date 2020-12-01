package ar.com.equifax.dto.purposing.v1.data.innermodel.identities;

import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * @author lxa145
 *
 */
public class Celular {

    @JsonProperty("cod_pais")
    private Integer codPais;
    @JsonProperty("cod_area")
    private Integer codArea;
    @JsonProperty("numero")
    private Long numero;
    @JsonProperty("tiene_optin")
    private Boolean tieneOptin;
    @JsonProperty("bloqueado")
    private Boolean bloqueado;
    @JsonProperty("ult_aporte_fh")
    private Long ultAporteFh;

    public Integer getCodPais() {
        return codPais;
    }

    public void setCodPais(Integer codPais) {
        this.codPais = codPais;
    }

    public Integer getCodArea() {
        return codArea;
    }

    public void setCodArea(Integer codArea) {
        this.codArea = codArea;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Boolean getTieneOptin() {
        return tieneOptin;
    }

    public void setTieneOptin(Boolean tieneOptin) {
        this.tieneOptin = tieneOptin;
    }

    public Boolean getBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(Boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public Long getUltAporteFh() {
        return ultAporteFh;
    }

    public void setUltAporteFh(Long ultAporteFh) {
        this.ultAporteFh = ultAporteFh;
    }

    @Override
    public String toString() {
        return "Celular [codPais=" + codPais + ", codArea=" + codArea
                + ", numero=" + numero + ", tieneOptin=" + tieneOptin
                + ", bloqueado=" + bloqueado + ", ultAporteFh=" + ultAporteFh
                + "]";
    }



}
