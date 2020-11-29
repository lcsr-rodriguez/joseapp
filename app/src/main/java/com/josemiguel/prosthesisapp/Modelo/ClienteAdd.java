package com.josemiguel.prosthesisapp.Modelo;

/**
 * Created by Usuario PC on 26/10/2016.
 */
public class ClienteAdd {

    public String dni;
    public String nombre;
    public String direccion;
    public String telefono;
    public String ciudad;
    public String modo_pago;
    public String email;
    public String observaciones;
    public String sucursal;
    public String usuario;
    public String asesor;

    public ClienteAdd(String dni, String nombre, String direccion, String telefono, String ciudad, String modo_pago, String email, String observaciones, String sucursal, String usuario,String asesor) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.modo_pago = modo_pago;
        this.email = email;
        this.observaciones = observaciones;
        this.sucursal = sucursal;
        this.usuario = usuario;
        this.asesor = asesor;
    }
}
