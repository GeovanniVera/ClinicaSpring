package com.veterinario.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veterinario.entity.Diagnostico;
import com.veterinario.repository.DiagnosticosRepository;
@Service
public class DiagnosticosServices implements InDiagnosticosServices{
    @Autowired
    private DiagnosticosRepository repoDiagnostico;
    
    @Override
    public List<Diagnostico> obtenerDiagnosticos() {
        return repoDiagnostico.findAll();
    }

    @Override
    public void guardarDiagnostico(Diagnostico diagnostico) {
        repoDiagnostico.save(diagnostico);
    }

    @Override
    public void eliminarDiagnostico(Integer idDiagnostico) {
        repoDiagnostico.deleteById(idDiagnostico);
    }

    @Override
    public Diagnostico buscarPorId(Integer idDiagnostico) {
        Diagnostico diagnostico = null;
        Optional<Diagnostico> optional = repoDiagnostico.findById(idDiagnostico);
        if (optional.isPresent()) {
            diagnostico = optional.get();
        }
        return diagnostico;
    }

    @Override
    public int totalDiagnosticos() {
        return (int) repoDiagnostico.count();
    }

}
