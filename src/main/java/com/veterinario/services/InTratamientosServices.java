package com.veterinario.services;

import java.util.List;

import com.veterinario.entity.Tratamiento;

public interface InTratamientosServices {
    public List<Tratamiento> obtenerTratamientos();
    public void guardar(Tratamiento tratamiento);
    public void eliminar(Integer idTratamiento);
    public Tratamiento buscarPorId(Integer idTratamiento);
    public int total();
}
