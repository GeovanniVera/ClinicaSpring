package com.veterinario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veterinario.entity.Diagnostico;

public interface DiagnosticosRepository extends JpaRepository<Diagnostico, Integer>{

}
