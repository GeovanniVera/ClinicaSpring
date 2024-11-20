package com.veterinario.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/cirugias")
public class CirugiasController {
    @GetMapping("/")
    public String listaCirugias(){
        return "cirugias/lista-cirugias";
    }    

    @GetMapping("/agregar")
    public String agregar() {
        return new String("cirugias/form-cirugia");
    }
    
}
