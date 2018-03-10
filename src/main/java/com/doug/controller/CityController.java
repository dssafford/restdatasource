package com.doug.controller;

import com.doug.model.City;
import com.doug.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    @Autowired
    CityService cityService;

    @CrossOrigin
    @RequestMapping(value = "/api/CityList", method = RequestMethod.GET)
    public Iterable list(Model model) {


        Iterable<City> myCities= cityService.getAllCities();

        model.addAttribute("cities", myCities);

        return myCities;
    }
}
