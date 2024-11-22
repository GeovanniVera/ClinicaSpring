package com.veterinario.services;

import java.util.List;

import com.veterinario.entity.Alergia;

public interface InAlergiaService{
    //Define las operaciones del crud
    public List<Alergia> obtenerAlergias();
    public void guardarAlergia(Alergia alergia);
    public void eliminarAlergia(Integer idAlergia);
    public Alergia buscarPorId(Integer idAlergia);
    public int totalAlergias();
}
