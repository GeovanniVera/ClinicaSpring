package com.veterinario.services;

import java.util.List;


import com.veterinario.entity.Usuario;

public interface InUsuariosServices {
    public List<Usuario> obtener();
    public void guardar(Usuario usuario);
    public void eliminar(Integer idUsuario);
    public Usuario buscarPorId(int idUsuario);
    public Usuario findByUserName(String nombre);
    public int total();
}
