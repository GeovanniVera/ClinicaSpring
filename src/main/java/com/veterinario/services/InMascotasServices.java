package com.veterinario.services;

import java.util.List;

import com.veterinario.entity.Mascota;

public interface InMascotasServices {
    public List<Mascota> obtenerMascota();
    public void guardarMascota(Mascota mascota);
    public void eliminarMascota(Integer idMascota);
    public Mascota buscarPorId(Integer idMascota);
    public int totalMascotas();
}
