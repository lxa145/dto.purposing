package ar.com.equifax.dto.purposing.v1.data.innermodel.identities;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.AportesDireccion;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;


/**
 * @author lxa145
 *
 */
public class Direccion {

    @JsonProperty("dir_id")
    private Long dirId;
    @JsonProperty("provincia")
    private Provincia provincia;
    @JsonProperty("localidad")
    private String localidad;
    @JsonProperty("calle")
    private String calle;
    @JsonProperty("altura")
    private String altura;
    @JsonProperty("piso_dpto")
    private String pisoDpto;
    @JsonProperty("cp")
    private Integer cp;
    @JsonProperty("cpa")
    private DireccionCpa cpa;
    @JsonProperty("validado")
    private Boolean validado;
    @JsonProperty("validado_fh")
    private Integer validadoFh;
    @JsonProperty("aportes")
    private List<AportesDireccion> aportes;
    @JsonProperty("operaciones")
    private Operaciones operaciones;


    public Long getDirId() {
        return dirId;
    }

    public void setDirId(Long dirId) {
        this.dirId = dirId;
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

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPisoDpto() {
        return pisoDpto;
    }

    public void setPisoDpto(String pisoDpto) {
        this.pisoDpto = pisoDpto;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public Boolean getValidado() {
        return validado;
    }

    public void setValidado(Boolean validado) {
        this.validado = validado;
    }

    public Integer getValidadoFh() {
        return validadoFh;
    }

    public void setValidadoFh(Integer validadoFh) {
        this.validadoFh = validadoFh;
    }

    public List<AportesDireccion> getAportes() {
        return aportes;
    }

    public void setAportes(List<AportesDireccion> aportes) {
        this.aportes = aportes;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }

    public DireccionCpa getCpa() {
        return cpa;
    }

    public void setCpa(DireccionCpa cpa) {
        this.cpa = cpa;
    }

    @Override
    public String toString() {
        return "Direccion [dirId=" + dirId + ", provincia=" + provincia
                + ", localidad=" + localidad + ", calle=" + calle + ", altura="
                + altura + ", pisoDpto=" + pisoDpto + ", cp=" + cp + ", cpa="
                + cpa + ", validado=" + validado + ", validadoFh=" + validadoFh
                + ", aportes=" + aportes + ", operaciones=" + operaciones + "]";
    }


}
