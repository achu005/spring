package com.example.demo.repository.Superadmin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Superadmin.Industry;

@Repository
public interface IndustryRepository extends JpaRepository<Industry,Long>{

}
