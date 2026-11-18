package com.example.NutreAPP.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.NutreAPP.models.Visualizacion;
import com.example.NutreAPP.repositories.IVideoRepositorio;

public class VisualizacionServicio {
    @Autowired
    private IVideoRepositorio repositorio;

    public Visualizacion guardar(Visualizacion datos){
        return this.repositorio.save(datos);
    }
    // Metodo para guardar   
    // Metodo para para buscar por id
    // Metodo para buscar todos
    // Metodo para modificar

    // Metodo para 
    // Metodo para 
    // Metodo para 
}
