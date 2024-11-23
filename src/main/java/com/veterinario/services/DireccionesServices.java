package com.veterinario.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veterinario.entity.Direccion;
import com.veterinario.repository.DireccionRepository;

@Service
public class DireccionesServices implements InDireccionesServices{
    @Autowired
    DireccionRepository repoDirecciones;

    @Override
    public List<Direccion> obtenerDirecciones() {
        return repoDirecciones.findAll();
    }

    @Override
    public void eliminarDireccion(Integer idDireccion) {
        repoDirecciones.deleteById(idDireccion);
    }

    @Override
    public void guardarDireccion(Direccion direccion) {
        repoDirecciones.save(direccion);
    }

    @Override
    public Direccion buscarDireccion(Integer idDireccion) {
        Direccion direccion = null;
        Optional<Direccion> optional= repoDirecciones.findById(idDireccion);
        if(optional.isPresent()){
            direccion = optional.get();
        }
        return direccion;
    }

    @Override
    public int totalDirecciones() {
        return (int) repoDirecciones.count();
    }

}
