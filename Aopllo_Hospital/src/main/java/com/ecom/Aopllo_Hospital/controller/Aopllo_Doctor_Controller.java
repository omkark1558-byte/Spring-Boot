package com.ecom.Aopllo_Hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.Aopllo_Hospital.Dto.Doctor_Dto;
import com.ecom.Aopllo_Hospital.entity.Aopllo_Doctor;
//import com.ecom.Aopllo_Hospital.entity.Aopllo_Patient;
import com.ecom.Aopllo_Hospital.repository.Doctor_Repo;
import com.ecom.Aopllo_Hospital.servies.Aopllo_Doctor_Service;

@RestController
public class Aopllo_Doctor_Controller {

	@Autowired
	private Doctor_Repo repo;
	
	@Autowired
	private Aopllo_Doctor_Service Ser;

	@PostMapping("/add-doctor")
	public String add(@RequestBody List<Aopllo_Doctor> DR) {
		repo.saveAll(DR);
		return DR.size()+ " Added DR SuccessFully ✅";
	}

	@GetMapping("/get-doctor")
	public List<Doctor_Dto> get() {
		return  Ser.getAllDoctor();
	}

	@DeleteMapping("/delete-doctor/{d_id}")
	public String delete(@PathVariable(value = "d_id") int d_id) {
		repo.deleteById(d_id);
		return "Deleted Id ⚠️";
	}

	@GetMapping("/get-name/{d_name}")
	public List<Aopllo_Doctor> getByname(@PathVariable (value="d_name") String d_name)
	{
		return Ser.getByname(d_name);
	}
}
