package com.veterinario.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.veterinario.entity.Cliente;
import com.veterinario.services.InClienteServices;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/clientes")
public class ClientesController {
    @Autowired
    InClienteServices serviceCliente;
    
    @GetMapping("/")
    public String listaClientes(Model model){
        List<Cliente> lista = serviceCliente.obtenerClientes();
        for (Cliente cliente : lista) {
            System.out.println(cliente);
        }
        model.addAttribute("clientes", lista);
        return new String("clientes/lista-cliente");
    } 
    @GetMapping("/agregar")
    public String agregar(){
        return new String("clientes/form-cliente");
    }

    @PostMapping("/guardar")
    public String postMethodName(Cliente cliente) {
        serviceCliente.guardarCliente(cliente);
        return new String("redirect:/clientes/");
    }

    @GetMapping("/eliminar")
    public String getMethodName(@RequestParam ("id") int idCliente) {
        serviceCliente.eliminarCliente(idCliente);
        return new String("redirect:/clientes/");
    }
    
    @GetMapping("/actualizar")
    public String actualizar(@RequestParam("id") int idCliente, Model model) {
        Cliente cliente = serviceCliente.buscarPorId(idCliente);
        model.addAttribute("cliente", cliente);
        return new String("clientes/form-update-cliente");
    }
    
    
}
