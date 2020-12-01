package ar.com.equifax.dto.purposing.v1.data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.DetallesQuiebraMediacion;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Provincia;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Tipo;



/**
 * @author lxa145
 *
 */
public class DataQuiebraMediacion {


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
    @JsonProperty("verif_hasta_fh")
    private Integer verifHastaFh;
    @JsonProperty("sindico")
    private String sindico;
    @JsonProperty("direccion_sindico")
    private String direccionSindico;
    @JsonProperty("detalles")
    private List<DetallesQuiebraMediacion> detalles;
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

    public Integer getVerifHastaFh() {
        return verifHastaFh;
    }

    public void setVerifHastaFh(Integer verifHastaFh) {
        this.verifHastaFh = verifHastaFh;
    }

    public String getSindico() {
        return sindico;
    }

    public void setSindico(String sindico) {
        this.sindico = sindico;
    }

    public String getDireccionSindico() {
        return direccionSindico;
    }

    public void setDireccionSindico(String direccionSindico) {
        this.direccionSindico = direccionSindico;
    }

    public List<DetallesQuiebraMediacion> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallesQuiebraMediacion> detalles) {
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
        return "DataQuiebraMediacion [inicioFh=" + inicioFh + ", altaFh="
                + altaFh + ", tipo=" + tipo + ", provincia=" + provincia
                + ", localidad=" + localidad + ", juzgadoNro=" + juzgadoNro
                + ", juzgadoTipo=" + juzgadoTipo + ", secretaria=" + secretaria
                + ", expedienteNro=" + expedienteNro + ", verifHastaFh="
                + verifHastaFh + ", sindico=" + sindico + ", direccionSindico="
                + direccionSindico + ", detalles=" + detalles + ", operaciones="
                + operaciones + "]";
    }



}
