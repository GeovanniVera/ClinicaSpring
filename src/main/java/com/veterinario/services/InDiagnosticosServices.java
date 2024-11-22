package com.veterinario.services;

import java.util.List;

import com.veterinario.entity.Diagnostico;

public interface InDiagnosticosServices {
     public List<Diagnostico> obtenerDiagnosticos();
    public void guardarDiagnostico(Diagnostico diagnostico);
    public void eliminarDiagnostico(Integer idDiagnostico);
    public Diagnostico buscarPorId(Integer idDiagnostico);
    public int totalDiagnosticos();
}
