package ar.com.equifax.dto.purposing.v1.data.innermodel.identities;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author lxa145
 *
 */
public class Email {

    @JsonProperty("direccion")
    private String direccion;
    @JsonProperty("tiene_optin")
    private Boolean tieneOptin;
    @JsonProperty("ult_aporte_fh")
    private Long ultAporteFh;


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getTieneOptin() {
        return tieneOptin;
    }

    public void setTieneOptin(Boolean tieneOptin) {
        this.tieneOptin = tieneOptin;
    }

    public Long getUltAporteFh() {
        return ultAporteFh;
    }

    public void setUltAporteFh(Long ultAporteFh) {
        this.ultAporteFh = ultAporteFh;
    }


    @Override
    public String toString() {
        return "Email [direccion=" + direccion + ", tieneOptin=" + tieneOptin
                + ", ultAporteFh=" + ultAporteFh + "]";
    }



}
