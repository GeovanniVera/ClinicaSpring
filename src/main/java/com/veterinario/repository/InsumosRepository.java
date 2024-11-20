package com.veterinario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veterinario.entity.Insumo;

public interface InsumosRepository extends JpaRepository<Insumo, Integer>{

}
