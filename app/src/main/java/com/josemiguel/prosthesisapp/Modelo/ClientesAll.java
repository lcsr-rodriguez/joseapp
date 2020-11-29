package com.josemiguel.prosthesisapp.Modelo;

import java.util.List;

/**
 * Modelo ClientesAll.
 */
public class ClientesAll {

    public String estado;
    public List<Cliente> clientes;
    public String mensaje;

    public String getEstado() {
        return estado;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public String getMensaje() {
        return mensaje;
    }
}
