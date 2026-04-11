package com.hospitalProject.hospital.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalProject.hospital.Entity.Patient;
import com.hospitalProject.hospital.Repository.PatientRepo;

@Service
public class PatientServices {

	
	

	    @Autowired
	    private PatientRepo repo;

	    public List<Patient> getAllPatients() {
	        return repo.findAll();
	    }

	    public Patient savePatient(Patient p) {
	        return repo.save(p);
	    }
	}