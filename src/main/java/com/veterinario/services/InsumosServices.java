package com.veterinario.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veterinario.entity.Insumo;
import com.veterinario.repository.InsumosRepository;

@Service
public class InsumosServices implements InInsumosServices{
    @Autowired
    private InsumosRepository repoInsumos;

    @Override
    public List<Insumo> obtenerInsumos() {
        return repoInsumos.findAll();
    }

    @Override
    public void guardarInsumo(Insumo insumo) {
       repoInsumos.save(insumo);
    }

    @Override
    public void eliminarInsumo(Integer idInsumo) {
        repoInsumos.deleteById(idInsumo);
    }

    @Override
    public Insumo buscarInsumo(Integer idInsumo) {
        Insumo insumo = null;
        Optional<Insumo>optional = repoInsumos.findById(idInsumo);
        if(optional.isPresent()){
            insumo = optional.get();
        }
        return insumo;
    }

    @Override
    public int totalInsumo() {
        return (int) repoInsumos.count();
    }

}
