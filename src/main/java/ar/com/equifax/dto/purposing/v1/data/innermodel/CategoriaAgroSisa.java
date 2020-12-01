package ar.com.equifax.dto.purposing.v1.data.innermodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.CategoriaCod;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Situacion;



/**
 * @author lxa145
 *
 */
public class CategoriaAgroSisa {


    @JsonProperty("categoria_cod")
    private CategoriaCod categoriaCod;
    @JsonProperty("situacion")
    private Situacion situacion;
    @JsonProperty("vigencia_fh")
    private Integer vigenciaFh;
    @JsonProperty("notificacion_fh")
    private Integer notificacionFh;


    public CategoriaCod getCategoriaCod() {
        return categoriaCod;
    }

    public void setCategoriaCod(CategoriaCod categoriaCod) {
        this.categoriaCod = categoriaCod;
    }

    public Situacion getSituacion() {
        return situacion;
    }

    public void setSituacion(Situacion situacion) {
        this.situacion = situacion;
    }

    public Integer getVigenciaFh() {
        return vigenciaFh;
    }

    public void setVigenciaFh(Integer vigenciaFh) {
        this.vigenciaFh = vigenciaFh;
    }

    public Integer getNotificacionFh() {
        return notificacionFh;
    }

    public void setNotificacionFh(Integer notificacionFh) {
        this.notificacionFh = notificacionFh;
    }

    @Override
    public String toString() {
        return "CategoriaAgroSisa [categoriaCod=" + categoriaCod
                + ", situacion=" + situacion + ", vigenciaFh=" + vigenciaFh
                + ", notificacionFh=" + notificacionFh + "]";
    }



}
