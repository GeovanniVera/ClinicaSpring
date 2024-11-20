package com.veterinario.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inventario")
public class InventarioController {
    @GetMapping("/")
    public String listaInventario(){
        return new String("inventario/lista-inventario");
    }

    @GetMapping("/agregar")
    public String agregarInventario(){
        return new String("inventario/form-inventario");
    }
}
