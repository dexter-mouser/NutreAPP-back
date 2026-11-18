package com.example.NutreAPP.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.NutreAPP.models.Usuario;
import com.example.NutreAPP.repositories.IUsuarioRepositorio;

public class UsuarioServicio {
    @Autowired 
    private IUsuarioRepositorio repositorio;

    public Usuario guardar(Usuario datos){
        return this.repositorio.save(datos);
    }
    public Usuario buscarPorId(UUID id){
        Optional<Usuario> usuarioBuscado = this.repositorio.findById(id);
    }
    // Metodo para guardar   
    // Metodo para para buscar por id
    // Metodo para buscar todos
    // Metodo para modificar

    // Metodo para buscar por depto y rol
    // Metodo para buscar por correo
    // Metodo para verificar correo
}
