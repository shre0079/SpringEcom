package com.shre.SpringEcom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{

    @GetMapping("/hello")
    public String greeting(){
        return "Hello, Welcome to Spring Ecom";
    }
}
