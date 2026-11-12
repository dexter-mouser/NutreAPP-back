package com.example.NutreAPP.models;

import java.util.List;
import java.util.UUID;

import com.example.NutreAPP.models.helpers.Departamentos;
import com.example.NutreAPP.models.helpers.Rol;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "usuarios")
public class Usuario {
    @Id 
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column (name = "nombre", nullable = false , unique = false , length = 100)
    private String nombre;

    @Column (name = "correo", nullable = false , unique = true , length = 80)
    private String correo;

    @Enumerated (EnumType.STRING)
    @Column (name = "departamentos", nullable = false , unique = false , length = 20)
    private Departamentos departamentos;

    @Enumerated (EnumType.STRING)
    @Column (name = "rol", nullable = false , unique = false , length = 20)
    private Rol rol;

    @Column (name = "contrasena_hash", nullable = false , unique = false)
    private String contrasena_hash;
    //Creando Relaciones.
    @OneToMany(mappedBy = "usuario")
    @JsonManagedReference(value = "usuario-visualizacion")
    private List<Visualizacion> Visualizaciones;
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
