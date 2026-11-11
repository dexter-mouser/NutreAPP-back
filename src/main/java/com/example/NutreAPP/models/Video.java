package com.example.NutreAPP.models;

import java.util.UUID;

import com.example.NutreAPP.models.helpers.Categoria;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "videos")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column (name = "titulo", nullable = false , unique = false , length = 150)
    private String titulo;

    @Column (name = "descripcion", nullable = true , unique = false , length = 500)
    private String descripcion;

    @Column (name = "url", nullable = false , unique = true , length = 255)
    private String url;

    @Enumerated (EnumType.STRING)
    @Column (name = "categoria", nullable = false , unique = false , length = 30)
    private Categoria categoria;
    //
    public Video() {
    }
    //
    public Video(UUID id, String titulo, String descripcion, String url, Categoria categoria) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.url = url;
        this.categoria = categoria;
    }
    //
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
