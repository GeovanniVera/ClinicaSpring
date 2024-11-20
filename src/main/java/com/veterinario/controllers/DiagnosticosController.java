package com.veterinario.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/diagnosticos")
public class DiagnosticosController {
    @GetMapping("/")
    public String listaDiagnosticos(){
        return new String("diagnosticos/lista-diagnosticos");
    }
    @GetMapping("/agregar")
    public String agregarDiagnostico(){
        return new String("diagnosticos/form-diagnosticos");
    }
}
