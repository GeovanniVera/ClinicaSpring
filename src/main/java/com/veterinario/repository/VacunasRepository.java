package com.veterinario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veterinario.entity.Vacuna;

public interface VacunasRepository extends JpaRepository<Vacuna, Integer>{

}
