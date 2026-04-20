package com.Ecomproject.Airlines.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Aeroplane_Entity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int a_id;
	String a_name;
	String a_model;

	@OneToMany(mappedBy = "aeroplane")
	private List<Customer_Entity> customer;

	public int getA_id() {
		return a_id;
	}

	public void setA_id(int a_id) {
		this.a_id = a_id;
	}

	public String getA_name() {
		return a_name;
	}

	public void setA_name(String a_name) {
		this.a_name = a_name;
	}

	public String getA_model() {
		return a_model;
	}

	public void setA_model(String a_model) {
		this.a_model = a_model;
	}

}
