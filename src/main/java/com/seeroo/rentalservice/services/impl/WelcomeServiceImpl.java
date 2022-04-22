package com.seeroo.rentalservice.services.impl;

import com.seeroo.rentalservice.dto.UserDetailsDTO;
import com.seeroo.rentalservice.services.WelcomeService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class WelcomeServiceImpl implements WelcomeService {
    static String cIndia = "India";
    static String myCompany = "Seeroo";
    private static final List<String> countries = new ArrayList<String>();

    public WelcomeServiceImpl() {
        getCountries();
    }

    @Override
    public String getWelcomeMessageBasedOnCountry(UserDetailsDTO userDetailsDTO) {

        String welcomeMessage = "";
        if (countries.contains(userDetailsDTO.getLocation())) {
            welcomeMessage = "Namaste!!! " + userDetailsDTO.getName() + " Welcome to java. ";
            if (myCompany.equals(userDetailsDTO.getCompany())) {
                welcomeMessage = welcomeMessage + myCompany + " is Awesome.";
            }
        } else {
            welcomeMessage =
                    "Hello!!! "
                            + userDetailsDTO.getName()
                            + " Welcome to java. We don't have your location "
                            + userDetailsDTO.getLocation()
                            + " in our records.";
        }
        return welcomeMessage;
    }

    private void getCountries() {
        countries.add("India");
        countries.add("Turkey");
        countries.add("China");
    }
}
