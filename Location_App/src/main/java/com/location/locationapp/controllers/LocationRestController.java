package com.location.locationapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.location.locationapp.entities.Location;
import com.location.locationapp.repositories.LocationRepository;

@RestController
@RequestMapping("/location")
public class LocationRestController {

	@Autowired
	private LocationRepository locationRepo;
	
	@PutMapping
	public void createLocation(@RequestBody Location location) {
		
	 locationRepo.save(location);
		
	}
	
	@GetMapping
	public List<Location> displayLocation() {
		
		List<Location> findAllLocation = locationRepo.findAll();
		return findAllLocation;
	}
}
