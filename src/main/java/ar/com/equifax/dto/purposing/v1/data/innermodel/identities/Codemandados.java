package ar.com.equifax.dto.purposing.v1.data.innermodel.identities;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * @author lxa145
 *
 */
public class Codemandados {

    @JsonProperty("iup_codemandado")
    private Long iupcodemandado;

    public Long getIupcodemandado() {
        return iupcodemandado;
    }

    public void setIupcodemandado(Long iupcodemandado) {
        this.iupcodemandado = iupcodemandado;
    }

    @Override
    public String toString() {
        return "Codemandados [iupcodemandado=" + iupcodemandado + "]";
    }



}
