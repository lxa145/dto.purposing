package ar.com.equifax.dto.purposing.v1.data.innermodel;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * @author lxa145
 *
 */
public class AportesRelaciones {

    @JsonProperty("origen")
    private String origen;
    @JsonProperty("primera_vez_aportado_fh")
    private Integer primeraVezAportadoFh;
    @JsonProperty("ultima_vez_aportado_fh")
    private Integer ultimaVezAportadoFh;
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

    public Integer getPrimeraVezAportadoFh() {
        return primeraVezAportadoFh;
    }

    public void setPrimeraVezAportadoFh(Integer primeraVezAportadoFh) {
        this.primeraVezAportadoFh = primeraVezAportadoFh;
    }

    public Integer getUltimaVezAportadoFh() {
        return ultimaVezAportadoFh;
    }

    public void setUltimaVezAportadoFh(Integer ultimaVezAportadoFh) {
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
        return "AportesRelaciones [origen=" + origen + ", primeraVezAportadoFh="
                + primeraVezAportadoFh + ", ultimaVezAportadoFh="
                + ultimaVezAportadoFh + ", cantAportes=" + cantAportes
                + ", operaciones=" + operaciones + "]";
    }



}
