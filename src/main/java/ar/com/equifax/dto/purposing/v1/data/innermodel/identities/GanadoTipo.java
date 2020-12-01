package ar.com.equifax.dto.purposing.v1.data.innermodel.identities;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * @author lxa145
 *
 */
public class GanadoTipo {


    @JsonProperty("descripcion")
    private String descripcion;
    @JsonProperty("valor")
    private Boolean valor;


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getValor() {
        return valor;
    }

    public void setValor(Boolean valor) {
        this.valor = valor;
    }


    @Override
    public String toString() {
        return "GanadoTipo [descripcion=" + descripcion + ", valor=" + valor
                + "]";
    }



}
