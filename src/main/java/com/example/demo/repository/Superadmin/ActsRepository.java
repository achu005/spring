package com.example.demo.repository.Superadmin;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Superadmin.Activities;
import com.example.demo.model.Superadmin.Acts;

@Repository
public interface ActsRepository extends JpaRepository<Acts,Long> {

//	@Query("SELECT a.actList FROM Acts a WHERE a.act_id =:id")
//	List<ActsStates> findByActId(@Param("id") Long actId);
	
//	@Query("SELECT a.activityList FROM ActsStates  a WHERE a.act_state_id =:id")
//	List<Activities> findByActId(@Param("id") Long actId);
	
	@Query("SELECT g.activityList FROM ActsStates g where g.acts.act_id = :id")
	List<Activities> findByActId(@Param("id") Long actId);


	
}
