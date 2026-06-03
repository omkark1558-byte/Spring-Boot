package com.ecom.Aopllo_Hospital.entity;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int a_id;

	private LocalDate appointmentDate;

	private String status;

	@ManyToOne
	@JoinColumn(name = "doctor_id")
	private Aopllo_Doctor doctor;

	@ManyToOne
	@JoinColumn(name = "patient_id")
	private Aopllo_Patient patient;

	public int getA_id() {
		return a_id;
	}

	public void setA_id(int a_id) {
		this.a_id = a_id;
	}

	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Aopllo_Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Aopllo_Doctor doctor) {
		this.doctor = doctor;
	}

	public Aopllo_Patient getPatient() {
		return patient;
	}

	public void setPatient(Aopllo_Patient patient) {
		this.patient = patient;
	}
}
