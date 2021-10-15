package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    @RequestMapping("/say")
    public String say(){
        return "Helloword Spring Boot！这是一个用Spring Boot开发的网站。";
    }
}