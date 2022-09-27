package com.example.phonemanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping("/")
    public String showIndex(){
        return "/index";
    }
}
