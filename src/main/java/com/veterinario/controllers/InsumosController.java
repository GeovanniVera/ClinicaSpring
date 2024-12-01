package com.veterinario.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.veterinario.entity.Insumo;
import com.veterinario.services.InInsumosServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/insumos")
public class InsumosController {

    @Autowired
    InInsumosServices serviceInsumo;

    @GetMapping("/")
    public String listaInsumos(Model model){
        List<Insumo> lista = serviceInsumo.obtenerInsumos();
        for(Insumo insumo : lista){
            System.out.println(insumo);
        }
        model.addAttribute("insumos", lista);
        return new String("insumos/lista-insumos");
    }
    
    @GetMapping("/agregar")
    public String agregarInsumo(Insumo insumo) {
        return new String("insumos/form-insumo");
    }

    @PostMapping("/guardar")
    public String guardar(Insumo insumo) {
        serviceInsumo.guardarInsumo(insumo);
        return new String("redirect:/insumos/");
    }

    @GetMapping("/eliminar")
    public String eliminar(@RequestParam ("id") int idInsumo) {
        serviceInsumo.eliminarInsumo(idInsumo);
        return new String("redirect:/insumos/");
    }

    @GetMapping("/actualizar")
    public String actualizar(@RequestParam ("id") int idInsumo, Model model) {
        Insumo insumo = serviceInsumo.buscarInsumo(idInsumo);
        model.addAttribute("insumo", insumo);
        return new String("insumos/form-insumo");
    }

}
