package com.practica.web.beans;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class HolaBean {

    private String nombre;
    private String mensaje;

    public void saludar() {
        mensaje = "Hola, " + nombre + "!";
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getMensaje() { return mensaje; }
}