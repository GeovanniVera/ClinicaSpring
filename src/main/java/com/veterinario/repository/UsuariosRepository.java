package com.veterinario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.veterinario.entity.Usuario;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuario, Integer>{
    Usuario findByUserName(String userName);
}
