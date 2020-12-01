package ar.com.equifax.dto.purposing.v1.data.innermodel.identities;

import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * @author lxa145
 *
 */
public class BloqueInfo {

    @JsonProperty("bloque_cod")
    private String bloqueCod;
    @JsonProperty("bloque_nombre")
    private String bloqueNombre;


    public String getBloqueCod() {
        return bloqueCod;
    }

    public void setBloqueCod(String bloqueCod) {
        this.bloqueCod = bloqueCod;
    }

    public String getBloqueNombre() {
        return bloqueNombre;
    }

    public void setBloqueNombre(String bloqueNombre) {
        this.bloqueNombre = bloqueNombre;
    }


    @Override
    public String toString() {
        return "BloqueInfo [bloqueCod=" + bloqueCod + ", bloqueNombre="
                + bloqueNombre + "]";
    }



}
