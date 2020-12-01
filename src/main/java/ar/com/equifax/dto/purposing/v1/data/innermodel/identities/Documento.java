package ar.com.equifax.dto.purposing.v1.data.innermodel.identities;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * @author lxa145
 *
 */
public class Documento {

    @JsonProperty("tipo")
    private String tipo;
    @JsonProperty("version")
    private String version;
    @JsonProperty("numero")
    private Long numero;


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Documento [tipo=" + tipo + ", version=" + version + ", numero="
                + numero + "]";
    }



}
