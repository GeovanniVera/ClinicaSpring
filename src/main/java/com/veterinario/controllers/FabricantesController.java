package com.veterinario.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
@RequestMapping("/fabricantes")
public class FabricantesController {
    @GetMapping("/")
    public String index() {
        return new String("fabricantes/lista-fabricantes");
    }

    @GetMapping("/agregar")
    public String agregarFabricante() {
        return new String("fabricantes/form-fabricantes");
    }
}
