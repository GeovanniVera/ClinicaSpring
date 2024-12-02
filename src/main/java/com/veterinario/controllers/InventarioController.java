package com.veterinario.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.veterinario.entity.Insumo;
import com.veterinario.entity.Inventario;
import com.veterinario.services.InInsumosServices;
import com.veterinario.services.InInventariosServices;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
@RequestMapping("/inventarios")
public class InventarioController {
    @Autowired
    InInventariosServices serviceInventario;

    @Autowired
    InInsumosServices servicesInsumo;

    @GetMapping("/")
    public String listaInventario(Model model){
        List<Inventario> inventarios = serviceInventario.obtenerInventarios();
        model.addAttribute("inventarios", inventarios);
        return new String("inventario/lista-inventario");
    }

    @GetMapping("/agregar")
    public String agregarInventario(Inventario inventario,Model model){
        List<Insumo> insumos = servicesInsumo.obtenerInsumos();
        model.addAttribute("insumos", insumos);
        return new String("inventario/form-inventario");
    }
    @GetMapping("/actualizar")
    public String actualizar(@RequestParam Integer id, Model model) {
        List<Insumo> insumos = servicesInsumo.obtenerInsumos();
        model.addAttribute("insumos", insumos);
        Inventario inventario = serviceInventario.buscarPorId(id);
        model.addAttribute("inventario", inventario);
        return new String("inventario/form-inventario");
    }
    
    @PostMapping("/guardar")
    public String guardar(Inventario inventario) {
        serviceInventario.guardarInventario(inventario);
        return "redirect:/inventarios/";
    }
    
    @GetMapping("/eliminar")
    public String eliminar(@RequestParam Integer id) {
        serviceInventario.eliminarInventario(id);
        return new String("redirect:/inventarios/");
    }
    
}
