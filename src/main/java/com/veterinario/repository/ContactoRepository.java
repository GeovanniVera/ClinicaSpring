package com.veterinario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veterinario.entity.Contacto;

public interface ContactoRepository extends JpaRepository<Contacto,Integer>{

}
