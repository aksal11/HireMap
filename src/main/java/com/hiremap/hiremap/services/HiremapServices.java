package com.hiremap.hiremap.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiremap.hiremap.repository.HiremapRepository;

@Service
public class HiremapServices {
	
	@Autowired
	HiremapRepository repository;

}
