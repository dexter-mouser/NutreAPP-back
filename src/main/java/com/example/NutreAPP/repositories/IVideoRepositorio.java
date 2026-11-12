package com.example.NutreAPP.repositories;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.NutreAPP.models.Video;
import com.example.NutreAPP.models.helpers.Categoria;

@Repository
public interface IVideoRepositorio extends JpaRepository<Video, UUID> {

    // Consultas en tabla videos
    List<Video> findByCategoria(Categoria categoria);

    List<Video> findByTituloIgnoreCase(String titulo);

    List<Video> findByDescripcionContainingIgnoreCase(String fragmento);

    // La URL es única
    Optional<Video> findByUrl(String url);

    List<Video> findByTituloIgnoreCaseAndCategoria(String titulo, Categoria categoria);
}
