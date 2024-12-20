package com.veterinario.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/empleados")
public class EmpleadosController {
    @GetMapping("/")
    public String listaEmpleado(){
        return "empleados/lista-empleado";
    };
    
    @GetMapping("/agregar")
    public String agregarEmpleado(){
        return "empleados/form-empleado";
    };
}
