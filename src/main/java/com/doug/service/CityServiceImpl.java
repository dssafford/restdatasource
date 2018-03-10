package com.doug.service;

import com.doug.model.City;
import com.doug.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService{

    @Autowired
    CityRepository cityRepository;

    @Override
    public Iterable<City> getAllCities() {


        return cityRepository.findAll();
    }

}
