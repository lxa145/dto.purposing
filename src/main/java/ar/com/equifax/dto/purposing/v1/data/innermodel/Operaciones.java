package ar.com.equifax.dto.purposing.v1.data.innermodel;

import com.fasterxml.jackson.annotation.JsonProperty;



/**
 * @author lxa145
 *
 */
public class Operaciones {

    @JsonProperty("tipo")
    private String tipo;
    @JsonProperty("fuente_tipo")
    private String fuenteTipo;
    @JsonProperty("fuente")
    private String fuente;
    @JsonProperty("fuente_fh")
    private Integer fuenteFh;
    @JsonProperty("operacion_fh")
    private Long operacionFh;


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFuenteTipo() {
        return fuenteTipo;
    }

    public void setFuenteTipo(String fuenteTipo) {
        this.fuenteTipo = fuenteTipo;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public Integer getFuenteFh() {
        return fuenteFh;
    }

    public void setFuenteFh(Integer fuenteFh) {
        this.fuenteFh = fuenteFh;
    }

    public Long getOperacionFh() {
        return operacionFh;
    }

    public void setOperacionFh(Long operacionFh) {
        this.operacionFh = operacionFh;
    }

    @Override
    public String toString() {
        return "Operaciones [tipo=" + tipo + ", fuenteTipo=" + fuenteTipo
                + ", fuente=" + fuente + ", fuenteFh=" + fuenteFh
                + ", operacionFh=" + operacionFh + "]";
    }



}
