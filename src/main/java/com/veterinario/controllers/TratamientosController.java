package com.veterinario.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tratamientos")
public class TratamientosController {
    @GetMapping("/")
    public String listaTratamientos(){
        return new String("tratamientos/lista-tratamientos");
    }
    @GetMapping("/agregar")
    public String agregarTratamientos(){
        return new String("tratamientos/form-tratamiento");
    }
}
