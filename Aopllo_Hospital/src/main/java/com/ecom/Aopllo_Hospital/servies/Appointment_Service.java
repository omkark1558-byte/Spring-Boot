package com.ecom.Aopllo_Hospital.servies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.Aopllo_Hospital.Dto.Appointment_DTO;
import com.ecom.Aopllo_Hospital.Exception.ResourceNotFoundException;
import com.ecom.Aopllo_Hospital.entity.Aopllo_Doctor;
import com.ecom.Aopllo_Hospital.entity.Aopllo_Patient;
import com.ecom.Aopllo_Hospital.entity.Appointment;
import com.ecom.Aopllo_Hospital.repository.Appointment_Repo;
import com.ecom.Aopllo_Hospital.repository.Doctor_Repo;
import com.ecom.Aopllo_Hospital.repository.Patient_Repo;

@Service
public class Appointment_Service {

	@Autowired
	private Appointment_Repo appointmentRepo;

	@Autowired
	private Doctor_Repo doctorRepo;

	@Autowired
	private Patient_Repo patientRepo;

	public String bookAppointment(Appointment_DTO dto) {
		Appointment ap = new Appointment();

		Aopllo_Doctor doctor = doctorRepo.findById(dto.getDoctorId())
				.orElseThrow(() -> new ResourceNotFoundException("Doctor Not Found"));

		Aopllo_Patient patient = patientRepo.findById(dto.getPatientId())
				.orElseThrow(() -> new ResourceNotFoundException("Patient Not Found"));

		ap.setDoctor(doctor);
		ap.setPatient(patient);

		ap.setAppointmentDate(dto.getAppointmentDate());

		ap.setStatus("BOOKED");

		appointmentRepo.save(ap);

		return "Appointment Booked Successfully";
	}

	public List<Appointment> getAll() {
		return appointmentRepo.findAll();
	}

	public String bookAppointmentString(Appointment_DTO dto) {

		System.out.println("Service Hit");

		System.out.println("DoctorId = " + dto.getDoctorId());
		System.out.println("PatientId = " + dto.getPatientId());

		Appointment ap = new Appointment();
		System.out.println("Saving Appointment...");
		appointmentRepo.save(ap);
		System.out.println("Saved Successfully");
		return null;

	}

	public String updateStatus(int id, String status) {

		Appointment ap = appointmentRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Appointment Not Found"));

		ap.setStatus(status);

		appointmentRepo.save(ap);

		return "Status Updated Successfully";
	}
}