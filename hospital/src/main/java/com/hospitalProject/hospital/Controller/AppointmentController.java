package com.hospitalProject.hospital.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalProject.hospital.Entity.Appointment;
import com.hospitalProject.hospital.Services.AppointmentService;

@RestController
@RequestMapping("/appointments")
@CrossOrigin
public class AppointmentController {

	@Autowired
	private AppointmentService service;

	@PostMapping
	public Appointment add(@RequestBody Appointment a) {
		return service.save(a);
	}

	@GetMapping
	public List<Appointment> getAll() {
		return service.getAll();
	}
}
