package com.sstapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sstapp.entity.Floor;
import com.sstapp.entity.Property;
import com.sstapp.repository.FloorRepository;
import com.sstapp.repository.PropertyRepository;

@RestController
@RequestMapping("/api/floor")
public class FloorController {

	@Autowired
	private FloorRepository floorRepo;

	@Autowired
	private PropertyRepository propertyRepo;

	@PostMapping("/add/{propertyId}")
	public Floor addFloor(@PathVariable int propertyId, @RequestBody Floor floor) {

		Property property = propertyRepo.findById(propertyId).orElseThrow();

		floor.setProperty(property);

		return floorRepo.save(floor);
	}

	@GetMapping("/property/{propertyId}")
	public List<Floor> getFloorsByProperty(@PathVariable int propertyId) {

		Property property = propertyRepo.findById(propertyId).orElseThrow();
		return property.getFloors();
	}

}
