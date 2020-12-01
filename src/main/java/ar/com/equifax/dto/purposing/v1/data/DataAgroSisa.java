package ar.com.equifax.dto.purposing.v1.data;



import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.CategoriaAgroSisa;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Cbu;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.EstadoAgroSisa;


/**
 * @author lxa145
 *
 */
public class DataAgroSisa {

    @JsonProperty("estado")
    private EstadoAgroSisa estado;
    @JsonProperty("estado_vigencia_fh")
    private Integer estadoVigenciaFh;
    @JsonProperty("estado_notificacion_fh")
    private Integer estadoNotificacionFh;
    @JsonProperty("cbu")
    private List<Cbu> cbu;
    @JsonProperty("categorias")
    private List<CategoriaAgroSisa> categorias;
    @JsonProperty("generacion_fh")
    private Integer generacionFh;
    @JsonProperty("observaciones")
    private String observaciones;
    @JsonProperty("operaciones")
    private Operaciones operaciones;


    public EstadoAgroSisa getEstado() {
        return estado;
    }

    public void setEstado(EstadoAgroSisa estado) {
        this.estado = estado;
    }

    public Integer getEstadoVigenciaFh() {
        return estadoVigenciaFh;
    }

    public void setEstadoVigenciaFh(Integer estadoVigenciaFh) {
        this.estadoVigenciaFh = estadoVigenciaFh;
    }

    public Integer getEstadoNotificacionFh() {
        return estadoNotificacionFh;
    }

    public void setEstadoNotificacionFh(Integer estadoNotificacionFh) {
        this.estadoNotificacionFh = estadoNotificacionFh;
    }

    public List<Cbu> getCbu() {
        return cbu;
    }

    public void setCbu(List<Cbu> cbu) {
        this.cbu = cbu;
    }

    public List<CategoriaAgroSisa> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<CategoriaAgroSisa> categorias) {
        this.categorias = categorias;
    }

    public Integer getGeneracionFh() {
        return generacionFh;
    }

    public void setGeneracionFh(Integer generacionFh) {
        this.generacionFh = generacionFh;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }


    @Override
    public String toString() {
        return "DataAgroSisa [estado=" + estado + ", estadoVigenciaFh="
                + estadoVigenciaFh + ", estadoNotificacionFh="
                + estadoNotificacionFh + ", cbu=" + cbu + ", categorias="
                + categorias + ", generacionFh=" + generacionFh
                + ", observaciones=" + observaciones + ", operaciones="
                + operaciones + "]";
    }



}
