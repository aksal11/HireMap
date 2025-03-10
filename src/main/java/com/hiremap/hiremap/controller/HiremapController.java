package com.hiremap.hiremap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.hiremap.hiremap.services.HiremapServices;

@RestController
public class HiremapController {
	
	@Autowired
	HiremapServices services;

}
