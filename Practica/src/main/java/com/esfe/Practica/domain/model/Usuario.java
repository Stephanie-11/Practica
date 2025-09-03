package com.esfe.Practica.domain.model;

public class Usuario {
    private String nombre;
    private String email;
    private String password;
    private String Estado;

    public Usuario() {
    }

    public Usuario(String nombre, String email, String password, String estado) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        Estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }
}
