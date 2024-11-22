package com.veterinario.services;

import java.util.List;

import com.veterinario.entity.Inventario;

public interface InInventariosServices {
    public List<Inventario> obtenerInventarios();
    public void guardarInventario(Inventario inventario);
    public void eliminarInventario(Integer idInventario);
    public Inventario buscarPorId(Integer idInventario);
    public int totalInventarios();
}
