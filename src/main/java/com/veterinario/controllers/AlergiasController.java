package com.veterinario.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.veterinario.services.InAlergiaService;
import com.veterinario.entity.Alergia;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
@RequestMapping("/alergias")
public class AlergiasController {
    @Autowired
    private InAlergiaService serviceAlergia;
    @GetMapping("/")
    public String listaAlergias(Model model){
        //obtenemos las alergias desde la base de datos
        List <Alergia> lista = serviceAlergia.obtenerAlergias();
        //recorremos el arreglo para verificar que funcinen las alergias
        for (Alergia alergia : lista) {
            System.out.println(alergia);
        }
        //agregamos la lista 
        model.addAttribute("alergias", lista);
        return "alergias/lista-alergias";
    }

    @GetMapping("/agregar")
    public String agregarAlergia(Alergia alergia){
        return "alergias/form-alergia";
    }

    @PostMapping("/guardar")
    public String guardarAlergia(Alergia alergia) {
        System.out.println(alergia);
        serviceAlergia.guardarAlergia(alergia);
        return new String("redirect:/alergias/");
    }

    @GetMapping("/actualizar")
    public String actualizarAlergia(@RequestParam("id") int idAlergia, Model model) {
        Alergia alergia = serviceAlergia.buscarPorId(idAlergia);
        model.addAttribute("alergia", alergia);
        return new String("alergias/form-alergia");
    }
    

    @GetMapping("/eliminar")
    public String getMethodName(@RequestParam("id") int idAlergia) {
        serviceAlergia.eliminarAlergia(idAlergia);
        return new String("redirect:/alergias/");
    }
    
    
}

