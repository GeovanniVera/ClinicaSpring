package com.veterinario.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alergias")
public class AlergiasController {
    @GetMapping("/")
    public String listaAlergias(){
        return "alergias/lista-alergias";
    }

    @GetMapping("/agregar")
    public String agregarAlergia(){
        return "alergias/form-alergia";
    }
}

