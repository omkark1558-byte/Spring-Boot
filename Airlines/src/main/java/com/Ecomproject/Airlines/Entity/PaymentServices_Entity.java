package com.Ecomproject.Airlines.Entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class PaymentServices_Entity {

	@Id
	UUID transcation_id;

	private int p_id;
	private String status;

	@ManyToOne
	@JoinColumn(name = "c_id")
	private Customer_Entity customer;

	public UUID getTranscation_id() {
		return transcation_id;
	}

	public void setTranscation_id(UUID transcation_id) {
		this.transcation_id = transcation_id;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Customer_Entity getCustomer() {
		return customer;
	}

	public void setCustomer(Customer_Entity customers) {
		customer = customers;
	}

}
