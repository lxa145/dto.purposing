package ar.com.equifax.dto.purposing.v1.data.innermodel.identities;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author lxa145
 *
 */
public class Actividad {

    @JsonProperty("formulario")
    private String formulario;
    @JsonProperty("codigo")
    private String codigo;
    @JsonProperty("descripcion")
    private String descripcion;
    @JsonProperty("inicio_fh")
    private Long inicioFh;
    @JsonProperty("principal")
    private Boolean principal;


    public String getFormulario() {
        return formulario;
    }

    public void setFormulario(String formulario) {
        this.formulario = formulario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getInicioFh() {
        return inicioFh;
    }

    public void setInicioFh(Long inicioFh) {
        this.inicioFh = inicioFh;
    }

    public Boolean getPrincipal() {
        return principal;
    }

    public void setPrincipal(Boolean principal) {
        this.principal = principal;
    }


    @Override
    public String toString() {
        return "Actividad [formulario=" + formulario + ", codigo=" + codigo
                + ", descripcion=" + descripcion + ", inicioFh=" + inicioFh
                + ", principal=" + principal + "]";
    }



}
