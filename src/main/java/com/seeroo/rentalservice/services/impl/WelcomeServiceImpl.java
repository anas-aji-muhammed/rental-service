package com.seeroo.rentalservice.services.impl;

import com.seeroo.rentalservice.dto.UserDetailsDTO;
import com.seeroo.rentalservice.services.WelcomeService;
import org.springframework.stereotype.Service;

@Service
public class WelcomeServiceImpl implements WelcomeService {
    static String cIndia = "India";
    static String myCompany = "Seeroo";

    @Override
    public String getWelcomeMessageBasedOnCountry(UserDetailsDTO userDetailsDTO) {
        String welcomeMessage = "";
        if (userDetailsDTO.getLocation().equals(cIndia)) {
            welcomeMessage = "Namaste!!! " + userDetailsDTO.getName() + " Welcome to java. ";
            if (userDetailsDTO.getCompany().equals(myCompany)) {
                welcomeMessage = welcomeMessage + myCompany + " is Awesome.";
            }
        } else {
            welcomeMessage = "Hello!!! " + userDetailsDTO.getName() + " Welcome to java.";
        }
        return welcomeMessage;
    }
}
