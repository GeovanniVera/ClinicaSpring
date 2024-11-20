package com.veterinario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veterinario.entity.Alergia;

public interface AlergiasRepository extends JpaRepository<Alergia, Integer>{
    
}
