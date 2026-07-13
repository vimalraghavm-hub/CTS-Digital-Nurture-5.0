package com.cognizant.spring_learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.service.CountryService;

@RestController
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping("/country")
    public Country getCountryIndia() {
        return SpringLearnApplication.getCountry();
    }

    @GetMapping("/country/{code}")
    public Country getCountry(@PathVariable String code) {
        return countryService.getCountry(code);
    }
}