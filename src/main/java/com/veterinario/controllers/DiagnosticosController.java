package com.veterinario.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.veterinario.entity.Diagnostico;
import com.veterinario.services.InDiagnosticosServices;

@Controller
@RequestMapping("/diagnosticos")
public class DiagnosticosController {

    @Autowired
    private InDiagnosticosServices serviceDiagnostico;

    @GetMapping("/")
    public String listaDiagnosticos(Model model){
        List<Diagnostico> lista = serviceDiagnostico.obtenerDiagnosticos();
        for(Diagnostico diagnostico : lista){
            System.out.println(diagnostico);
        }
        model.addAttribute("diagnosticos", lista);
        return new String("diagnosticos/lista-diagnosticos");
    }

    @GetMapping("/agregar")
    public String agregarDiagnostico(){
        return new String("diagnosticos/form-diagnostico");
    }

    @PostMapping("/guardar")
    public String guardarDiagnostico(Diagnostico diagnostico){
        serviceDiagnostico.guardarDiagnostico(diagnostico);
        return "redirect:/diagnosticos/";
    }

    @GetMapping("/eliminar")
    public String eliminarDiagnostico(@RequestParam("idDiagnostico") int idDiagnostico){
        serviceDiagnostico.eliminarDiagnostico(idDiagnostico);
        return "redirect:/diagnosticos/";
    }

    @GetMapping("/buscar")
    public String buscarDiagnostico(@RequestParam("idDiagnostico") int idDiagnostico, Model model) {
        Diagnostico diagnostico = serviceDiagnostico.buscarPorId(idDiagnostico);
        model.addAttribute("diagnosticos", diagnostico);
        return new String("diagnosticos/form-update-diagnostico");
    }
    

}
