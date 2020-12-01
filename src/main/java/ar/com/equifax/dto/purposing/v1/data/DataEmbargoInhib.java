package ar.com.equifax.dto.purposing.v1.data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.DetallesEmbargoInhib;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;
import ar.com.equifax.dto.purposing.v1.data.innermodel.TipoEmbargoInhib;



/**
 * @author lxa145
 *
 */
public class DataEmbargoInhib {

    @JsonProperty("inicio_fh")
    private Integer inicioFh;
    @JsonProperty("alta_fh")
    private Integer altaFh;
    @JsonProperty("tipo")
    private TipoEmbargoInhib tipo;
    @JsonProperty("juzgado_nro")
    private Integer juzgadoNro;
    @JsonProperty("expediente_nro")
    private Integer expedienteNro;
    @JsonProperty("caratula")
    private String caratula;
    @JsonProperty("detalles")
    private List<DetallesEmbargoInhib> detalles;
    @JsonProperty("operaciones")
    private Operaciones operaciones;


    public Integer getInicioFh() {
        return inicioFh;
    }

    public void setInicioFh(Integer inicioFh) {
        this.inicioFh = inicioFh;
    }

    public Integer getAltaFh() {
        return altaFh;
    }

    public void setAltaFh(Integer altaFh) {
        this.altaFh = altaFh;
    }

    public TipoEmbargoInhib getTipo() {
        return tipo;
    }

    public void setTipo(TipoEmbargoInhib tipo) {
        this.tipo = tipo;
    }



    public Integer getJuzgadoNro() {
        return juzgadoNro;
    }

    public void setJuzgadoNro(Integer juzgadoNro) {
        this.juzgadoNro = juzgadoNro;
    }


    public Integer getExpedienteNro() {
        return expedienteNro;
    }

    public void setExpedienteNro(Integer expedienteNro) {
        this.expedienteNro = expedienteNro;
    }

    public String getCaratula() {
        return caratula;
    }

    public void setCaratula(String caratula) {
        this.caratula = caratula;
    }

    public List<DetallesEmbargoInhib> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallesEmbargoInhib> detalles) {
        this.detalles = detalles;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }

    @Override
    public String toString() {
        return "DataEmbargoInhib [inicioFh=" + inicioFh + ", altaFh=" + altaFh
                + ", tipo=" + tipo + ", juzgadoNro=" + juzgadoNro
                + ", expedienteNro=" + expedienteNro + ", caratula=" + caratula
                + ", detalles=" + detalles + ", operaciones=" + operaciones
                + "]";
    }



}
