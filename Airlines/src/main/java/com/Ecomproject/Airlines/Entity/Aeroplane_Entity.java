package com.Ecomproject.Airlines.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Aeroplane_Entity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long a_id;

	@ManyToOne
	@JoinColumn(name = "c_id")
	private Customer_Entity customer;

	private String a_name;

	public long getId() {
		return a_id;
	}

	public void setId(long a_id) {
		this.a_id = a_id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Column(unique = true)
	private String model;

	public long getA_id() {
		return a_id;
	}

	public void setA_id(long a_id) {
		this.a_id = a_id;
	}

	public String getA_name() {
		return a_name;
	}

	public void setA_name(String a_name) {
		this.a_name = a_name;
	}

	public Customer_Entity getCustomer() {
		return customer;
	}

	public void setCustomer(Customer_Entity customerz) {
		customer = customerz;
	}

}
