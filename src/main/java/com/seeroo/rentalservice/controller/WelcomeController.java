package com.seeroo.rentalservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping(value = "/welcome")
    public  String welcomeToTraining(){
        return "Hii Anas!!! Welcome to Java";
    }
}
