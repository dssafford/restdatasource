package com.doug.controller;

import com.doug.model.HomeLocation;
import com.doug.model.Location;
import com.doug.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


/**
 * Created by Doug on 1/22/17.
 */



@RestController
public class LocationController {


	@Autowired
    LocationService locationService;

	private Integer locationIndex;

	@RequestMapping("/dude")
	public String getDude() {

		return "dude";
	}


	@RequestMapping("/api/location")
	public @ResponseBody
	String locations() {
		return "Hello Fucker";
	}

	@RequestMapping("/api/greeting1")
	public @ResponseBody
	String greeting1() {
		return "Hello Fucker";
	}


	@RequestMapping("/doug")
	public String getDoug() {
		return "index";
	}



	@CrossOrigin
    @RequestMapping(value = "/api/locationList", method = RequestMethod.GET)
    public Iterable list(Model model) {


        Iterable<Location> myLocations = locationService.getAllLocations();

        model.addAttribute("locations", myLocations);

        return myLocations;
    }

	@CrossOrigin
	@RequestMapping(value = "/api/homeLocationList", method = RequestMethod.GET)
	public Iterable homeLocationList(Model model) {


		Iterable<HomeLocation> homeLocations = locationService.getAllHomeLocations();


		return homeLocations;
	}


}
