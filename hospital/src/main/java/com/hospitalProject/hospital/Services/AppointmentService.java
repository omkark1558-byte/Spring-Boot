package com.hospitalProject.hospital.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalProject.hospital.Entity.Appointment;
import com.hospitalProject.hospital.Repository.AppointmentRepo;

@Service
public class AppointmentService {

	@Autowired
	private AppointmentRepo repo;

	public Appointment save(Appointment a) {
		return repo.save(a);
	}

	public List<Appointment> getAll() {
		return repo.findAll();
	}
}
