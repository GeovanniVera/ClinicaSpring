package com.veterinario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veterinario.entity.Cirugia;

public interface CirugiasRepository extends JpaRepository<Cirugia, Integer> {

}
