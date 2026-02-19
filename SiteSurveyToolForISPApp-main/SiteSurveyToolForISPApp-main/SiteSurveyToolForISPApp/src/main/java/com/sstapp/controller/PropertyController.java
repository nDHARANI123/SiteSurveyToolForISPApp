package com.sstapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sstapp.entity.Property;
import com.sstapp.repository.PropertyRepository;

@RestController
@RequestMapping("/api/property")
public class PropertyController {

	@Autowired
	private PropertyRepository propertyRepo;

	@PostMapping
	public Property save(@RequestBody Property p) {
		return propertyRepo.save(p);
	} // Closed Method

	@GetMapping
	public List<Property> getAll() {
		return propertyRepo.findAll();
	}

}
