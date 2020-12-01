package ar.com.equifax.dto.purposing.v1.data.innermodel.identities;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * @author lxa145
 *
 */
public class Asegurados {


    @JsonProperty("iup_empleado")
    private Long iupEmpleado;
    @JsonProperty("estado")
    private String estado;
    @JsonProperty("art")
    private List<AseguradosArt> art;



    public Long getIupEmpleado() {
        return iupEmpleado;
    }

    public void setIupEmpleado(Long iupEmpleado) {
        this.iupEmpleado = iupEmpleado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<AseguradosArt> getArt() {
        return art;
    }

    public void setArt(List<AseguradosArt> art) {
        this.art = art;
    }

    @Override
    public String toString() {
        return "Asegurados [iupEmpleado=" + iupEmpleado + ", estado=" + estado
                + ", art=" + art + "]";
    }



}
