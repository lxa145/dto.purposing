package ar.com.equifax.dto.purposing.v1.data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.DetallesJuiciosEjecu;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Codemandados;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.ImpuestoCod;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Provincia;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Tipo;


/**
 * @author lxa145
 *
 */
public class DataJuiciosEjecu {

    @JsonProperty("demandado_principal")
    private Boolean demandadoPrincipal;
    @JsonProperty("codemandados")
    private List<Codemandados> codemandados;
    @JsonProperty("inicio_fh")
    private Integer inicioFh;
    @JsonProperty("alta_fh")
    private Integer altaFh;
    @JsonProperty("tipo")
    private Tipo tipo;
    @JsonProperty("provincia")
    private Provincia provincia;
    @JsonProperty("localidad")
    private String localidad;
    @JsonProperty("juzgado_nro")
    private String juzgadoNro;
    @JsonProperty("juzgado_tipo")
    private String juzgadoTipo;
    @JsonProperty("secretaria")
    private String secretaria;
    @JsonProperty("expediente_nro")
    private String expedienteNro;
    @JsonProperty("juicio_nro")
    private String juicioNro;
    @JsonProperty("demandante")
    private String demandante;
    @JsonProperty("impuesto_cod")
    private ImpuestoCod impuestoCod;
    @JsonProperty("detalles")
    private List<DetallesJuiciosEjecu> detalles;
    @JsonProperty("operaciones")
    private Operaciones operaciones;


    public Boolean getDemandadoPrincipal() {
        return demandadoPrincipal;
    }

    public void setDemandadoPrincipal(Boolean demandadoPrincipal) {
        this.demandadoPrincipal = demandadoPrincipal;
    }

    public List<Codemandados> getCodemandados() {
        return codemandados;
    }

    public void setCodemandados(List<Codemandados> codemandados) {
        this.codemandados = codemandados;
    }

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

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getJuzgadoNro() {
        return juzgadoNro;
    }

    public void setJuzgadoNro(String juzgadoNro) {
        this.juzgadoNro = juzgadoNro;
    }



    public String getJuzgadoTipo() {
        return juzgadoTipo;
    }

    public void setJuzgadoTipo(String juzgadoTipo) {
        this.juzgadoTipo = juzgadoTipo;
    }

    public String getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(String secretaria) {
        this.secretaria = secretaria;
    }

    public String getExpedienteNro() {
        return expedienteNro;
    }

    public void setExpedienteNro(String expedienteNro) {
        this.expedienteNro = expedienteNro;
    }


    public String getJuicioNro() {
        return juicioNro;
    }

    public void setJuicioNro(String juicioNro) {
        this.juicioNro = juicioNro;
    }

    public String getDemandante() {
        return demandante;
    }

    public void setDemandante(String demandante) {
        this.demandante = demandante;
    }

    public ImpuestoCod getImpuestoCod() {
        return impuestoCod;
    }

    public void setImpuestoCod(ImpuestoCod impuestoCod) {
        this.impuestoCod = impuestoCod;
    }

    public List<DetallesJuiciosEjecu> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallesJuiciosEjecu> detalles) {
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
        return "DataJuiciosEjecu [demandadoPrincipal=" + demandadoPrincipal
                + ", codemandados=" + codemandados + ", inicioFh=" + inicioFh
                + ", altaFh=" + altaFh + ", tipo=" + tipo + ", provincia="
                + provincia + ", localidad=" + localidad + ", juzgadoNro="
                + juzgadoNro + ", juzgadoTipo=" + juzgadoTipo + ", secretaria="
                + secretaria + ", expedienteNro=" + expedienteNro
                + ", juicioNro=" + juicioNro + ", demandante=" + demandante
                + ", impuestoCod=" + impuestoCod + ", detalles=" + detalles
                + ", operaciones=" + operaciones + "]";
    }



}
