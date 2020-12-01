package ar.com.equifax.dto.purposing.v1.data.innermodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.Estado;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.EstadoCautelar;
import ar.com.equifax.dto.purposing.v1.data.innermodel.identities.EstadoPlanPagos;



/**
 * @author lxa145
 *
 */
public class DetallesJuiciosEjecu {

    @JsonProperty("info_fh")
    private Integer infoFh;
    @JsonProperty("estado")
    private Estado estado;
    @JsonProperty("estado_fh")
    private Integer estadoFh;
    @JsonProperty("monto_adeudado")
    private Double montoAdeudado;
    @JsonProperty("estado_cautelar")
    private EstadoCautelar estadoCautelar;
    @JsonProperty("estado_plan_pagos")
    private EstadoPlanPagos estadoPlanPagos;
    @JsonProperty("comentarios")
    private String comentarios;
    @JsonProperty("operaciones")
    private Operaciones operaciones;


    public Integer getInfoFh() {
        return infoFh;
    }

    public void setInfoFh(Integer infoFh) {
        this.infoFh = infoFh;
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

    public Double getMontoAdeudado() {
        return montoAdeudado;
    }

    public void setMontoAdeudado(Double montoAdeudado) {
        this.montoAdeudado = montoAdeudado;
    }

    public EstadoCautelar getEstadoCautelar() {
        return estadoCautelar;
    }

    public void setEstadoCautelar(EstadoCautelar estadoCautelar) {
        this.estadoCautelar = estadoCautelar;
    }

    public EstadoPlanPagos getEstadoPlanPagos() {
        return estadoPlanPagos;
    }

    public void setEstadoPlanPagos(EstadoPlanPagos estadoPlanPagos) {
        this.estadoPlanPagos = estadoPlanPagos;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }

    @Override
    public String toString() {
        return "DetallesJuiciosEjecu [infoFh=" + infoFh + ", estado=" + estado
                + ", estadoFh=" + estadoFh + ", montoAdeudado=" + montoAdeudado
                + ", estadoCautelar=" + estadoCautelar + ", estadoPlanPagos="
                + estadoPlanPagos + ", comentarios=" + comentarios
                + ", operaciones=" + operaciones + "]";
    }



}
