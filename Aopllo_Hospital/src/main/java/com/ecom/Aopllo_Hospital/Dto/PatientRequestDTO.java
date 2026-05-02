package com.ecom.Aopllo_Hospital.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class PatientRequestDTO {

	@NotBlank(message = "Name is required")
	private String p_name;

	@NotBlank(message = "Age is required")
	private String p_age;

	@Email(message = "Gender is requried")
	private String p_email;

	@NotBlank(message = "Gender is required")
	private String p_gender;

	@Pattern(regexp = "^[0-9]{10}$", message = "Mobile must be 10 Digit")
	private String p_mobileno;

	private int doctorId;

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getP_age() {
		return p_age;
	}

	public void setP_age(String p_age) {
		this.p_age = p_age;
	}

	public String getP_email() {
		return p_email;
	}

	public void setP_email(String p_email) {
		this.p_email = p_email;
	}

	public String getP_gender() {
		return p_gender;
	}

	public void setP_gender(String p_gender) {
		this.p_gender = p_gender;
	}

	public String getP_mobileno() {
		return p_mobileno;
	}

	public void setP_mobileno(String p_mobileno) {
		this.p_mobileno = p_mobileno;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
}
