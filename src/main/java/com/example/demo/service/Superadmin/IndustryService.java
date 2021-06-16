package com.example.demo.service.Superadmin;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Superadmin.Industry;
import com.example.demo.repository.Superadmin.IndustryRepository;


@Service
public class IndustryService {

	@Autowired
	private 
	IndustryRepository repo;
	
	
	public Industry get(Long id) {
		return repo.findById(id).get();
	}
	
	@Transactional
	public void save(Industry area) {
		
		repo.save(area);
	}
}
