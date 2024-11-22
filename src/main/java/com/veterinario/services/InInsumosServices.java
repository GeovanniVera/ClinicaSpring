package com.veterinario.services;

import java.util.List;

import com.veterinario.entity.Insumo;

public interface InInsumosServices {
    public List<Insumo> obtenerInsumos();
    public void guardarInsumo(Insumo insumo);
    public void eliminarInsumo(Integer idInsumo);
    public Insumo buscarInsumo(Integer idInsumo);
    public int totalInsumo();
}
