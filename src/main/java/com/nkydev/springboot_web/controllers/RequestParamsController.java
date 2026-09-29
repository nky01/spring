package com.nkydev.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nkydev.springboot_web.models.dto.ParamDto;
import com.nkydev.springboot_web.models.dto.ParamMixDto;

import org.springframework.web.bind.annotation.GetMapping;


@RestController 
@RequestMapping ("/api/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "Hola! Mensaje predeterminado", name = "mensaje") String message){

        ParamDto param = new ParamDto();
        param.setMessage(message);

        return param;
    }

    @GetMapping("/bar")
    public ParamMixDto bar(@RequestParam String text, @RequestParam Integer code){

        ParamMixDto params = new ParamMixDto();
        params.setMessage(text);
        params.setCode(code);

        return params;
    }
}