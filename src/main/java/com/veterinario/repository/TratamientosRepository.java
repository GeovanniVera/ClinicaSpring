package com.veterinario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veterinario.entity.Tratamiento;

public interface TratamientosRepository extends JpaRepository<Tratamiento, Integer>{

}
