package com.veterinario.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/contactos")
public class ContactosController {
    @GetMapping("/")
    public String index() {
        return new String("contactos/lista-contactos");
    }
    
    @GetMapping("/agregar")
    public String agregarContacto() {
        return new String("contactos/form-contactos");
    }
    
}
