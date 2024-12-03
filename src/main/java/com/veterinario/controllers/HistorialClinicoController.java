package com.veterinario.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.veterinario.entity.HistorialClinico;
import com.veterinario.entity.Mascota;
import com.veterinario.services.InHistorialClinicoServicios;
import com.veterinario.services.InMascotasServices;

@Controller
@RequestMapping("/historialclinico")
public class HistorialClinicoController {
    @Autowired
    private InHistorialClinicoServicios servicioHistorialClinico;
    @Autowired
    private InMascotasServices servicioMascotas;
    @GetMapping("/")
    public String listaHistorialClinicos(Model model) {
        List<HistorialClinico> lista = servicioHistorialClinico.obtenerHistorialClinicos();
        for (HistorialClinico historialClinico : lista) {
            System.out.println(historialClinico);
        }

        model.addAttribute("historialesClinicos", lista);
        return "HistorialClinico/lista-historialClinico";
    }

    @GetMapping("/agregar")
    public String agregarHistorialClinico(HistorialClinico historialClinico, Model model) {
        List<Mascota> mascotas = servicioMascotas.obtenerMascota();
        model.addAttribute("mascotas", mascotas);
        return "HistorialClinico/form-historialClinico";
    }

    @PostMapping("/guardar")
    public String guardarHistorialClinico(HistorialClinico historialClinico){
        servicioHistorialClinico.guardarHistorialClinico(historialClinico);
        return "redirect:/historialclinico/";
    }    

    @GetMapping("/actualizar")
    public String actualizarHistorialClinico(@RequestParam("id") int idHistorialClinico, Model model) {
        List<Mascota> mascotas = servicioMascotas.obtenerMascota();
        model.addAttribute("mascotas", mascotas);
        HistorialClinico historialClinico = servicioHistorialClinico.buscarPorId(idHistorialClinico);
        model.addAttribute("historialClinico", historialClinico);
        return "HistorialClinico/form-historialClinico";
    }

    @GetMapping("/eliminar")
    public String eliminarHistorialClinico(@RequestParam("id") int idHistorialClinico) {
        servicioHistorialClinico.eliminarHistorialClinico(idHistorialClinico);
        return "redirect:/historialclinico/";
    }

    @GetMapping("/detalle")
    public String detalles(@RequestParam("id") int idHistorialClinico, Model model) {
        HistorialClinico historialClinico = servicioHistorialClinico.buscarPorId(idHistorialClinico);
        model.addAttribute("historialClinico", historialClinico);
        return "HistorialClinico/detallesHistorialClinico";
    }

}
