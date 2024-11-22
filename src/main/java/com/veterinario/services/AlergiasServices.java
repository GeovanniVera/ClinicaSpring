package com.veterinario.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veterinario.entity.Alergia;
import com.veterinario.repository.AlergiasRepository;

@Service
public class AlergiasServices implements InAlergiaService{
    @Autowired
    private AlergiasRepository repoAlergias;

    @Override
    public List<Alergia> obtenerAlergias() {
        return repoAlergias.findAll();
    }

    @Override
    public void guardarAlergia(Alergia alergia) {
        repoAlergias.save(alergia);
    }

    @Override
    public void eliminarAlergia(Integer idAlergia) {
        repoAlergias.deleteById(idAlergia);
    }

    @Override
    public Alergia buscarPorId(Integer idAlergia) {
        Alergia alergia = null;
        Optional<Alergia> optional = repoAlergias.findById(idAlergia);
        if(optional.isPresent()){
            alergia = optional.get();
        }
        return alergia;
    }

    @Override
    public int totalAlergias() {
        return (int) repoAlergias.count();
    }
    
}
