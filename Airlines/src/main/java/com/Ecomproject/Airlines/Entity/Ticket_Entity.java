package com.Ecomproject.Airlines.Entity;

import java.time.LocalDate;
 

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Ticket_Entity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int t_id;

	String t_name;
	String t_status;
	LocalDate date;
	double price;
	
	@ManyToOne
	@JoinColumn(name = "c_id")
	private Customer_Entity customer;
 
	@OneToOne(mappedBy = "ticket" , cascade = CascadeType.ALL)
	private PaymentServices_Entity payment;

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public String getT_status() {
		return t_status;
	}

	public void setT_status(String t_status) {
		this.t_status = t_status;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
 
	public Customer_Entity getCustomer() {
		return customer;
	}

	public void setCustomer(Customer_Entity customer) {
		this.customer = customer;
	}

	public PaymentServices_Entity getPayment() {
		return payment;
	}

	public void setPayment(PaymentServices_Entity payment) {
		this.payment = payment;
	}
 
 
	
}
