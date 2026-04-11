package com.ecom.Aopllo_Hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.Aopllo_Hospital.entity.Aopllo_Patient;
import com.ecom.Aopllo_Hospital.repository.Patient_Repo;
import com.ecom.Aopllo_Hospital.servies.Aopllo_Patient_Service;

@RestController
public class Aopllo_Patient_Controller {

	@Autowired
	private Patient_Repo prepo;
	
	@Autowired
	private Aopllo_Patient_Service ser;

	@PostMapping("/add-patient")
	public String add(@RequestBody List<Aopllo_Patient> ap) {
		prepo.saveAll(ap);
		return ap.size() + " Patient Added SuccessFully ✅";
	}

	@GetMapping("/get-patient")
	public List<Aopllo_Patient> get() {
		return prepo.findAll();
	}

	@DeleteMapping("/delete-patient/{p_id}")
	public String delete(@PathVariable(value = "p_id") int p_id) {
		prepo.deleteById(p_id);
		return "Deleted Patient ⚠️";
	}
	
	
	
	@GetMapping("/get-patient/{p_name}")
	public List<Aopllo_Patient> getByname(@PathVariable String p_name)
	{
		return ser.getByname(p_name);
	}
}
