package com.veterinario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veterinario.entity.Inventario;

public interface InventariosRepository extends JpaRepository<Inventario, Integer>{

}
