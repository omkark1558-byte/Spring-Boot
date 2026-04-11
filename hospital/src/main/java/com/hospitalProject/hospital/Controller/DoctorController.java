package com.hospitalProject.hospital.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalProject.hospital.Entity.Doctor;
import com.hospitalProject.hospital.Services.DoctorService;




@RestController
@RequestMapping("/doctors")
@CrossOrigin
public class DoctorController {

	@Autowired
	private DoctorService service;

	@GetMapping
	public List<Doctor> getAll() {
		return service.getAll();
	}

	@PostMapping
	public Doctor add(@RequestBody Doctor d) {
		return service.save(d);
	}
}