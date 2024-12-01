package com.veterinario.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.veterinario.entity.Fabricante;
import com.veterinario.entity.Vacuna;
import com.veterinario.services.InFabricantesServices;
import com.veterinario.services.InVacunasServices;

@Controller
@RequestMapping("/vacunas")
public class VacunasController {
    @Autowired
    private InVacunasServices serviceVacuna;

    @Autowired 
    InFabricantesServices servicesFabricante;
    @GetMapping("/")
    public String listaVacunas(Model model) {
        List<Vacuna> lista = serviceVacuna.obtener();
        model.addAttribute("vacunas", lista);
        return "vacunas/lista-vacunas";
    }

    @GetMapping("/agregar")
    public String agregarVacuna(Model model, Vacuna vacuna) {
        List<Fabricante> fabricantes = servicesFabricante.obtenerFabricantes();
        for (Fabricante fabricante : fabricantes) {
            System.out.println(fabricante.getNombre());
        }
        model.addAttribute("fabricantes", fabricantes);
        return "vacunas/form-vacunas";
    }

    @PostMapping("/guardar")
    public String guardarVacuna(Vacuna vacuna) {
        serviceVacuna.guardar(vacuna);
        return new String ("redirect:/vacunas/");
    }

    @GetMapping("/actualizar")
    public String actualizarvacuna(@RequestParam("id") int id, Model model) {
        Vacuna vacuna = serviceVacuna.buscarPorId(id);
        List<Fabricante> fabricantes = servicesFabricante.obtenerFabricantes();
        for (Fabricante fabricante : fabricantes) {
            System.out.println(fabricante.getNombre());
        }
        model.addAttribute("fabricantes", fabricantes);
        model.addAttribute("vacuna", vacuna);
        return new String("vacunas/form-vacunas");
    }

    @GetMapping("/eliminar")
    public String eliminar(@RequestParam("id") int id) {
        serviceVacuna.eliminar(id);
        return new String("redirect:/vacunas/");
    }
}
