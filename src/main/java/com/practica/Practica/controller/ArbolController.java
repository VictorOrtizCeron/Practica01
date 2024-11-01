/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica.Practica.controller;

import com.practica.Practica.service.ArbolService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author victo
 */

@Controller
@Slf4j
@RequestMapping("/arbol")
public class ArbolController {
    
    @Autowired
    private ArbolService arbolService;
    
    @GetMapping("/listado")
    public String inicio(Model model){
    
        var arboles = arbolService.getArboles();
        model.addAttribute("Arboles",arboles);
        model.addAttribute("totalArboles",arboles.size());
        return "/arbol/listado";
    }
    
}
