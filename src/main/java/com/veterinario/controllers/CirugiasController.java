package com.veterinario.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.veterinario.entity.Cirugia;
import com.veterinario.services.InCirugiasServices;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
@RequestMapping("/cirugias")
public class CirugiasController {
    @Autowired
    InCirugiasServices serviceCirugia;

    @GetMapping("/")
    public String listaCirugias(Model model){
        List<Cirugia>  lista= serviceCirugia.obtenerCirugias();
        for (Cirugia cirugia : lista) {
            System.out.println(cirugia);
        }
        model.addAttribute("cirugias", lista);
        return "cirugias/lista-cirugias";
    }    

    @GetMapping("/agregar")
    public String agregar(Cirugia cirugia) {
        return new String("cirugias/form-cirugia");
    }
    @GetMapping("/actualizar")
    public String getMethodName(@RequestParam ("id") int idCirugia, Model model) {
        Cirugia cirugia = serviceCirugia.buscarPorId(idCirugia);
        model.addAttribute("cirugia", cirugia);
        return new String("cirugias/form-cirugia");
    }
    
    @GetMapping("/eliminar")
    public String eliminar(@RequestParam("id") int idCirugia) {
        serviceCirugia.eliminarCirugia(idCirugia);
        return new String("redirect:/cirugias/");
    }

    @PostMapping("/guardar")
    public String guardar(Cirugia cirugia) {
        serviceCirugia.guardarCirugia(cirugia);
        return "redirect:/cirugias/";
    }

}