package com.veterinario.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.veterinario.entity.Cliente;
import com.veterinario.entity.Mascota;
import com.veterinario.services.InClienteServices;
import com.veterinario.services.InMascotasServices;

import org.springframework.web.bind.annotation.PostMapping;



@Controller
@RequestMapping("/mascotas")
public class MascotasController {
    @Autowired
    private InMascotasServices servicesMascotas;

    @Autowired
    private InClienteServices servicesCliente;

    @GetMapping("/")
    public String listaMascota(Model model){
        List<Mascota> lista = servicesMascotas.obtenerMascota();
        for (Mascota mascota : lista) {
            System.out.println(mascota);
        }
        model.addAttribute("mascotas", lista);
        return new String("mascotas/lista-mascota");
    }

    @GetMapping("/agregar")
    public String agregarMascota(Mascota mascota, Model model){
        List<Cliente> clientes = servicesCliente.obtenerClientes();
        model.addAttribute("clientes", clientes);
        return new String("mascotas/form-mascota");
    }

    @GetMapping("/eliminar")
    public String eliminar(@RequestParam("id") int idMascota) {
        servicesMascotas.eliminarMascota(idMascota);
        return new String("redirect:/mascotas/");
    }

    @GetMapping("/actualizar")
    public String actualizar(@RequestParam("id") int idMascota, Model model) {
        Mascota mascota = servicesMascotas.buscarPorId(idMascota);
        System.out.println(mascota.getFechaDeNacimiento());
        List<Cliente> clientes = servicesCliente.obtenerClientes();
        model.addAttribute("clientes", clientes);
        model.addAttribute("mascota", mascota);
        return new String("mascotas/form-mascota");
    }
    
    @PostMapping("/guardar")
    public String postMethodName(Mascota mascota) {
        servicesMascotas.guardarMascota(mascota);
        System.out.println(mascota);
        return new String("redirect:/mascotas/");
    }
    

    
}
