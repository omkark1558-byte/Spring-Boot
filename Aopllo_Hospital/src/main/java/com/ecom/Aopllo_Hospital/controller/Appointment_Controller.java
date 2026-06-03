package com.ecom.Aopllo_Hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.Aopllo_Hospital.Dto.Appointment_DTO;
import com.ecom.Aopllo_Hospital.Dto.Status_DTO;
import com.ecom.Aopllo_Hospital.repository.Appointment_Repo;
import com.ecom.Aopllo_Hospital.servies.Appointment_Service;

@RestController
public class Appointment_Controller {

	@Autowired
	private Appointment_Service service;

	@Autowired
	private Appointment_Repo appointmentRepo;

	@PostMapping("/book-appointment")
	public ResponseEntity<?> book(@RequestBody Appointment_DTO dto) {

		System.out.println("Controller Hit");

		System.out.println(dto.getDoctorId());
		System.out.println(dto.getPatientId());
		System.out.println(dto.getAppointmentDate());

		return ResponseEntity.ok(service.bookAppointment(dto));
	}

	@GetMapping("/get-appointment")
	public ResponseEntity<?> getAll() {

		return ResponseEntity.ok(service.getAll());
	}

	@DeleteMapping("/cancel-appointment/{id}")
	public ResponseEntity<?> cancel(@PathVariable int id) {

		appointmentRepo.deleteById(id);

		return ResponseEntity.ok("Appointment Cancelled");
	}

	@PutMapping("/appointment-status/{id}")
	public ResponseEntity<?> updateStatus(@PathVariable int id, @RequestBody Status_DTO dto) {
		return ResponseEntity.ok(service.updateStatus(id, dto.getStatus()));
	}

}