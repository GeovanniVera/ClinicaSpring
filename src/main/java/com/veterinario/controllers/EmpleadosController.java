package com.veterinario.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.veterinario.entity.Empleado;
import com.veterinario.services.InEmpleadosServices;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
@RequestMapping("/empleados")
public class EmpleadosController {
    @Autowired
    InEmpleadosServices serviceEmpleado;
    @GetMapping("/")
    public String listaEmpleado(Model model){
        List<Empleado> lista = serviceEmpleado.obtenerEmpleados();
        model.addAttribute("empleados", lista);
        return "empleados/lista-empleado";
    };
    
    @GetMapping("/agregar")
    public String agregarEmpleado(){
        return "empleados/form-empleado";
    };

    @GetMapping("/eliminar")
    public String eliminar(@RequestParam("id") int idEmpleado) {
        serviceEmpleado.eliminarEmpleado(idEmpleado);
        return new String("redirect:/empleados/");
    }
    
    @PostMapping("/guardar")
    public String guardar(Empleado empleado) {
        serviceEmpleado.guardarEmpleado(empleado);
        return new String("redirect:/empleados/");
    }
    
    @GetMapping("/actualizar")
    public String actualizar(@RequestParam("id") int idEmpleado, Model model) {
        Empleado empleado = serviceEmpleado.buscarPorId(idEmpleado);
        model.addAttribute("empleado", empleado);
        return new String("empleados/form-update-empleado");
    }
    
}
