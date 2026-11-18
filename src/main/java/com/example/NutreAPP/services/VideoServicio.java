package com.example.NutreAPP.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.NutreAPP.models.Video;
import com.example.NutreAPP.repositories.IVideoRepositorio;

public class VideoServicio {
    @Autowired
    private IVideoRepositorio repositorio;

    public Video guardar(Video datos){
        return this.repositorio.save(datos);
    }
    // Metodo para guardar   
    // Metodo para para buscar por id
    // Metodo para buscar todos
    // Metodo para modificar

    // Metodo 
    // Metodo 
    // Metodo 
}
