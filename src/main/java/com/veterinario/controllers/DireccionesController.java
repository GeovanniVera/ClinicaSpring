package com.veterinario.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/direcciones")
public class DireccionesController {
    @GetMapping("/")
    public String index() {
        return new String("direcciones/lista-direcciones");
    }
    @GetMapping("/agregar")
    public String agregarDireccion() {
        return new String("direcciones/form-direccion");
    }
    
}
