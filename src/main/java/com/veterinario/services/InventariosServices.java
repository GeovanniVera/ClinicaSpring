package com.veterinario.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veterinario.entity.Inventario;
import com.veterinario.repository.InventariosRepository;

@Service
public class InventariosServices implements InInventariosServices{
    @Autowired
    private InventariosRepository repoInventarios;

    @Override
    public List<Inventario> obtenerInventarios() {
        return repoInventarios.findAll();
    }

    @Override
    public void guardarInventario(Inventario inventario) {
        repoInventarios.save(inventario);
    }

    @Override
    public void eliminarInventario(Integer idInventario) {
        repoInventarios.deleteById(idInventario);
    }

    @Override
    public Inventario buscarPorId(Integer idInventario) {
        Inventario inventario = null;
        Optional<Inventario> optional = repoInventarios.findById(idInventario);
        if(optional.isPresent()){
            inventario = optional.get();
        }
        return inventario;
    }

    @Override
    public int totalInventarios() {
        return (int) repoInventarios.count();
    }
    

}
