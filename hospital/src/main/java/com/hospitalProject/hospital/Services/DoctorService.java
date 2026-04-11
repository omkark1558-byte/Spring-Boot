package com.hospitalProject.hospital.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalProject.hospital.Entity.Doctor;
import com.hospitalProject.hospital.Repository.DoctorRepo;

@Service
public class DoctorService {

	@Autowired
	private DoctorRepo repo;

	public List<Doctor> getAll() {
		return repo.findAll();
	}

	public Doctor save(Doctor d) {
		return repo.save(d);
	}
}
