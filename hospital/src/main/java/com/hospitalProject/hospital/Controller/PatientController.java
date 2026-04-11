package com.hospitalProject.hospital.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hospitalProject.hospital.Entity.Patient;
import com.hospitalProject.hospital.Services.PatientServices;

@RestController
@RequestMapping("/patients")
@CrossOrigin
public class PatientController {

	@Autowired
	private PatientServices service;

	@GetMapping
	public List<Patient> getAll() {
		return service.getAllPatients();
	}

	@PostMapping
	public Patient add(@RequestBody Patient p) {
		return service.savePatient(p);
	}
}