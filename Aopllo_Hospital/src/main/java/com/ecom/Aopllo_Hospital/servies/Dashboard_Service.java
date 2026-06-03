package com.ecom.Aopllo_Hospital.servies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.Aopllo_Hospital.Dto.Dashboard_DTO;
import com.ecom.Aopllo_Hospital.repository.Appointment_Repo;
import com.ecom.Aopllo_Hospital.repository.Doctor_Repo;
import com.ecom.Aopllo_Hospital.repository.Patient_Repo;

@Service
public class Dashboard_Service {

	@Autowired
	private Doctor_Repo doctorRepo;

	@Autowired
	private Patient_Repo patientRepo;

	@Autowired
	private Appointment_Repo appointmentRepo;

	public Dashboard_DTO getDashboardData() {

		Dashboard_DTO dto = new Dashboard_DTO();

		dto.setTotalDoctors(doctorRepo.count());
		dto.setTotalPatients(patientRepo.count());
		dto.setTotalAppointments(appointmentRepo.count());

		return dto;
	}
}
