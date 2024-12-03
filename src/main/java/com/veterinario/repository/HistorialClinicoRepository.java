package com.veterinario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.veterinario.entity.HistorialClinico;

@Repository
public interface HistorialClinicoRepository extends JpaRepository<HistorialClinico, Integer> {

}
