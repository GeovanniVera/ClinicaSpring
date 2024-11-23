package com.veterinario.services;

import java.util.List;

import com.veterinario.entity.Direccion;

public interface InDireccionesServices {
    public List<Direccion> obtenerDirecciones();
    public void eliminarDireccion(Integer idDireccion);
    public void guardarDireccion(Direccion direccion);
    public Direccion buscarDireccion(Integer idDireccion);
    public int totalDirecciones();
}
