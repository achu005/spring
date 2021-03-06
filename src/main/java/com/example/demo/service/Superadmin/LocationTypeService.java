package com.example.demo.service.Superadmin;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Superadmin.LocationType;
import com.example.demo.repository.Superadmin.LocationTypeRepository;

@Service
public class LocationTypeService {
	
	@Autowired
	LocationTypeRepository repo;
	
	public LocationType get(Long id) {
		return repo.findById(id).get();
	}
	
	@Transactional
	public void save(LocationType area) {
		
		repo.save(area);
	}
}

