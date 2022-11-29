package com.example.courseapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    private final String PATH = "/";
    
    @RequestMapping(PATH)
    public String respond() {
        return "Hi!";
    }
}
