package com.ecom.Aopllo_Hospital.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Aopllo_Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int p_id;
	private String p_name;
	private String p_age;

	@ManyToOne
	@JoinColumn(name = "d_id")
	private Aopllo_Doctor dr;

	
	
	public Aopllo_Doctor getDr() {
		return dr;
	}

	public void setDr(Aopllo_Doctor dr) {
		this.dr = dr;
	}

	@Column(unique = true)
	private String p_email;
	private String p_gender;
	private String p_mobileno;

	public int getP_id() {
		return p_id;
	}

	public Aopllo_Doctor getdr() {
		return dr;
	}

	public void setdr(Aopllo_Doctor dr) {
		this.dr = dr;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

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
}
