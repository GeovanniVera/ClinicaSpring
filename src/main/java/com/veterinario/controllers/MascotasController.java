package com.veterinario.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.veterinario.entity.Mascota;
import com.veterinario.services.InMascotasServices;

import org.springframework.web.bind.annotation.PostMapping;



@Controller
@RequestMapping("/mascotas")
public class MascotasController {
    @Autowired
    InMascotasServices servicesMascotas;
    @GetMapping("/")
    public String listaMascota(Model model){
        List<Mascota> lista = servicesMascotas.obtenerMascota();
        for (Mascota mascota : lista) {
            System.out.println(mascota);
        }
        model.addAttribute("mascotas", lista);
        return new String("mascotas/lista-mascota");
    }
    @GetMapping("/agregar")
    public String agregarMascota(){
        return new String("mascotas/form-mascota");
    }

    @GetMapping("/eliminar")
    public String eliminar(@RequestParam("id") int idMascota) {
        servicesMascotas.eliminarMascota(idMascota);
        return new String("redirect:/mascotas/");
    }

    @GetMapping("/actualizar")
    public String actualizar(@RequestParam("id") int idMascota, Model model) {
        Mascota mascota = servicesMascotas.buscarPorId(idMascota);
        model.addAttribute("mascota", mascota);
        return new String("mascotas/form-update-mascota");
    }
    
    @PostMapping("/guardar")
    public String postMethodName(Mascota mascota) {
        servicesMascotas.guardarMascota(mascota);
        System.out.println(mascota);
        return new String("redirect:/mascotas/");
    }
    

    
}
