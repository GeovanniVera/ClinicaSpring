package com.veterinario.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.veterinario.entity.Empleado;
import com.veterinario.entity.Usuario;
import com.veterinario.services.InEmpleadosServices;
import com.veterinario.services.InUsuariosServices;



import org.springframework.web.bind.annotation.PostMapping;



@Controller
@RequestMapping("/usuarios")
public class UsuariosController {
    @Autowired
    InUsuariosServices servicesUsuarios;

    @Autowired
    InEmpleadosServices servicesEmpleado;
    @GetMapping("/")
    public String listaUsuario(Model model){
        List<Usuario> lista=servicesUsuarios.obtener();
        model.addAttribute("usuarios", lista);
        return new String("usuarios/lista-usuario");
    }
    
    @GetMapping("/agregar")
    public String agregarUsuario(Usuario usuario, Model model){
        
        List<Empleado> empleados = servicesEmpleado.obtenerEmpleados();
        model.addAttribute("empleados", empleados);
        return new String("usuarios/form-usuario");
    }
    @PostMapping("/guardar")
    public String guardar(Usuario usuario) {
        servicesUsuarios.guardar(usuario);
        return new String ("redirect:/usuarios/");

    }
    @GetMapping("/actualizar")
    public String actualizar(@RequestParam("id") Integer id, Model model){
        Usuario usuario = servicesUsuarios.buscarPorId(id);
        model.addAttribute("usuario", usuario);
        List<Empleado> empleados = servicesEmpleado.obtenerEmpleados();
        model.addAttribute("empleados", empleados);
        return new String("usuarios/form-usuario");
    }
    @GetMapping("/eliminar")
    public String eliminar(@RequestParam("id") Integer id) {
        servicesUsuarios.eliminar(id);
        return new String("redirect:/usuarios/");
    }
    
}
