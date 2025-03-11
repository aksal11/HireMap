package com.hiremap.hiremap.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiremap.hiremap.dto.hiremapdto;
import com.hiremap.hiremap.repository.HiremapRepository;

@Service
public class HiremapServices {
	
	@Autowired
	HiremapRepository repository;
	
//	create applications
	public String createApplication(hiremapdto hiremapdto) {
		repository.save(hiremapdto);
		return "Successfull";
	}
	
//	retrieve all the applications
	public List<hiremapdto> getAllApplications(){
		return repository.findAll();
	}
	

}
