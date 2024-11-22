package com.veterinario.services;

import java.util.List;

import com.veterinario.entity.Vacuna;

public interface InVacunasServices {
    public List<Vacuna> obtener();
    public void guardar(Vacuna vacuna);
    public void eliminar(Integer idVacuna);
    public Vacuna buscarPorId(Integer idVacuna);
    public int totalVacunas();
}
