package com.nkydev.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nkydev.springboot_web.models.User;;

@Controller 
public class UserController {

    @GetMapping("/details")  
    public String details(Model model){

        User user = new User("Nicole", "Cayo");

        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("user", user);
        return "details";
    }
}