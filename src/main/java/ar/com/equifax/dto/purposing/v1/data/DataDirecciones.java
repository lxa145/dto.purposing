package ar.com.equifax.dto.purposing.v1.data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Direccion;


/**
 * @author lxa145
 *
 */
public class DataDirecciones {

    @JsonProperty("direccion")
    private List<Direccion> direccion;
    @JsonProperty("operaciones")
    private Operaciones operaciones;


    public List<Direccion> getDireccion() {
        return direccion;
    }

    public void setDireccion(List<Direccion> direccion) {
        this.direccion = direccion;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }

    @Override
    public String toString() {
        return "DataDirecciones [direccion=" + direccion + ", operaciones="
                + operaciones + "]";
    }



}
