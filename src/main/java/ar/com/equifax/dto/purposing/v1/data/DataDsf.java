package ar.com.equifax.dto.purposing.v1.data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.DetallesDsf;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.AdhSector;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.AdhSucursal;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Adhmatriz;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.CliCategoria;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.CliGobierno;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.CliSector;



/**
 * @author lxa145
 *
 */
public class DataDsf {

    @JsonProperty("adh_matriz")
    private Adhmatriz adhMatriz;
    @JsonProperty("adh_sucursal")
    private AdhSucursal adhSucursal;
    @JsonProperty("adh_sector")
    private AdhSector adhSector;
    @JsonProperty("cli_categoria")
    private CliCategoria cliCategoria;
    @JsonProperty("cli_sector")
    private CliSector cliSector;
    @JsonProperty("cli_gobierno")
    private CliGobierno cliGobierno;
    @JsonProperty("en_sit_1_desde")
    private Integer enSitDesde;
    @JsonProperty("detalles")
    private List<DetallesDsf> detalles;
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

    public AdhSector getAdhSector() {
        return adhSector;
    }

    public void setAdhSector(AdhSector adhSector) {
        this.adhSector = adhSector;
    }

    public CliCategoria getCliCategoria() {
        return cliCategoria;
    }

    public void setCliCategoria(CliCategoria cliCategoria) {
        this.cliCategoria = cliCategoria;
    }

    public CliSector getCliSector() {
        return cliSector;
    }

    public void setCliSector(CliSector cliSector) {
        this.cliSector = cliSector;
    }

    public CliGobierno getCliGobierno() {
        return cliGobierno;
    }

    public void setCliGobierno(CliGobierno cliGobierno) {
        this.cliGobierno = cliGobierno;
    }

    public Integer getEnSitDesde() {
        return enSitDesde;
    }

    public void setEnSitDesde(Integer enSitDesde) {
        this.enSitDesde = enSitDesde;
    }

    public List<DetallesDsf> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallesDsf> detalles) {
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
        return "DataDsf [adhMatriz=" + adhMatriz + ", adhSucursal="
                + adhSucursal + ", adhSector=" + adhSector + ", cliCategoria="
                + cliCategoria + ", cliSector=" + cliSector + ", cliGobierno="
                + cliGobierno + ", enSitDesde=" + enSitDesde + ", detalles="
                + detalles + ", operaciones=" + operaciones + "]";
    }



}
