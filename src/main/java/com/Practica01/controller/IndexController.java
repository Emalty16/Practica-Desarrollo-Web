/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Practica01.controller;

import com.Practica01.dao.PaisDao;
import com.Practica01.domain.Pais;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller

public class IndexController {
    
    @Autowired
    private PaisDao paisDao;
    
    @RequestMapping("/")
    public String inicio(Model model){        
        log.info("Ahora se usa arquitectura MVC");
        
        Pais pais = new Pais("Argentina", " Buenos Aires", "Democracia", "Alberto Fernandez", 45000000);

        var paises = paisDao.findAll();
        
        model.addAttribute("Pais", pais);
        
        
        model.addAttribute("Pais",paises);
        
        return "index";
    }
}
