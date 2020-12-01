package ar.com.equifax.dto.purposing.v1.data.innermodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.IntegranteCondicionTipo;

/**
 * @author lxa145
 *
 */
public class Integrante {

    @JsonProperty("iup_integrante")
    private Long iupIntegrante;
    @JsonProperty("referencia_integrante")
    private Long referenciaIntegrante;
    @JsonProperty("integrante_tipo")
    private IntegranteCondicionTipo integranteTipo;


    public Long getIupIntegrante() {
        return iupIntegrante;
    }

    public void setIupIntegrante(Long iupIntegrante) {
        this.iupIntegrante = iupIntegrante;
    }

    public Long getReferenciaIntegrante() {
        return referenciaIntegrante;
    }

    public void setReferenciaIntegrante(Long referenciaIntegrante) {
        this.referenciaIntegrante = referenciaIntegrante;
    }

    public IntegranteCondicionTipo getIntegranteTipo() {
        return integranteTipo;
    }

    public void setIntegranteTipo(IntegranteCondicionTipo integranteTipo) {
        this.integranteTipo = integranteTipo;
    }

    @Override
    public String toString() {
        return "Integrante [iupIntegrante=" + iupIntegrante
                + ", referenciaIntegrante=" + referenciaIntegrante
                + ", integranteTipo=" + integranteTipo + "]";
    }



}
