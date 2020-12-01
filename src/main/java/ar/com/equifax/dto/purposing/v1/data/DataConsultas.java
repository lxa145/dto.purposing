package ar.com.equifax.dto.purposing.v1.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.ConsultaAdhSector;
import ar.com.equifax.dto.purposing.v1.data.innermodel.ConsultaAdhSucursal;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Adhmatriz;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.BloqueInfo;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Estado;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Prodcod;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Tipo;


/**
 * @author lxa145
 *
 */
public class DataConsultas {

    @JsonProperty("adh_matriz")
    private Adhmatriz adhMatriz;
    @JsonProperty("adh_sucursal")
    private ConsultaAdhSucursal adhSucursal;
    @JsonProperty("adh_sector")
    private ConsultaAdhSector adhSector;
    @JsonProperty("ingreso_fh")
    private Integer ingresoFh;
    @JsonProperty("ejecucion_fh")
    private Integer ejecucionFh;
    @JsonProperty("cliente")
    private String cliente;
    @JsonProperty("cliente_fh")
    private Integer clienteFh;
    @JsonProperty("prod_cod")
    private Prodcod prodcod;
    @JsonProperty("tipo")
    private Tipo tipo;
    @JsonProperty("bloque_info")
    private BloqueInfo BloqueInfo;
    @JsonProperty("estado")
    private Estado estado;
    @JsonProperty("estado_fh")
    private Integer estadoFh;
    @JsonProperty("operaciones")
    private Operaciones operaciones;


    public Adhmatriz getAdhMatriz() {
        return adhMatriz;
    }

    public void setAdhMatriz(Adhmatriz adhMatriz) {
        this.adhMatriz = adhMatriz;
    }

    public ConsultaAdhSucursal getAdhSucursal() {
        return adhSucursal;
    }

    public void setAdhSucursal(ConsultaAdhSucursal adhSucursal) {
        this.adhSucursal = adhSucursal;
    }

    public ConsultaAdhSector getAdhSector() {
        return adhSector;
    }

    public void setAdhSector(ConsultaAdhSector adhSector) {
        this.adhSector = adhSector;
    }

    public Integer getIngresoFh() {
        return ingresoFh;
    }

    public void setIngresoFh(Integer ingresoFh) {
        this.ingresoFh = ingresoFh;
    }

    public Integer getEjecucionFh() {
        return ejecucionFh;
    }

    public void setEjecucionFh(Integer ejecucionFh) {
        this.ejecucionFh = ejecucionFh;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Integer getClienteFh() {
        return clienteFh;
    }

    public void setClienteFh(Integer clienteFh) {
        this.clienteFh = clienteFh;
    }

    public Prodcod getProdcod() {
        return prodcod;
    }

    public void setProdcod(Prodcod prodcod) {
        this.prodcod = prodcod;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public BloqueInfo getBloqueInfo() {
        return BloqueInfo;
    }

    public void setBloqueInfo(BloqueInfo bloqueInfo) {
        BloqueInfo = bloqueInfo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Integer getEstadoFh() {
        return estadoFh;
    }

    public void setEstadoFh(Integer estadoFh) {
        this.estadoFh = estadoFh;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }

    @Override
    public String toString() {
        return "DataConsultas [adhMatriz=" + adhMatriz + ", adhSucursal="
                + adhSucursal + ", adhSector=" + adhSector + ", ingresoFh="
                + ingresoFh + ", ejecucionFh=" + ejecucionFh + ", cliente="
                + cliente + ", clienteFh=" + clienteFh + ", prodcod=" + prodcod
                + ", tipo=" + tipo + ", BloqueInfo=" + BloqueInfo + ", estado="
                + estado + ", estadoFh=" + estadoFh + ", operaciones="
                + operaciones + "]";
    }



}
