package com.ecom.Aopllo_Hospital.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Aopllo_Visit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int v_id;
	private LocalDate v_date;

	@ManyToOne
	@JoinColumn(name="patient_id")
	private Aopllo_Patient patient;
	
	public Aopllo_Patient getPatient() {
		return patient;
	}

	public void setPatient(Aopllo_Patient patient) {
		this.patient = patient;
	}


	public int getV_id() {
		return v_id;
	}

	public void setV_id(int v_id) {
		this.v_id = v_id;
	}

	public LocalDate getV_date() {
		return v_date;
	}

	public void setV_date(LocalDate v_date) {
		this.v_date = v_date;
	}

}
