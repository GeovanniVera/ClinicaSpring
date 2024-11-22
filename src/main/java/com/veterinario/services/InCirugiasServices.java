package com.veterinario.services;

import java.util.List;

import com.veterinario.entity.Cirugia;

public interface InCirugiasServices {
    public List<Cirugia> obtenerCirugias();
    public void guardarCirugia(Cirugia cirugia);
    public void eliminarCirugia(Integer idCirugia);
    public Cirugia buscarPorId(Integer idCirugia);
    public int totalCirugias();
}
