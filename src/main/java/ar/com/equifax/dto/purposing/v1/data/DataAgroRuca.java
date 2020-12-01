package ar.com.equifax.dto.purposing.v1.data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.ActividadesAgroRuca;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;



/**
 * @author lxa145
 *
 */
public class DataAgroRuca {


    @JsonProperty("matricula")
    private Integer matricula;
    @JsonProperty("actividades")
    private List<ActividadesAgroRuca> actividades;
    @JsonProperty("operaciones")
    private Operaciones operaciones;

    /**
     * @return Integer
     */
    public Integer getMatricula() {
        return matricula;
    }

    /**
     * @param matricula
     */
    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    /**
     * @return List<ActividadesAgroRuca>
     */
    public List<ActividadesAgroRuca> getActividades() {
        return actividades;
    }

    /**
     * @param actividades
     */
    public void setActividades(List<ActividadesAgroRuca> actividades) {
        this.actividades = actividades;
    }

    /**
     * @return Operaciones
     */
    public Operaciones getOperaciones() {
        return operaciones;
    }

    /**
     * @param operaciones
     */
    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }


    @Override
    public String toString() {
        return "DataAgroRuca [matricula=" + matricula + ", actividades="
                + actividades + ", operaciones=" + operaciones + "]";
    }



}
