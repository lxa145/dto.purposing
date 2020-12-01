package ar.com.equifax.dto.purposing.v1.data.innermodel.identities;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * @author lxa145
 *
 */
public class EstadoContratosSrt {


    @JsonProperty("generado")
    private String generado;

    public String getGenerado() {
        return generado;
    }

    public void setGenerado(String generado) {
        this.generado = generado;
    }

    @Override
    public String toString() {
        return "EstadoContratosSrt [generado=" + generado + "]";
    }



}
