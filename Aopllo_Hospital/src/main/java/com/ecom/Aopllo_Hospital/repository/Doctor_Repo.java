package com.ecom.Aopllo_Hospital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ecom.Aopllo_Hospital.entity.Aopllo_Doctor;

@Repository
public interface Doctor_Repo extends JpaRepository<Aopllo_Doctor, Integer> {

	
	@Query(value ="select * from aopllo_doctor where d_name = :d_name;" , nativeQuery=true)
	List<Aopllo_Doctor> getByName(@Param (value="d_name") String d_name);
	
	
}
