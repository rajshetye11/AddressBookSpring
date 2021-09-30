package com.example.addressbook.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressBookController {
	
	@GetMapping("/get")
	public String getAdd() {
		return "Adding contacts";
	}
	
	@GetMapping("/getId")
	public String getAddById(@RequestParam(value = "id")int id) {
		return "Displaying specific id contact";
	}
	
	@PutMapping("/put/{id}")
	public String putAdd(@PathVariable int id) {
		return "Contact Updated";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteAdd(@PathVariable int id) {
		return "Contact Deleted";
	}
	
}
