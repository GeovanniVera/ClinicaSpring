package com.veterinario.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veterinario.entity.Mascota;
import com.veterinario.repository.MascotasRepository;

@Service
public class MascotaServices implements InMascotasServices{
    @Autowired
    private MascotasRepository repoMascotas;

    @Override
    public List<Mascota> obtenerMascota() {
        return repoMascotas.findAll();
    }

    @Override
    public void guardarMascota(Mascota mascota) {
        repoMascotas.save(mascota);
    }

    @Override
    public void eliminarMascota(Integer idMascota) {
        repoMascotas.deleteById(idMascota);
    }

    @Override
    public Mascota buscarPorId(Integer idMascota) {
        Mascota mascota = null;
        Optional<Mascota> optional = repoMascotas.findById(idMascota);
        if(optional.isPresent()){
            mascota = optional.get();
        }
        return mascota;
    }

    @Override
    public int totalMascotas() {
        return (int) repoMascotas.count();
    }

}
