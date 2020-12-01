package ar.com.equifax.dto.purposing.v1.data.innermodel.identities;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * @author lxa145
 *
 */
public class Establecimientos {

    @JsonProperty("establecimiento_id")
    private Integer establecimientoId;
    @JsonProperty("planta_id")
    private Integer plantaId;
    @JsonProperty("detalle")
    private String detalle;
    @JsonProperty("estado")
    private String estado;
    @JsonProperty("capacidad_almacenaje")
    private String capacidadAlmacenaje;
    @JsonProperty("capacidad_produccion")
    private String capacidadProduccion;
    @JsonProperty("alta_fh")
    private Integer altaFh;
    @JsonProperty("baja_fh")
    private Integer bajaFh;
    @JsonProperty("ganado_tipo")
    private List<GanadoTipo> ganadoTipo;


    public Integer getEstablecimientoId() {
        return establecimientoId;
    }

    public void setEstablecimientoId(Integer establecimientoId) {
        this.establecimientoId = establecimientoId;
    }

    public Integer getPlantaId() {
        return plantaId;
    }

    public void setPlantaId(Integer plantaId) {
        this.plantaId = plantaId;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCapacidadAlmacenaje() {
        return capacidadAlmacenaje;
    }

    public void setCapacidadAlmacenaje(String capacidadAlmacenaje) {
        this.capacidadAlmacenaje = capacidadAlmacenaje;
    }

    public String getCapacidadProduccion() {
        return capacidadProduccion;
    }

    public void setCapacidadProduccion(String capacidadProduccion) {
        this.capacidadProduccion = capacidadProduccion;
    }

    public Integer getAltaFh() {
        return altaFh;
    }

    public void setAltaFh(Integer altaFh) {
        this.altaFh = altaFh;
    }

    public Integer getBajaFh() {
        return bajaFh;
    }

    public void setBajaFh(Integer bajaFh) {
        this.bajaFh = bajaFh;
    }

    public List<GanadoTipo> getGanadoTipo() {
        return ganadoTipo;
    }

    public void setGanadoTipo(List<GanadoTipo> ganadoTipo) {
        this.ganadoTipo = ganadoTipo;
    }


    @Override
    public String toString() {
        return "Establecimientos [establecimientoId=" + establecimientoId
                + ", plantaId=" + plantaId + ", detalle=" + detalle
                + ", estado=" + estado + ", capacidadAlmacenaje="
                + capacidadAlmacenaje + ", capacidadProduccion="
                + capacidadProduccion + ", altaFh=" + altaFh + ", bajaFh="
                + bajaFh + ", ganadoTipo=" + ganadoTipo + "]";
    }



}
