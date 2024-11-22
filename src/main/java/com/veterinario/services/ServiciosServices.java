package com.veterinario.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veterinario.entity.Servicio;
import com.veterinario.repository.ServiciosRepository;

@Service
public class ServiciosServices implements InServiciosServices{
    @Autowired
    private ServiciosRepository repoServicios;

    @Override
    public List<Servicio> obtenerServicios() {
        return repoServicios.findAll();
    }

    @Override
    public void guardarServicio(Servicio servicio) {
        repoServicios.save(servicio);
    }

    @Override
    public void eliminarServicio(Integer idServicio) {
        repoServicios.deleteById(idServicio);
    }

    @Override
    public Servicio buscarPorId(Integer idServicio) {
        Servicio servicio = null;
        Optional <Servicio> optional = repoServicios.findById(idServicio);
        if(optional.isPresent()){
            servicio = optional.get();
        }
        return servicio;
    }

    @Override
    public int totalServicios() {
        return (int) repoServicios.count();
    }

}
