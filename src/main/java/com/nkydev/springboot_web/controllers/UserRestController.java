package com.nkydev.springboot_web.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nkydev.springboot_web.models.User;
import com.nkydev.springboot_web.models.dto.UserDTO;
import org.springframework.web.bind.annotation.RequestParam;
;

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

    @GetMapping("/list")
    public List<User> list(){
        User user = new User("Nicole", "Cayo");
        User user2 = new User("Nicole", "Cayo");
        User user3 = new User("Nicole", "Cayo");

        List<User> users = Arrays.asList(user, user2, user3);

        return users;
    }
}