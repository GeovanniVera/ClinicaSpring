package com.veterinario.services;

import java.util.List;

import com.veterinario.entity.Fabricante;

public interface InFabricantesServices {
    public List<Fabricante> obtenerFabricantes();
    public void eliminarFabricante(Integer idFabricante);
    public void guardarFabricante(Fabricante fabricante);
    public Fabricante buscarFabricante(Integer idFabricante);
    public int totalFabricantes();
}
