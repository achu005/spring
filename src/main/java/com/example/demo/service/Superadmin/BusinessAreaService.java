package com.example.demo.service.Superadmin;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Superadmin.BusinessArea;
import com.example.demo.repository.Superadmin.BusinessAreaRepository;

@Service
public class BusinessAreaService {

	@Autowired
	private BusinessAreaRepository repo;
	
	public BusinessArea get(Long id) {
		return repo.findById(id).get();
	}
	
	@Transactional
	public void save(BusinessArea area) {
		
		repo.save(area);
	}
}
