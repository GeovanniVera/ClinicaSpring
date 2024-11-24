package com.veterinario.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.veterinario.services.InUsuariosServices;

@Controller
public class LoginController {

    @Autowired
    private InUsuariosServices userService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
