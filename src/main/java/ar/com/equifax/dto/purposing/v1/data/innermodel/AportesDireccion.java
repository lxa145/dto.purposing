package ar.com.equifax.dto.purposing.v1.data.innermodel;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * @author lxa145
 *
 */
public class AportesDireccion {
    @JsonProperty("origen")
    private String origen;
    @JsonProperty("primera_vez_aportado_fh")
    private Long primeraVezAportadoFh;
    @JsonProperty("ultima_vez_aportado_fh")
    private Long ultimaVezAportadoFh;
    @JsonProperty("cant_aportes")
    private Integer cantAportes;
    @JsonProperty("operaciones")
    private Operaciones operaciones;


    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public Long getPrimeraVezAportadoFh() {
        return primeraVezAportadoFh;
    }

    public void setPrimeraVezAportadoFh(Long primeraVezAportadoFh) {
        this.primeraVezAportadoFh = primeraVezAportadoFh;
    }

    public Long getUltimaVezAportadoFh() {
        return ultimaVezAportadoFh;
    }

    public void setUltimaVezAportadoFh(Long ultimaVezAportadoFh) {
        this.ultimaVezAportadoFh = ultimaVezAportadoFh;
    }

    public Integer getCantAportes() {
        return cantAportes;
    }

    public void setCantAportes(Integer cantAportes) {
        this.cantAportes = cantAportes;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }


    @Override
    public String toString() {
        return "AportesDireccion [origen=" + origen + ", primeraVezAportadoFh="
                + primeraVezAportadoFh + ", ultimaVezAportadoFh="
                + ultimaVezAportadoFh + ", cantAportes=" + cantAportes
                + ", operaciones=" + operaciones + "]";
    }



}
