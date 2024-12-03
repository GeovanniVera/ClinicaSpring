package com.veterinario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veterinario.entity.HistorialAlergia;

public interface HistorialAlergiaRepository extends JpaRepository<HistorialAlergia, Integer> {
    
}
