package com.veterinario.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veterinario.entity.Cirugia;
import com.veterinario.repository.CirugiasRepository;

@Service
public class CirugiasServices implements InCirugiasServices{
    @Autowired
    private CirugiasRepository repoCirugias;
    @Override
    public List<Cirugia> obtenerCirugias() {
        return repoCirugias.findAll();
    }

    @Override
    public void guardarCirugia(Cirugia cirugia) {
        repoCirugias.save(cirugia);
    }

    @Override
    public void eliminarCirugia(Integer idCirugia) {
        repoCirugias.deleteById(idCirugia);
    }

    @Override
    public Cirugia buscarPorId(Integer idCirugia) {
        Cirugia cirugia = null;
        Optional<Cirugia> optional = repoCirugias.findById(idCirugia);
        if(optional.isPresent()){
            cirugia = optional.get();
        }
        return cirugia;
    }

    @Override
    public int totalCirugias() {
        return (int) repoCirugias.count();
    }

}
