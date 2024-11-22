package com.veterinario.services;

import java.util.List;

import com.veterinario.entity.Servicio;

public interface InServiciosServices {
    public List<Servicio> obtenerServicios();
    public void guardarServicio(Servicio servicio);
    public void eliminarServicio(Integer idServicio);
    public Servicio buscarPorId(Integer idServicio);
    public int totalServicios();
}
