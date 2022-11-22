package com.example.first.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvalidController implements ErrorController {
    
    private static final String PATH = "/error";

    public String getErrorPath() {
        return PATH;
    }

    @RequestMapping(PATH)
    public String error() {
        return "Gand maraiyye.";
    }
}
