package com.veterinario.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veterinario.entity.HistorialClinico;
import com.veterinario.repository.HistorialClinicoRepository;

@Service
public class HistorialClinicoServicios implements InHistorialClinicoServicios {
    @Autowired
    private HistorialClinicoRepository historialClinicorepo;

    @Override
    public List<HistorialClinico> obtenerHistorialClinicos() {
        return historialClinicorepo.findAll();
    }

    @Override
    public void guardarHistorialClinico(HistorialClinico historialClinico) {
        historialClinicorepo.save(historialClinico);
    }

    @Override
    public void eliminarHistorialClinico(Integer idHistorialClinico) {
        historialClinicorepo.deleteById(idHistorialClinico);
    }

    @Override
    public HistorialClinico buscarPorId(Integer idHistorialClinico) {
        HistorialClinico historialClinico = null;
        Optional <HistorialClinico> optional = historialClinicorepo.findById(idHistorialClinico);
        if (optional.isPresent()){
            historialClinico = optional.get();
        }
        return historialClinico;
    }

    @Override
    public int totalHistorialClinico() {
        return (int) historialClinicorepo.count();
    }

}
