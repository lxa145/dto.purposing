package ar.com.equifax.dto.purposing.v1.data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.AutonomoTipo;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Impuestos;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.MonotributoTipo;


/**
 * @author lxa145
 *
 */
public class DataPosicionImpositiva {

    @JsonProperty("periodo")
    private Long periodo;
    @JsonProperty("monotributo")
    private Boolean monotributo;
    @JsonProperty("monotributo_tipo")
    private MonotributoTipo monotributoTipo;

    @JsonProperty("monotributo_tipo_fh")
    private Long monotributoTipoFh;
    @JsonProperty("autonomo")
    private Boolean autonomo;
    @JsonProperty("autonomo_tipo")
    private AutonomoTipo autonomoTipo;

    @JsonProperty("autonomo_alta_fh")
    private long autonomoAltaFh;
    @JsonProperty("es_integrante_soc")
    private Boolean esIntegranteSoc;
    @JsonProperty("es_empleador")
    private Boolean esEmpleador;
    @JsonProperty("impuestos")
    private List<Impuestos> impuestos;

    @JsonProperty("agencia_nombre")
    private String agenciaNombre;
    @JsonProperty("agencia_cp_ciudad")
    private String agenciaCpCiudad;
    @JsonProperty("agencia_direccion")
    private String agenciaDireccion;
    @JsonProperty("cierre_ejercicio")
    private Long cierreEjercicio;

    @JsonProperty("operaciones")
    private Operaciones operaciones;

    public Long getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Long periodo) {
        this.periodo = periodo;
    }

    public Boolean getMonotributo() {
        return monotributo;
    }

    public void setMonotributo(Boolean monotributo) {
        this.monotributo = monotributo;
    }

    public MonotributoTipo getMonotributoTipo() {
        return monotributoTipo;
    }

    public void setMonotributoTipo(MonotributoTipo monotributoTipo) {
        this.monotributoTipo = monotributoTipo;
    }

    public Long getMonotributoTipoFh() {
        return monotributoTipoFh;
    }

    public void setMonotributoTipoFh(Long monotributoTipoFh) {
        this.monotributoTipoFh = monotributoTipoFh;
    }

    public Boolean getAutonomo() {
        return autonomo;
    }

    public void setAutonomo(Boolean autonomo) {
        this.autonomo = autonomo;
    }

    public AutonomoTipo getAutonomoTipo() {
        return autonomoTipo;
    }

    public void setAutonomoTipo(AutonomoTipo autonomoTipo) {
        this.autonomoTipo = autonomoTipo;
    }

    public long getAutonomoAltaFh() {
        return autonomoAltaFh;
    }

    public void setAutonomoAltaFh(long autonomoAltaFh) {
        this.autonomoAltaFh = autonomoAltaFh;
    }

    public Boolean getEsIntegranteSoc() {
        return esIntegranteSoc;
    }

    public void setEsIntegranteSoc(Boolean esIntegranteSoc) {
        this.esIntegranteSoc = esIntegranteSoc;
    }

    public Boolean getEsEmpleador() {
        return esEmpleador;
    }

    public void setEsEmpleador(Boolean esEmpleador) {
        this.esEmpleador = esEmpleador;
    }

    public List<Impuestos> getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(List<Impuestos> impuestos) {
        this.impuestos = impuestos;
    }

    public String getAgenciaNombre() {
        return agenciaNombre;
    }

    public void setAgenciaNombre(String agenciaNombre) {
        this.agenciaNombre = agenciaNombre;
    }

    public String getAgenciaCpCiudad() {
        return agenciaCpCiudad;
    }

    public void setAgenciaCpCiudad(String agenciaCpCiudad) {
        this.agenciaCpCiudad = agenciaCpCiudad;
    }

    public String getAgenciaDireccion() {
        return agenciaDireccion;
    }

    public void setAgenciaDireccion(String agenciaDireccion) {
        this.agenciaDireccion = agenciaDireccion;
    }

    public Long getCierreEjercicio() {
        return cierreEjercicio;
    }

    public void setCierreEjercicio(Long cierreEjercicio) {
        this.cierreEjercicio = cierreEjercicio;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }

    @Override
    public String toString() {
        return "DataPosicionImpositiva [periodo=" + periodo + ", monotributo="
                + monotributo + ", monotributoTipo=" + monotributoTipo
                + ", monotributoTipoFh=" + monotributoTipoFh + ", autonomo="
                + autonomo + ", autonomoTipo=" + autonomoTipo
                + ", autonomoAltaFh=" + autonomoAltaFh + ", esIntegranteSoc="
                + esIntegranteSoc + ", esEmpleador=" + esEmpleador
                + ", impuestos=" + impuestos + ", agenciaNombre="
                + agenciaNombre + ", agenciaCpCiudad=" + agenciaCpCiudad
                + ", agenciaDireccion=" + agenciaDireccion
                + ", cierreEjercicio=" + cierreEjercicio + ", operaciones="
                + operaciones + "]";
    }



}
