package com.location.locationapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.location.locationapp.entities.Location;
import com.location.locationapp.repositories.LocationRepository;

@Controller
public class LocationController {

		@Autowired
	  private LocationRepository locationRepo;
		
		@RequestMapping("/show")
		public String showPage() {
			
			return "location";
			
		}
		
		//This method is used to create Location
		@RequestMapping("/createLocation")
		public String createLocation(@ModelAttribute Location location) {
			
			locationRepo.save(location);
			return "location";
			
		}
		
		//This method is used to display all locations
		@RequestMapping("/display")
		public String displayLocation(ModelMap modelMap) {
			List<Location> location = locationRepo.findAll();
			modelMap.addAttribute("locations", location);
			return "displayLocation";
			
		}
		
		//This method is used to delete location by id
		@RequestMapping("/deleteById")
		public String deleteLocation(@RequestParam("id") int id,ModelMap modelMap) {
			locationRepo.deleteById(id);
			
			List<Location> location = locationRepo.findAll();
			modelMap.addAttribute("locations", location);
			return "displayLocation";
			
		}
		
		@RequestMapping("/editById")
		public String editLocation(@RequestParam("id") int id,ModelMap modelMap) {
			Optional<Location> findById = locationRepo.findById(id);
			Location location = findById.get();
			modelMap.addAttribute("location", location);
			return "editLocation";
			
		}
		
		
}
