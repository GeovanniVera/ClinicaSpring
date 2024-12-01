package com.veterinario.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.veterinario.entity.Tratamiento;
import com.veterinario.services.InTratamientosServices;

@Controller
@RequestMapping("/tratamientos")
public class TratamientosController {
    @Autowired
    InTratamientosServices servicesTratamientos;
    @GetMapping("/")
    public String listaTratamiento(Model model){
        List<Tratamiento> lista= servicesTratamientos.obtenerTratamientos();
        model.addAttribute("tratamientos", lista);
        return new String("tratamientos/lista-tratamientos");
    }
    @GetMapping("/agregar")
    public String agregarTratamientos(Tratamiento tratamiento){
        return new String("tratamientos/form-tratamiento");
    }
    @GetMapping("/eliminar")
    public String eliminar(@RequestParam("id") int idEmpleado) {
        servicesTratamientos.eliminar(0);
        return new String("redirect:/empleados/");
    }
    @PostMapping("/guardar")
    public String guardar(Tratamiento tratamiento) {
        servicesTratamientos.guardar(tratamiento);
        return new String("redirect:/tratamientos/");
    }
    @GetMapping("/actualizar")
    public String actualizar(@RequestParam("id") Integer id, Model model ) {
        Tratamiento tratamiento = servicesTratamientos.buscarPorId(id);
        model.addAttribute("tratamiento", tratamiento);
        return new String("tratamientos/form-tratamiento");
    }
    

}
