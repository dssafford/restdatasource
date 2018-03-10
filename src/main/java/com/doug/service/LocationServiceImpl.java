package com.doug.service;

import com.doug.model.Location;
import com.doug.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    LocationRepository locationRepository;

    @Override
    public Iterable<Location> getAllLocations() {


        return locationRepository.findAll();
    }


}
