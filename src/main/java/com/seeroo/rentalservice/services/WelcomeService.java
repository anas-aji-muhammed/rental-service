package com.seeroo.rentalservice.services;

import com.seeroo.rentalservice.dto.UserDetailsDTO;

public interface WelcomeService {
    String getWelcomeMessageBasedOnCountry(UserDetailsDTO userDetailsDTO);
}
