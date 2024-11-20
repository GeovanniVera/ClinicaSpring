package com.veterinario.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clientes")
public class ClientesController {
    @GetMapping("/")
    public String listaClientes(){
        return new String("clientes/lista-cliente");
    } 
    @GetMapping("/agregar")
    public String agregar(){
        return new String("clientes/form-cliente");
    }
}
