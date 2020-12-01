package ar.com.equifax.dto.purposing.v1.data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.AportesEmails;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;



/**
 * @author lxa145
 *
 */
public class DataEmails {

    @JsonProperty("direccion")
    private String direccion;
    @JsonProperty("tiene_optin")
    private Boolean tieneOptin;
    @JsonProperty("tiene_optin_desde_fh")
    private Integer tieneOptinDesdeFh;
    @JsonProperty("validado")
    private Boolean validado;
    @JsonProperty("validado_fh")
    private Integer validadoFh;
    @JsonProperty("aportes")
    private List<AportesEmails> aportes;
    @JsonProperty("operaciones")
    private Operaciones operaciones;


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getTieneOptin() {
        return tieneOptin;
    }

    public void setTieneOptin(Boolean tieneOptin) {
        this.tieneOptin = tieneOptin;
    }

    public Integer getTieneOptinDesdeFh() {
        return tieneOptinDesdeFh;
    }

    public void setTieneOptinDesdeFh(Integer tieneOptinDesdeFh) {
        this.tieneOptinDesdeFh = tieneOptinDesdeFh;
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

    public List<AportesEmails> getAportes() {
        return aportes;
    }

    public void setAportes(List<AportesEmails> aportes) {
        this.aportes = aportes;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }

    @Override
    public String toString() {
        return "DataEmails [direccion=" + direccion + ", tieneOptin="
                + tieneOptin + ", tieneOptinDesdeFh=" + tieneOptinDesdeFh
                + ", validado=" + validado + ", validadoFh=" + validadoFh
                + ", aportes=" + aportes + ", operaciones=" + operaciones + "]";
    }



}
