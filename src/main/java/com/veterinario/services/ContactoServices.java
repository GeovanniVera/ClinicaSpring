package com.veterinario.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veterinario.entity.Contacto;
import com.veterinario.repository.ContactoRepository;

@Service
public class ContactoServices implements InContactoServices{
    @Autowired
    ContactoRepository repoContactos;

    @Override
    public List<Contacto> obtenerContactos() {
        return repoContactos.findAll();
    }

    @Override
    public void guardarContacto(Contacto contacto) {
        repoContactos.save(contacto);
    }

    @Override
    public void eliminarContacto(Integer idContacto) {
        repoContactos.deleteById(idContacto);
    }

    @Override
    public Contacto buscarContactoPorId(Integer idContacto) {
        Contacto contacto = null;
        Optional<Contacto> optional= repoContactos.findById(idContacto);
        if(optional.isPresent()){
            contacto = optional.get();
        }
        return contacto;
    }

    @Override
    public int totalContactos() {
        return (int) repoContactos.count();
    }
    
}
