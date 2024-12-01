package com.veterinario.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.veterinario.entity.Servicio;
import com.veterinario.services.InServiciosServices;

@Controller
@RequestMapping("/servicios")
public class ServiciosController {
    @Autowired
    private InServiciosServices serviceServicio;
    @GetMapping("/")
    public String listaServicios(Model model) {
        List<Servicio> lista = serviceServicio.obtenerServicios();
        for (Servicio servicio : lista) {
            System.out.println(servicio);
        }

        model.addAttribute("servicios", lista);
        return "servicios/lista-servicios";
    }

    @GetMapping("/agregar")
    public String agregarServicio() {
        return "servicios/form-servicio";
    }

    @PostMapping("/guardar")
    public String guardarServicio(Servicio servicio) {
        System.out.println(servicio);
        serviceServicio.guardarServicio(servicio);
        return new String("redirect:/servicios/");
    }

    @GetMapping("/actualizar")
    public String actualizarServicio(@RequestParam("id") int idServicio, Model model) {
        Servicio servicio = serviceServicio.buscarPorId(idServicio);
        model.addAttribute("servicio", servicio);
        return new String("servicios/form-update-servicio");
    }

    @GetMapping("/eliminar")
    public String getMethodName(@RequestParam("id") int idServicio) {
        serviceServicio.eliminarServicio(idServicio);
        return new String("redirect:/servicios/");
    }
}
