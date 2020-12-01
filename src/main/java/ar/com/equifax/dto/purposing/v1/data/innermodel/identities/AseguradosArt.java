package ar.com.equifax.dto.purposing.v1.data.innermodel.identities;

import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;



/**
 * @author lxa145
 *
 */
public class AseguradosArt {


    @JsonProperty("codigo")
    private Integer codigo;
    @JsonProperty("art_nombre")
    private String artNombre;
    @JsonProperty("telefono_reclamos")
    private String telefonoReclamos;
    @JsonProperty("telefono_siniestros")
    private String telefonoSiniestros;
    @JsonProperty("web")
    private String web;
    @JsonProperty("operaciones")
    private Operaciones operaciones;


    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getArtNombre() {
        return artNombre;
    }

    public void setArtNombre(String artNombre) {
        this.artNombre = artNombre;
    }

    public String getTelefonoReclamos() {
        return telefonoReclamos;
    }

    public void setTelefonoReclamos(String telefonoReclamos) {
        this.telefonoReclamos = telefonoReclamos;
    }

    public String getTelefonoSiniestros() {
        return telefonoSiniestros;
    }

    public void setTelefonoSiniestros(String telefonoSiniestros) {
        this.telefonoSiniestros = telefonoSiniestros;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }


    @Override
    public String toString() {
        return "AseguradosArt [codigo=" + codigo + ", artNombre=" + artNombre
                + ", telefonoReclamos=" + telefonoReclamos
                + ", telefonoSiniestros=" + telefonoSiniestros + ", web=" + web
                + ", operaciones=" + operaciones + "]";
    }



}
