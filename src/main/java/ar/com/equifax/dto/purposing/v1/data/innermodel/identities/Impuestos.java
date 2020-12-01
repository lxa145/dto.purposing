package ar.com.equifax.dto.purposing.v1.data.innermodel.identities;

import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.Operaciones;


/**
 * @author lxa145
 *
 */
public class Impuestos {
    @JsonProperty("tipo")
    private String tipo;
    @JsonProperty("condicion")
    private String condicion;
    @JsonProperty("descripcion")
    private String descripcion;
    @JsonProperty("fecha")
    private long fecha;
    @JsonProperty("operaciones")
    private Operaciones operaciones;


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getFecha() {
        return fecha;
    }

    public void setFecha(long fecha) {
        this.fecha = fecha;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }


    @Override
    public String toString() {
        return "Impuestos [tipo=" + tipo + ", condicion=" + condicion
                + ", descripcion=" + descripcion + ", fecha=" + fecha
                + ", operaciones=" + operaciones + "]";
    }



}
