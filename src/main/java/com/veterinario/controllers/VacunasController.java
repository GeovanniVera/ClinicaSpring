package com.veterinario.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vacunas")
public class VacunasController {
    @GetMapping("/")
    public String listaVacunas(){
        return new String("vacunas/lista-vacunas");
    }
    @GetMapping("/agregar")
    public String agregarVacunas(){
        return new String("vacunas/form-vacunas");
    }
}
