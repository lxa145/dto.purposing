package ar.com.equifax.dto.purposing.v1.data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.DetallesExchAgro;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Adhmatriz;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.ProductoTipo;



/**
 * @author lxa145
 *
 */
public class DataExchAgro {

    @JsonProperty("adh_matriz")
    private Adhmatriz adhmatriz;
    @JsonProperty("operacion_id")
    private String operacionId;
    @JsonProperty("producto_tipo")
    private ProductoTipo productoTipo;
    @JsonProperty("emision_fh")
    private Integer emisionFh;
    @JsonProperty("detalles")
    private List<DetallesExchAgro> detalles;
    @JsonProperty("operaciones")
    private Operaciones operaciones;


    public Adhmatriz getAdhmatriz() {
        return adhmatriz;
    }

    public void setAdhmatriz(Adhmatriz adhmatriz) {
        this.adhmatriz = adhmatriz;
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

    public Integer getEmisionFh() {
        return emisionFh;
    }

    public void setEmisionFh(Integer emisionFh) {
        this.emisionFh = emisionFh;
    }

    public List<DetallesExchAgro> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallesExchAgro> detalles) {
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
        return "DataExchAgro [adhmatriz=" + adhmatriz + ", operacionId="
                + operacionId + ", productoTipo=" + productoTipo
                + ", emisionFh=" + emisionFh + ", detalles=" + detalles
                + ", operaciones=" + operaciones + "]";
    }



}
