package com.ecom.Aopllo_Hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.Aopllo_Hospital.Dto.DoctorRequestDTO;
import com.ecom.Aopllo_Hospital.Dto.Doctor_Dto;
import com.ecom.Aopllo_Hospital.Exception.ResourceNotFoundException;
import com.ecom.Aopllo_Hospital.entity.Aopllo_Doctor;
import com.ecom.Aopllo_Hospital.repository.Doctor_Repo;
import com.ecom.Aopllo_Hospital.servies.Aopllo_Doctor_Service;

import jakarta.validation.Valid;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class Aopllo_Doctor_Controller {

	@Autowired
	private Doctor_Repo repo;

	@Autowired
	private Aopllo_Doctor_Service Ser;

	@PostMapping("/add-doctor")
	public ResponseEntity<?> add(@Valid @RequestBody List<DoctorRequestDTO> DR) {
		
		List<Aopllo_Doctor> list = DR.stream()
				.map((dto)->{
					Aopllo_Doctor d = new Aopllo_Doctor();
					d.setD_name(dto.getD_name());
					d.setD_email(dto.getD_email());
					d.setD_speciality(dto.getD_speciality());
					return d;
				}).toList();

		repo.saveAll(list);
		return ResponseEntity.ok(DR.size() + "Doctor Added SuccessFully ✅");
	}

	@GetMapping("/get-doctor")
	public ResponseEntity<List<Doctor_Dto>> get() {
		return ResponseEntity.ok(Ser.getAllDoctor());
	}

	@DeleteMapping("/delete-doctor/{d_id}")
	public ResponseEntity<?> delete(@PathVariable(value = "d_id") int d_id) {

		if (!repo.existsById(d_id)) {
			throw new ResourceNotFoundException("Patient Not Found ❌");
		}

		repo.deleteById(d_id);
		return ResponseEntity.ok("Deleted Id ⚠️");
	}

	@GetMapping("/get-name/{d_name}")
	public ResponseEntity<List<Aopllo_Doctor>> getByname(@PathVariable(value = "d_name") String d_name) {
		return ResponseEntity.ok(Ser.getByname(d_name));
	}
}
