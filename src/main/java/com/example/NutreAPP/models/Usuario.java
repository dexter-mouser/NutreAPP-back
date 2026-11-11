package com.example.NutreAPP.models;

import com.example.NutreAPP.models.helpers.Departamentos;
import com.example.NutreAPP.models.helpers.Rol;

public class Usuario {

    private UUID id;
    private String nombre;
    private String correo;
    private Departamentos departamentos;
    private Rol rol;
    private String contrasena_hash;
    //
    public Usuario() {
    }
    //
    public Usuario(UUID id, String nombre, String correo, Departamentos departamentos, Rol rol,
            String contrasena_hash) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.departamentos = departamentos;
        this.rol = rol;
        this.contrasena_hash = contrasena_hash;
    }
    //
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Departamentos getDepartamentos() {
        return departamentos;
    }
    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }
    public Rol getRol() {
        return rol;
    }
    public void setRol(Rol rol) {
        this.rol = rol;
    }
    public String getContrasena_hash() {
        return contrasena_hash;
    }
    public void setContrasena_hash(String contrasena_hash) {
        this.contrasena_hash = contrasena_hash;
    }
    
    
}
