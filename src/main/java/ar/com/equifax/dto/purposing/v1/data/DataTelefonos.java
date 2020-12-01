package ar.com.equifax.dto.purposing.v1.data;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.IdTelefonos;



/**
 * @author lxa145
 *
 */
public class DataTelefonos {

    @JsonProperty("telefonos")
    private List<IdTelefonos> telefonos;

    @JsonProperty("operaciones")
    private Operaciones operaciones;

    public List<IdTelefonos> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<IdTelefonos> telefonos) {
        this.telefonos = telefonos;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }

    @Override
    public String toString() {
        return "DataTelefonos [telefonos=" + telefonos + ", operaciones="
                + operaciones + "]";
    }



}
