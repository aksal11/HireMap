package com.hiremap.hiremap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hiremap.hiremap.dto.hiremapdto;
import com.hiremap.hiremap.services.HiremapServices;

@RestController
public class HiremapController {
	
	@Autowired
	HiremapServices services;
	
//	REST API to create 
	@PostMapping("/createApplication")
	public String createApplication(@RequestBody hiremapdto hiremapdto) {
		
		return services.createApplication(hiremapdto);
	}
	
//	REST API to display all the applications
	@GetMapping("/displayAll")
	public List<hiremapdto> DisplayAllApplications() {
		return services.getAllApplications();
	}
	

}
