package com.seeroo.rentalservice.controller;

import com.seeroo.rentalservice.dto.UserDetailsDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping(value = "/welcomeUser")
    public String getWelcomeUserParam(@RequestParam String name) {
        return "Hii!! Welcome " + name;
    }

    @PostMapping(value = "/userDetails")
    public String getUserDetails(@RequestBody UserDetailsDTO userDetailsDTO) {
        return "Hii!! My name is "
                + userDetailsDTO.getName()
                + ". I am from "
                + userDetailsDTO.getLocation()
                + ". I work at "
                + userDetailsDTO.getCompany();
    }
}
