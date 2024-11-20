package com.veterinario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veterinario.entity.Usuario;

public interface UsuariosRepository extends JpaRepository<Usuario, Integer>{

}
