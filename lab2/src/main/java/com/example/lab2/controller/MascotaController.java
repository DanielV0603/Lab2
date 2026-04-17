package com.example.lab2.controller;

import com.example.lab2.repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MascotaController {
    @Autowired
    private MascotaRepository mascotaRepository;

    @GetMapping({"", "/"})
    public String listEmployees(Model model) {
        model.addAttribute("mascota", mascotaRepository.findAll());
        return "listado_mascotas";
    }

}
