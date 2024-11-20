package com.veterinario.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/insumos")
public class InsumosController {
    @GetMapping("/")
    public String listaInsumos(){
        return new String("insumos/lista-insumos");
    }
    
    @GetMapping("/agregar")
    public String agregarInsumo() {
        return new String("insumos/form-insumos");
    }
    
}
