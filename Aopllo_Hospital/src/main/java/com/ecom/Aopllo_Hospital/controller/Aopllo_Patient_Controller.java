package com.ecom.Aopllo_Hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.Aopllo_Hospital.Dto.PatientRequestDTO;
import com.ecom.Aopllo_Hospital.Exception.ResourceNotFoundException;
import com.ecom.Aopllo_Hospital.entity.Aopllo_Doctor;
import com.ecom.Aopllo_Hospital.entity.Aopllo_Patient;
import com.ecom.Aopllo_Hospital.repository.Doctor_Repo;
import com.ecom.Aopllo_Hospital.repository.Patient_Repo;
import com.ecom.Aopllo_Hospital.servies.Aopllo_Patient_Service;

@RestController
public class Aopllo_Patient_Controller {

	@Autowired
	private Patient_Repo prepo;

	@Autowired
	private Doctor_Repo repo;

	@Autowired
	private Aopllo_Patient_Service ser;

	@PostMapping("/add-patient")
	public ResponseEntity<?> add(@RequestBody List<PatientRequestDTO> list) {

		List<Aopllo_Patient> patients = list.stream().map((dto) -> {

			Aopllo_Patient p = new Aopllo_Patient();
			p.setP_name(dto.getP_name());
			p.setP_email(dto.getP_email());
			p.setP_gender(dto.getP_gender());
			p.setP_mobileno(dto.getP_mobileno());
			p.setP_age(dto.getP_age());

			Aopllo_Doctor doctor = repo.findById(dto.getDoctorId())
					.orElseThrow(() -> new ResourceNotFoundException("Doctor Not Found"));
			p.setDr(doctor);
			return p;
		}).toList();
		prepo.saveAll(patients);
		return ResponseEntity.ok(patients.size() + " Patient Added SuccessFully ✅");
	}

	@GetMapping("/get-patient")
	public ResponseEntity<List<Aopllo_Patient>> get() {
		return ResponseEntity.ok(ser.getAllPatient());
	}

	@DeleteMapping("/delete-patient/{p_id}")
	public ResponseEntity<?> delete(@PathVariable(value = "p_id") int p_id) {

		if (!prepo.existsById(p_id)) {
			return ResponseEntity.status(404).body("Patient Not Found ❌");
		}

		prepo.deleteById(p_id);
		return ResponseEntity.ok("Deleted Patient ⚠️");
	}

	@GetMapping("/get-patient/{p_name}")
	public ResponseEntity<List<Aopllo_Patient>> getByname(@PathVariable String p_name) {
		return ResponseEntity.ok(ser.getByname(p_name));
	}
}
