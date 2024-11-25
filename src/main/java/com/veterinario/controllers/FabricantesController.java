package com.veterinario.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.veterinario.entity.Fabricante;
import com.veterinario.services.InFabricantesServices;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
@RequestMapping("/fabricantes")
public class FabricantesController {
    @Autowired
     InFabricantesServices serviceFabricante;
    
    @GetMapping("/")
    public String listaFabricante(Model model){
        List <Fabricante> lista=serviceFabricante.obtenerFabricantes();
        model.addAttribute("fabricantes", lista);
        return"fabricantes/lista-fabricantes";
    };

    @GetMapping("/agregar")
    public String agregarFabricante() {
        return "fabricantes/form-fabricantes";
    }

@GetMapping("/eliminar")
    public String eliminar(@RequestParam("id") int idFabricante) {
        serviceFabricante.eliminarFabricante(idFabricante);
        return new String("redirect:/fabricantes/");
    }

    @GetMapping("/actualizar")
    public String actualizar(@RequestParam("id") int idFabricante, Model model) {
        Fabricante fabricante = serviceFabricante.buscarFabricante(idFabricante);
        model.addAttribute("fabricante", fabricante);
        return new String("fabricantes/form-update-fabricante");
    }
}