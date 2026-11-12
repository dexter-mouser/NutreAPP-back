package com.example.NutreAPP.repositories;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.NutreAPP.models.Visualizacion;

@Repository
public interface IVisualizacionRepositorio extends JpaRepository<Visualizacion, UUID> {

    // Consultas en tabla visualizaciones
    // Con @Query porque el "_" de fecha_visualizacion rompe las consultas derivadas
    @Query("SELECT v FROM Visualizacion v WHERE v.fecha_visualizacion = :fecha")
    List<Visualizacion> buscarPorFechaVisualizacion(@Param("fecha") LocalDate fecha);

    List<Visualizacion> findByCompletadoFalse();

    List<Visualizacion> findByCompletadoTrue();
}
