package com.veterinario.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veterinario.entity.Tratamiento;
import com.veterinario.repository.TratamientosRepository;

@Service
public class TratamientosServices implements InTratamientosServices{
    @Autowired
    private TratamientosRepository repoTratamientos;

    @Override
    public List<Tratamiento> obtenerTratamientos() {
        return repoTratamientos.findAll();
    }

    @Override
    public void guardar(Tratamiento tratamiento) {
        repoTratamientos.save(tratamiento);
    }

    @Override
    public void eliminar(Integer idTratamiento) {
        repoTratamientos.deleteById(idTratamiento);
    }

    @Override
    public Tratamiento buscarPorId(Integer idTratamiento) {
        Tratamiento tratamiento = null;
        Optional<Tratamiento> optional = repoTratamientos.findById(idTratamiento);
        if(optional.isPresent()){
            tratamiento=optional.get();
        }
        return tratamiento;
    }

    @Override
    public int total() {
        return (int) repoTratamientos.count();
    }
    
}
