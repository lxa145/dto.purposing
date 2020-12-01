package ar.com.equifax.dto.purposing.v1.data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Condicion;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.IdObraSocial;


/**
 * @author lxa145
 *
 */
public class DataObraSocial {

    @JsonProperty("periodo")
    private Integer periodo;
    @JsonProperty("obra_social")
    private List<IdObraSocial> obraSocial;
    @JsonProperty("inicio_cobertura_fh")
    private Integer inicioCoberturaFh;
    @JsonProperty("fin_cobertura_fh")
    private Integer finCoberturaFh;
    @JsonProperty("condicion")
    private Condicion condicion;
    @JsonProperty("operaciones")
    private Operaciones operaciones;


    public Integer getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    public List<IdObraSocial> getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(List<IdObraSocial> obraSocial) {
        this.obraSocial = obraSocial;
    }

    public Integer getInicioCoberturaFh() {
        return inicioCoberturaFh;
    }

    public void setInicioCoberturaFh(Integer inicioCoberturaFh) {
        this.inicioCoberturaFh = inicioCoberturaFh;
    }

    public Integer getFinCoberturaFh() {
        return finCoberturaFh;
    }

    public void setFinCoberturaFh(Integer finCoberturaFh) {
        this.finCoberturaFh = finCoberturaFh;
    }



    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }

    public Condicion getCondicion() {
        return condicion;
    }

    public void setCondicion(Condicion condicion) {
        this.condicion = condicion;
    }

    @Override
    public String toString() {
        return "DataObraSocial [periodo=" + periodo + ", obraSocial="
                + obraSocial + ", inicioCoberturaFh=" + inicioCoberturaFh
                + ", finCoberturaFh=" + finCoberturaFh + ", condicion="
                + condicion + ", operaciones=" + operaciones + "]";
    }




}
