package com.veterinario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veterinario.entity.Servicio;

public interface ServiciosRepository extends JpaRepository<Servicio, Integer>{

}
