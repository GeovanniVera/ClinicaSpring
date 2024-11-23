package com.veterinario.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veterinario.entity.Fabricante;
import com.veterinario.repository.FabricantesRepository;
@Service
public class FabricantesServices implements InFabricantesServices{
    @Autowired
    private FabricantesRepository repoFabricantes;
    @Override
    public List<Fabricante> obtenerFabricantes() {
        return repoFabricantes.findAll();
    }

    @Override
    public void eliminarFabricante(Integer idFabricante) {
        repoFabricantes.deleteById(idFabricante);
    }

    @Override
    public void guardarFabricante(Fabricante fabricante) {
        repoFabricantes.save(fabricante);
    }

    @Override
    public Fabricante buscarFabricante(Integer idFabricante) {
        Fabricante fabricante = null;
        Optional<Fabricante> optional = repoFabricantes.findById(idFabricante);
        if(optional.isPresent()){
            fabricante = optional.get();
        }
        return fabricante;
    }

    @Override
    public int totalFabricantes() {
        return (int) repoFabricantes.count();
    }

}
