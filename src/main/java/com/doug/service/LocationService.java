package com.doug.service;

import com.doug.model.HomeLocation;
import com.doug.model.Location;

public interface LocationService {

    Iterable<Location> getAllLocations();
    Iterable<HomeLocation> getAllHomeLocations();
}
