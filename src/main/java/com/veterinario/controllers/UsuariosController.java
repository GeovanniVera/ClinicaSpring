package com.veterinario.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuarios")
public class UsuariosController {

    @GetMapping("/")
    public String listaUsuario(){
        return "usuarios/lista-usuario";
    }
    
    @GetMapping("/agregar")
    public String agregarUsuario(){
        return "usuarios/form-usuario";
    }
}
