package com.veterinario.services;

import java.util.List;

import com.veterinario.entity.Contacto;

public interface InContactoServices {
    public List<Contacto> obtenerContactos();
    public void guardarContacto(Contacto contacto);
    public void eliminarContacto(Integer idContacto);
    public Contacto buscarContactoPorId(Integer idContacto);
    public int totalContactos();
}
