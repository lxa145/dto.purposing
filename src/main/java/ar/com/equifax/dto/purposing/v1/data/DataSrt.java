package ar.com.equifax.dto.purposing.v1.data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Asegurados;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Contratos;


/**
 * @author lxa145
 *
 */
public class DataSrt {


    @JsonProperty("afiliaciones")
    private Integer afiliaciones;
    @JsonProperty("extinciones")
    private Integer extinciones;
    @JsonProperty("contratos")
    private List<Contratos> contratos;
    @JsonProperty("asegurados")
    private List<Asegurados> asegurados;
    @JsonProperty("operaciones")
    private Operaciones operaciones;


    public Integer getAfiliaciones() {
        return afiliaciones;
    }

    public void setAfiliaciones(Integer afiliaciones) {
        this.afiliaciones = afiliaciones;
    }

    public Integer getExtinciones() {
        return extinciones;
    }

    public void setExtinciones(Integer extinciones) {
        this.extinciones = extinciones;
    }

    public List<Contratos> getContratos() {
        return contratos;
    }

    public void setContratos(List<Contratos> contratos) {
        this.contratos = contratos;
    }

    public List<Asegurados> getAsegurados() {
        return asegurados;
    }

    public void setAsegurados(List<Asegurados> asegurados) {
        this.asegurados = asegurados;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }

    @Override
    public String toString() {
        return "DataSrt [afiliaciones=" + afiliaciones + ", extinciones="
                + extinciones + ", contratos=" + contratos + ", asegurados="
                + asegurados + ", operaciones=" + operaciones + "]";
    }



}
