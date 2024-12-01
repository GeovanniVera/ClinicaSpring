package com.veterinario.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.veterinario.entity.Vacuna;
import com.veterinario.services.InVacunasServices;

@Controller
@RequestMapping("/vacunas")
public class VacunasController {
    @Autowired
    private InVacunasServices serviceVacuna;
    @GetMapping("/")
    public String listaVacunas(Model model) {
        List<Vacuna> lista = serviceVacuna.obtener();
        for (Vacuna vacuna : lista) {
            System.out.println(vacuna);
        }

        model.addAttribute("alergias", lista);
        return "vacunas/lista-vacunas";
    }

    @GetMapping("/agregar")
    public String agregarVacuna() {
        return "vacunas/form-vacunas";
    }

    @PostMapping("/guardar")
    public String guardarVacuna(Vacuna vacuna) {
        System.out.println(vacuna);
        serviceVacuna.guardar(vacuna);
        return new String ("redirect:/vacunas/");
    }

    @GetMapping("/actualizar")
    public String actualizarvacuna(@RequestParam("id") int idVacuna, Model model) {
        Vacuna vacuna = serviceVacuna.buscarPorId(idVacuna);
        model.addAttribute("vacuna", vacuna);
        return new String("vacunas/form-update-vacunas");
    }

    @GetMapping("/eliminar")
    public String getMethodName(@RequestParam("id") int idVacuna) {
        serviceVacuna.eliminar(idVacuna);
        return new String("redirect:/vacunas/");
    }
}
