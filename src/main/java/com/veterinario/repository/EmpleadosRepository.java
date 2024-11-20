package com.veterinario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veterinario.entity.Empleado;

public interface EmpleadosRepository extends JpaRepository<Empleado, Integer>{

}
