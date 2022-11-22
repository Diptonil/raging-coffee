package com.example.first.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    private static final String PATH = "/";
    
    @RequestMapping(PATH)
    public String respond() {
        return "Hi!";
    }
}
