package com.veterinario.services;

import java.util.List;

import com.veterinario.entity.HistorialClinico;

public interface InHistorialClinicoServicios {

    public List<HistorialClinico> obtenerHistorialClinicos();
    public void guardarHistorialClinico(HistorialClinico historialClinico);
    public void eliminarHistorialClinico(Integer idHistorialClinico);
    public HistorialClinico buscarPorId(Integer idHistorialClinico);
    public int totalHistorialClinico();

}
