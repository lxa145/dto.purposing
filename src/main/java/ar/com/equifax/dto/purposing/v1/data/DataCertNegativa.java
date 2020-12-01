package ar.com.equifax.dto.purposing.v1.data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Prestaciones;



/**
 * @author lxa145
 *
 */
public class DataCertNegativa {


    @JsonProperty("periodo")
    private Integer periodo;
    @JsonProperty("prestaciones")
    private List<Prestaciones> prestaciones;
    @JsonProperty("operaciones")
    private Operaciones operaciones;


    public Integer getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    public List<Prestaciones> getPrestaciones() {
        return prestaciones;
    }

    public void setPrestaciones(List<Prestaciones> prestaciones) {
        this.prestaciones = prestaciones;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }


    @Override
    public String toString() {
        return "DataCertNegativa [periodo=" + periodo + ", prestaciones="
                + prestaciones + ", operaciones=" + operaciones + "]";
    }



}
