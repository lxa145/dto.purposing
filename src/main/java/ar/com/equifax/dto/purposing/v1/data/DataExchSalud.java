package ar.com.equifax.dto.purposing.v1.data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.DetallesExchSalud;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.AdhSsectorExch;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.AdhSucursal;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Adhmatriz;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.TipoAfiliado;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.TipoBaja;



/**
 * @author lxa145
 *
 */
public class DataExchSalud {


    @JsonProperty("adh_matriz")
    private Adhmatriz adhMatriz;
    @JsonProperty("adh_sucursal")
    private AdhSucursal adhSucursal;
    @JsonProperty("adh_sector")
    private AdhSsectorExch adhSector;
    @JsonProperty("tipo_afiliado")
    private TipoAfiliado tipoAfiliado;
    @JsonProperty("nro_afiliado")
    private String nroAfiliado;
    @JsonProperty("ingreso_os_fh")
    private Integer ingresoFh;
    @JsonProperty("inicio_mora_fh")
    private Integer inicioMoraFh;
    @JsonProperty("tipo_baja")
    private TipoBaja tipoBaja;
    @JsonProperty("cant_integrantes")
    private Integer cantIntegrantes;
    @JsonProperty("detalles")
    private List<DetallesExchSalud> detalles;
    @JsonProperty("operaciones")
    private Operaciones operaciones;


    public Adhmatriz getAdhMatriz() {
        return adhMatriz;
    }

    public void setAdhMatriz(Adhmatriz adhMatriz) {
        this.adhMatriz = adhMatriz;
    }

    public AdhSucursal getAdhSucursal() {
        return adhSucursal;
    }

    public void setAdhSucursal(AdhSucursal adhSucursal) {
        this.adhSucursal = adhSucursal;
    }

    public AdhSsectorExch getAdhSector() {
        return adhSector;
    }

    public void setAdhSector(AdhSsectorExch adhSector) {
        this.adhSector = adhSector;
    }

    public TipoAfiliado getTipoAfiliado() {
        return tipoAfiliado;
    }

    public void setTipoAfiliado(TipoAfiliado tipoAfiliado) {
        this.tipoAfiliado = tipoAfiliado;
    }

    public String getNroAfiliado() {
        return nroAfiliado;
    }

    public void setNroAfiliado(String nroAfiliado) {
        this.nroAfiliado = nroAfiliado;
    }

    public Integer getIngresoFh() {
        return ingresoFh;
    }

    public void setIngresoFh(Integer ingresoFh) {
        this.ingresoFh = ingresoFh;
    }

    public Integer getInicioMoraFh() {
        return inicioMoraFh;
    }

    public void setInicioMoraFh(Integer inicioMoraFh) {
        this.inicioMoraFh = inicioMoraFh;
    }

    public TipoBaja getTipoBaja() {
        return tipoBaja;
    }

    public void setTipoBaja(TipoBaja tipoBaja) {
        this.tipoBaja = tipoBaja;
    }

    public Integer getCantIntegrantes() {
        return cantIntegrantes;
    }

    public void setCantIntegrantes(Integer cantIntegrantes) {
        this.cantIntegrantes = cantIntegrantes;
    }

    public List<DetallesExchSalud> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallesExchSalud> detalles) {
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
        return "DataExchSalud [adhMatriz=" + adhMatriz + ", adhSucursal="
                + adhSucursal + ", adhSector=" + adhSector + ", tipoAfiliado="
                + tipoAfiliado + ", nroAfiliado=" + nroAfiliado + ", ingresoFh="
                + ingresoFh + ", inicioMoraFh=" + inicioMoraFh + ", tipoBaja="
                + tipoBaja + ", cantIntegrantes=" + cantIntegrantes
                + ", detalles=" + detalles + ", operaciones=" + operaciones
                + "]";
    }



}
