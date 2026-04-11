package com.hospitalProject.hospital.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalProject.hospital.Entity.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Integer> {

}
