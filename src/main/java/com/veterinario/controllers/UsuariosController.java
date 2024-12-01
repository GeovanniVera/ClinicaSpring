package com.veterinario.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.veterinario.entity.Vacuna;
import com.veterinario.services.InFabricantesServices;
import com.veterinario.services.InInsumosServices;
import com.veterinario.services.InVacunasServices;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


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
    @PostMapping("/guardar")
    public String guardar(Vacuna vacuna) {
        return "redirect:/usuarios/";
    }
    
}
