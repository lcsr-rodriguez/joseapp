package com.josemiguel.prosthesisapp.Modelo;

/**
 * Created by Usuario PC on 30/12/2016.
 */

public class ActualizarSuceso {
    public String ID_ORDEN_SERVICIOS="";
    public String ESTADO="";
    public String ENTREGADA="";
    public String OBSERVACION="";

    public ActualizarSuceso(String ID_ORDEN_SERVICIOS, String ESTADO, String ENTREGADA, String OBSERVACION) {
        this.ID_ORDEN_SERVICIOS = ID_ORDEN_SERVICIOS;
        this.ESTADO = ESTADO;
        this.ENTREGADA = ENTREGADA;
        this.OBSERVACION = OBSERVACION;
    }
}
