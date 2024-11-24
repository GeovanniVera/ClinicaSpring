package com.veterinario.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veterinario.entity.Usuario;
import com.veterinario.repository.UsuariosRepository;

@Service
public class UsuariosServices implements InUsuariosServices{
    @Autowired
    private UsuariosRepository repoUsuarios;

    @Override
    public List<Usuario> obtener() {
        return repoUsuarios.findAll();
    }

    @Override
    public void guardar(Usuario usuario) {
        repoUsuarios.save(usuario);
    }

    @Override
    public void eliminar(Integer idUsuario) {
        repoUsuarios.deleteById(idUsuario);
    }

    @Override
    public Usuario buscarPorId(int idUsuario) {
        Usuario usuario = null;
        Optional<Usuario> optional = repoUsuarios.findById(idUsuario);
        if(optional.isPresent()){
            usuario=optional.get();
        }
        return usuario;
    }

    @Override
    public int total() {
        return (int) repoUsuarios.count();
    }


    @Override
    public Usuario findByUserName(String nombre) {
        return repoUsuarios.findByUserName(nombre);
    }
    
}
