package com.example.springapp3.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.plab2.Entity.model;
import com.example.plab2.Service.service;

@RestController
@CrossOrigin
public class controller {
	@Autowired(required=true)
	service eser;
	@PostMapping("/add")
	
	public model addDetails(@RequestBody  model e1)
	{
		return eser.saveDetails(e1);
	}
	
	@GetMapping("/showDetails")
	public List<model> fetchDetails()
	{
		return eser.getDetails();
	}
    
}