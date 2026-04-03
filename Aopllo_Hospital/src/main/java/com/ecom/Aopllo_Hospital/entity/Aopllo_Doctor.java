package com.ecom.Aopllo_Hospital.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Aopllo_Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int d_id;
	private String d_name;

	@Column(unique = true)
	private String d_email;
	private String d_speciality;
	private String d_date;

	@JoinColumn(name = "p_id")
	@ManyToOne
	private Aopllo_Patient pat;

	public Aopllo_Patient getPat() {
		return pat;
	}

	public void setPat(Aopllo_Patient pat) {
		this.pat = pat;
	}

	public int getD_id() {
		return d_id;
	}

	public void setD_id(int d_id) {
		this.d_id = d_id;
	}

	public String getD_name() {
		return d_name;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}

	public String getD_email() {
		return d_email;
	}

	public void setD_email(String d_email) {
		this.d_email = d_email;
	}

	public String getD_speciality() {
		return d_speciality;
	}

	public void setD_speciality(String d_speciality) {
		this.d_speciality = d_speciality;
	}

	public String getD_date() {
		return d_date;
	}

	public void setD_date(String d_date) {
		this.d_date = d_date;
	}

}
