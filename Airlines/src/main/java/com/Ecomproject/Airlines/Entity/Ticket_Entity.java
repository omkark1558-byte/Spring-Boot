package com.Ecomproject.Airlines.Entity;
 

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Ticket_Entity {

	@Id
	int t_id;

	private double t_price;
	private String t_destination;
	private String t_boarding;
	
	
	@ManyToOne
	@JoinColumn(name="c_id")
	private Customer_Entity customer;
	
	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public double getT_price() {
		return t_price;
	}

	public void setT_price(double t_price) {
		this.t_price = t_price;
	}

	public Customer_Entity getCustomer() {
		return customer;
	}

	public void setCustomer(Customer_Entity customers) {
		customer = customers;
	}

	public String getT_destination() {
		return t_destination;
	}

	public void setT_destination(String t_destination) {
		this.t_destination = t_destination;
	}

	public String getT_boarding() {
		return t_boarding;
	}

	public void setT_boarding(String t_boarding) {
		this.t_boarding = t_boarding;
	}

}
