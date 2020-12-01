package ar.com.equifax.dto.purposing.v1.data.innermodel.identities;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * @author lxa145
 *
 */
public class IdDigital {

    @JsonProperty("tipo")
    private String tipo;
    @JsonProperty("descripcion")
    private String descripcion;
    @JsonProperty("id")
    private String id;


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "IdDigital [tipo=" + tipo + ", descripcion=" + descripcion
                + ", id=" + id + "]";
    }



}
