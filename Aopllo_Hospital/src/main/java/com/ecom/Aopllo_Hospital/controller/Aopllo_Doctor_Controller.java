package com.ecom.Aopllo_Hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.Aopllo_Hospital.entity.Aopllo_Doctor;
import com.ecom.Aopllo_Hospital.repository.Doctor_Repo;

@RestController
public class Aopllo_Doctor_Controller {

	@Autowired
	private Doctor_Repo repo;

	@PostMapping("/add-doctor")
	public String add(@RequestBody Aopllo_Doctor DR) {
		repo.save(DR);
		return DR.getD_name() + " Added DR SuccessFully ✅";
	}

	@GetMapping("/get-doctor")
	public List<Aopllo_Doctor> get() {
		return repo.findAll();
	}

	@DeleteMapping("/delete-doctor/{d_id}")
	public String delete(@PathVariable(value = "d_id") int d_id) {
		repo.deleteById(d_id);
		return "Deleted Id ⚠️";
	}

}
