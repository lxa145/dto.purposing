package ar.com.equifax.dto.purposing.v1.data.innermodel.identities;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author lxa145
 *
 */
public class Bloqueo {

    @JsonProperty("codigo")
    private String codigo;
    @JsonProperty("descripcion")
    private String descripcion;
    @JsonProperty("fecha")
    private String fecha;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    @Override
    public String toString() {
        return "Bloqueo [codigo=" + codigo + ", descripcion=" + descripcion
                + ", fecha=" + fecha + "]";
    }



}
