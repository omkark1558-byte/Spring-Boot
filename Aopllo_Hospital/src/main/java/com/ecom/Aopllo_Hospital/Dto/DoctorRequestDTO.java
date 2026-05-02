package com.ecom.Aopllo_Hospital.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class DoctorRequestDTO {

	
	@NotBlank(message = "Name is required")
	private String d_name;
	
	@Email(message = "Invalid Email")
	private String d_email;
	
	
	@NotBlank(message = "Speciality is Required")
	private String d_speciality;
	
	private String d_date;

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
