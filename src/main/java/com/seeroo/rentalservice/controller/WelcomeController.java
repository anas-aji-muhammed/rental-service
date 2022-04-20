package com.seeroo.rentalservice.controller;

import com.seeroo.rentalservice.dto.UserDetailsDTO;
import com.seeroo.rentalservice.services.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @Autowired private WelcomeService welcomeService;

    @GetMapping(value = "/welcome")
    public String welcomeToTraining() {
        return "Hii Anas!!! Welcome to Java";
    }

    @PostMapping(value = "/welcomeUserCountry")
    public String getUserDetails(@RequestBody UserDetailsDTO userDetailsDTO) {
        return welcomeService.getWelcomeMessageBasedOnCountry(userDetailsDTO);
    }
}
