package ar.com.equifax.dto.purposing.v1.data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Causal;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Firmantes;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.PagoMulta;



/**
 * @author lxa145
 *
 */
public class DataChequesRech {


    @JsonProperty("nro_cheque")
    private Long nroCheque;
    @JsonProperty("monto")
    private Double monto;
    @JsonProperty("rechazo_fh")
    private Integer rechazoFh;
    @JsonProperty("pago")
    private Boolean pago;
    @JsonProperty("pago_fh")
    private Integer pagoFh;
    @JsonProperty("pago_multa")
    private PagoMulta pagoMulta;
    @JsonProperty("pago_multa_fh")
    private Integer pagoMultaFh;
    @JsonProperty("moneda")
    private String moneda;
    @JsonProperty("causal")
    private Causal causal;
    @JsonProperty("estado")
    private String estado;
    @JsonProperty("en_revision")
    private Boolean enRevision;
    @JsonProperty("en_legales")
    private Boolean enLegales;
    @JsonProperty("firmantes")
    private List<Firmantes> firmantes;
    @JsonProperty("operaciones")
    private Operaciones operaciones;


    public Long getNroCheque() {
        return nroCheque;
    }

    public void setNroCheque(Long nroCheque) {
        this.nroCheque = nroCheque;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Integer getRechazoFh() {
        return rechazoFh;
    }

    public void setRechazoFh(Integer rechazoFh) {
        this.rechazoFh = rechazoFh;
    }

    public Boolean getPago() {
        return pago;
    }

    public void setPago(Boolean pago) {
        this.pago = pago;
    }

    public Integer getPagoFh() {
        return pagoFh;
    }

    public void setPagoFh(Integer pagoFh) {
        this.pagoFh = pagoFh;
    }

    public PagoMulta getPagoMulta() {
        return pagoMulta;
    }

    public void setPagoMulta(PagoMulta pagoMulta) {
        this.pagoMulta = pagoMulta;
    }

    public Integer getPagoMultaFh() {
        return pagoMultaFh;
    }

    public void setPagoMultaFh(Integer pagoMultaFh) {
        this.pagoMultaFh = pagoMultaFh;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public Causal getCausal() {
        return causal;
    }

    public void setCausal(Causal causal) {
        this.causal = causal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Boolean getEnRevision() {
        return enRevision;
    }

    public void setEnRevision(Boolean enRevision) {
        this.enRevision = enRevision;
    }

    public Boolean getEnLegales() {
        return enLegales;
    }

    public void setEnLegales(Boolean enLegales) {
        this.enLegales = enLegales;
    }

    public List<Firmantes> getFirmantes() {
        return firmantes;
    }

    public void setFirmantes(List<Firmantes> firmantes) {
        this.firmantes = firmantes;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }


    @Override
    public String toString() {
        return "DataChequesRech [nroCheque=" + nroCheque + ", monto=" + monto
                + ", rechazoFh=" + rechazoFh + ", pago=" + pago + ", pagoFh="
                + pagoFh + ", pagoMulta=" + pagoMulta + ", pagoMultaFh="
                + pagoMultaFh + ", moneda=" + moneda + ", causal=" + causal
                + ", estado=" + estado + ", enRevision=" + enRevision
                + ", enLegales=" + enLegales + ", firmantes=" + firmantes
                + ", operaciones=" + operaciones + "]";
    }



}
