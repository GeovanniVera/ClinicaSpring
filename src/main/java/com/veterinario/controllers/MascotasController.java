package com.veterinario.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mascotas")
public class MascotasController {
    @GetMapping("/")
    public String listaMascota(){
        return new String("mascotas/lista-mascota");
    }
    @GetMapping("/agregar")
    public String agregarMascota(){
        return new String("mascotas/form-mascota");
    }
}
