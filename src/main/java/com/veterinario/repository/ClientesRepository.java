package com.veterinario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veterinario.entity.Cliente;

public interface ClientesRepository extends JpaRepository<Cliente, Integer>{

}
