package ar.com.equifax.dto.purposing.v1.data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.DetallesExchSegcau;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Adhmatriz;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Condicion;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.OperacionTipo;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.ProductoTipo;



/**
 * @author lxa145
 *
 */
public class DataExchSegcau {


    @JsonProperty("adh_matriz")
    private Adhmatriz adhMatriz;
    @JsonProperty("operacion_id")
    private String operacionId;
    @JsonProperty("producto_tipo")
    private ProductoTipo productoTipo;
    @JsonProperty("operacion_tipo")
    private OperacionTipo operacionTipo;
    @JsonProperty("condicion")
    private Condicion condicion;
    @JsonProperty("inicio_mora_fh")
    private Integer inicioMoraFh;
    @JsonProperty("detalles")
    private List<DetallesExchSegcau> detalles;
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

    public ProductoTipo getProductoTipo() {
        return productoTipo;
    }

    public void setProductoTipo(ProductoTipo productoTipo) {
        this.productoTipo = productoTipo;
    }

    public OperacionTipo getOperacionTipo() {
        return operacionTipo;
    }

    public void setOperacionTipo(OperacionTipo operacionTipo) {
        this.operacionTipo = operacionTipo;
    }

    public Condicion getCondicion() {
        return condicion;
    }

    public void setCondicion(Condicion condicion) {
        this.condicion = condicion;
    }

    public Integer getInicioMoraFh() {
        return inicioMoraFh;
    }

    public void setInicioMoraFh(Integer inicioMoraFh) {
        this.inicioMoraFh = inicioMoraFh;
    }

    public List<DetallesExchSegcau> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallesExchSegcau> detalles) {
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
        return "DataExchSegcau [adhMatriz=" + adhMatriz + ", operacionId="
                + operacionId + ", productoTipo=" + productoTipo
                + ", operacionTipo=" + operacionTipo + ", condicion="
                + condicion + ", inicioMoraFh=" + inicioMoraFh + ", detalles="
                + detalles + ", operaciones=" + operaciones + "]";
    }



}
