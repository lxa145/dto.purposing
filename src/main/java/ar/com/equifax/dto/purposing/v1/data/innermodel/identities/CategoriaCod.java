package ar.com.equifax.dto.purposing.v1.data.innermodel.identities;

import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * @author lxa145
 *
 */
public class CategoriaCod {

    @JsonProperty("codigo")
    private Integer codigo;
    @JsonProperty("descripcion")
    private String descripcion;


    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    @Override
    public String toString() {
        return "CategoriaCod [codigo=" + codigo + ", descripcion=" + descripcion
                + "]";
    }



}
