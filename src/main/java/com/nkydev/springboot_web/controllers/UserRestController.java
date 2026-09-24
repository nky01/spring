package com.nkydev.springboot_web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nkydev.springboot_web.models.User;
import com.nkydev.springboot_web.models.dto.UserDTO;;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping(path = "/details")
    public UserDTO details(){

        User user = new User("Nicole", "Cayo");

        UserDTO userDTO = new UserDTO();
        userDTO.setUser(user);
        userDTO.setTitle("Hola Mundo Spring Boot");

        return userDTO;
    }
}