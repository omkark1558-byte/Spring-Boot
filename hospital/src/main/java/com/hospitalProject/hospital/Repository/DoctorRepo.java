package com.hospitalProject.hospital.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalProject.hospital.Entity.Doctor;

@Repository
public interface DoctorRepo extends JpaRepository<Doctor, Integer> {
	
}
