package ar.com.equifax.dto.purposing.v1.data.innermodel.identities;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * @author lxa145
 *
 */
public class Contratos {

    @JsonProperty("contrato_nro")
    private Long contratoNro;
    @JsonProperty("estado")
    private EstadoContratosSrt estado;
    @JsonProperty("alta_fh")
    private Integer altaFh;
    @JsonProperty("motivo_alta")
    private String motivoAlta;
    @JsonProperty("baja_fh")
    private Integer bajaFh;
    @JsonProperty("motivo_baja")
    private String motivoBaja;
    @JsonProperty("extincion")
    private Boolean extincion;
    @JsonProperty("extincion_fh")
    private Integer extincionFh;
    @JsonProperty("regulacion_fh")
    private Integer regulacionFh;
    @JsonProperty("regulacion_detalle")
    private List<RegulacionDetalle> regulacionDetalle;
    @JsonProperty("art")
    private List<Art> art;


    public Long getContratoNro() {
        return contratoNro;
    }

    public void setContratoNro(Long contratoNro) {
        this.contratoNro = contratoNro;
    }

    public EstadoContratosSrt getEstado() {
        return estado;
    }

    public void setEstado(EstadoContratosSrt estado) {
        this.estado = estado;
    }

    public Integer getAltaFh() {
        return altaFh;
    }

    public void setAltaFh(Integer altaFh) {
        this.altaFh = altaFh;
    }

    public String getMotivoAlta() {
        return motivoAlta;
    }

    public void setMotivoAlta(String motivoAlta) {
        this.motivoAlta = motivoAlta;
    }

    public Integer getBajaFh() {
        return bajaFh;
    }

    public void setBajaFh(Integer bajaFh) {
        this.bajaFh = bajaFh;
    }

    public String getMotivoBaja() {
        return motivoBaja;
    }

    public void setMotivoBaja(String motivoBaja) {
        this.motivoBaja = motivoBaja;
    }

    public Boolean getExtincion() {
        return extincion;
    }

    public void setExtincion(Boolean extincion) {
        this.extincion = extincion;
    }

    public Integer getExtincionFh() {
        return extincionFh;
    }

    public void setExtincionFh(Integer extincionFh) {
        this.extincionFh = extincionFh;
    }

    public Integer getRegulacionFh() {
        return regulacionFh;
    }

    public void setRegulacionFh(Integer regulacionFh) {
        this.regulacionFh = regulacionFh;
    }

    public List<RegulacionDetalle> getRegulacionDetalle() {
        return regulacionDetalle;
    }

    public void setRegulacionDetalle(
            List<RegulacionDetalle> regulacionDetalle) {
        this.regulacionDetalle = regulacionDetalle;
    }

    public List<Art> getArt() {
        return art;
    }

    public void setArt(List<Art> art) {
        this.art = art;
    }

    @Override
    public String toString() {
        return "Contratos [contratoNro=" + contratoNro + ", estado=" + estado
                + ", altaFh=" + altaFh + ", motivoAlta=" + motivoAlta
                + ", bajaFh=" + bajaFh + ", motivoBaja=" + motivoBaja
                + ", extincion=" + extincion + ", extincionFh=" + extincionFh
                + ", regulacionFh=" + regulacionFh + ", regulacionDetalle="
                + regulacionDetalle + ", art=" + art + "]";
    }



}
