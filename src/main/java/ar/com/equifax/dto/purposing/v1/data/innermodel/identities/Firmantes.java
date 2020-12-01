package ar.com.equifax.dto.purposing.v1.data.innermodel.identities;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * @author lxa145
 *
 */
public class Firmantes {

    @JsonProperty("iup_firmante")
    private Long iupFirmante;

    public Long getIupFirmante() {
        return iupFirmante;
    }

    public void setIupFirmante(Long iupFirmante) {
        this.iupFirmante = iupFirmante;
    }

    @Override
    public String toString() {
        return "Firmantes [iupFirmante=" + iupFirmante + "]";
    }



}
