package com.veterinario.services;

import java.util.List;

import com.veterinario.entity.Usuario;

public interface InAlergiaService{
    //Define las operaciones del crud
    public List<Usuario> obtenerUsuarios();
    public void guardarUsuario(Usuario usuario);
    public void eliminarUsuario(Integer idUsuario);
    public Usuario buscarPorId(Integer idUsuario);
    public int totalCategorias();
}
