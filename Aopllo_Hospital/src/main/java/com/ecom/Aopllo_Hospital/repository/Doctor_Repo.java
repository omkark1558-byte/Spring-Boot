package com.ecom.Aopllo_Hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.Aopllo_Hospital.entity.Aopllo_Doctor;

@Repository
public interface Doctor_Repo extends JpaRepository<Aopllo_Doctor, Integer> {
	
}
