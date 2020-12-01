package ar.com.equifax.dto.purposing.v1.data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.DetallesExchInmo;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Adhmatriz;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.DeudaTipo;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.IntegranteCondicionTipo;



/**
 * @author lxa145
 *
 */
public class DataExchInmo {

    @JsonProperty("adh_matriz")
    private Adhmatriz adhMatriz;
    @JsonProperty("operacion_id")
    private String operacionId;
    @JsonProperty("deuda_tipo")
    private DeudaTipo deudaTipo;
    @JsonProperty("integrante_condicion_tipo")
    private IntegranteCondicionTipo integranteCondicionTipo;
    @JsonProperty("detalles")
    private List<DetallesExchInmo> detalles;
    @JsonProperty("operaciones")
    private Operaciones operaciones;


    public Adhmatriz getAdhMatriz() {
        return adhMatriz;
    }

    public void setAdhMatriz(Adhmatriz adhMatriz) {
        this.adhMatriz = adhMatriz;
    }

    public String getOperacionId() {
        return operacionId;
    }

    public void setOperacionId(String operacionId) {
        this.operacionId = operacionId;
    }

    public DeudaTipo getDeudaTipo() {
        return deudaTipo;
    }

    public void setDeudaTipo(DeudaTipo deudaTipo) {
        this.deudaTipo = deudaTipo;
    }

    public IntegranteCondicionTipo getIntegranteCondicionTipo() {
        return integranteCondicionTipo;
    }

    public void setIntegranteCondicionTipo(
            IntegranteCondicionTipo integranteCondicionTipo) {
        this.integranteCondicionTipo = integranteCondicionTipo;
    }

    public List<DetallesExchInmo> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallesExchInmo> detalles) {
        this.detalles = detalles;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }


    @Override
    public String toString() {
        return "DataExchInmo [adhMatriz=" + adhMatriz + ", operacionId="
                + operacionId + ", deudaTipo=" + deudaTipo
                + ", integranteCondicionTipo=" + integranteCondicionTipo
                + ", detalles=" + detalles + ", operaciones=" + operaciones
                + "]";
    }



}
