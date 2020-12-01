package ar.com.equifax.dto.purposing.v1.data.innermodel;

import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * @author lxa145
 *
 */
public class ConsultaAdhSucursal {

    @JsonProperty("codigo")
    private String codigo;
    @JsonProperty("descripcion")
    private String descripcion;


    /**
     * @return
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     *
     */
    @Override
    public String toString() {
        return "ConsultaAdhSucursal [codigo=" + codigo + ", descripcion="
                + descripcion + "]";
    }



}
