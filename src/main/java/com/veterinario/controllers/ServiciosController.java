package com.veterinario.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/servicios")
public class ServiciosController {
    @GetMapping("/")
    public String listaServicios(){
        return new String("servicios/lista-servicios");
    }
    @GetMapping("/agregar")
    public String agregarServicios(){
        return new String("servicios/form-servicio");
    }
}   
