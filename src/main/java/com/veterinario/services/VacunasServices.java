package com.veterinario.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veterinario.entity.Vacuna;
import com.veterinario.repository.VacunasRepository;

@Service
public class VacunasServices implements InVacunasServices{
    @Autowired
    private VacunasRepository repoVacunas;

    @Override
    public List<Vacuna> obtener() {
        return repoVacunas.findAll();
    }

    @Override
    public void guardar(Vacuna vacuna) {
        repoVacunas.save(vacuna);
    }

    @Override
    public void eliminar(Integer idVacuna) {
       repoVacunas.deleteById(idVacuna);
    }

    @Override
    public Vacuna buscarPorId(Integer idVacuna) {
        Vacuna vacuna = null;
        Optional<Vacuna> optional = repoVacunas.findById(idVacuna);
        if (optional.isPresent()) {
            vacuna = optional.get();
        }
        return vacuna;
    }

    @Override
    public int totalVacunas() {
        return (int) repoVacunas.count();
    }

}
