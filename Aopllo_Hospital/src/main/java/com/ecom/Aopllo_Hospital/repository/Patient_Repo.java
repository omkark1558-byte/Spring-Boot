package com.ecom.Aopllo_Hospital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ecom.Aopllo_Hospital.entity.Aopllo_Patient;

@Repository
public interface Patient_Repo extends JpaRepository<Aopllo_Patient, Integer> {

	
	@Query(value = "select * from aopllo_patient where p_name = :p_name;" , nativeQuery=true)
	List<Aopllo_Patient> getByname(@Param (value="p_name") String p_name);
	
}
