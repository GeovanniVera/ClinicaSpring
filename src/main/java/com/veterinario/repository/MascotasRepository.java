package com.veterinario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veterinario.entity.Mascota;

public interface MascotasRepository extends JpaRepository<Mascota, Integer>{

}
