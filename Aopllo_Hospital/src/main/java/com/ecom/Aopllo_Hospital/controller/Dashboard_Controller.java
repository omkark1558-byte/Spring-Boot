package com.ecom.Aopllo_Hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.Aopllo_Hospital.servies.Dashboard_Service;

@RestController
public class Dashboard_Controller {

	@Autowired
	private Dashboard_Service service;

	@GetMapping("/dashboard")
	public ResponseEntity<?> getDashboard() {

		return ResponseEntity.ok(service.getDashboardData());
	}
}
