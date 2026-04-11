package com.Ecomproject.Airlines.Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer_Entity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int c_id;

	private String c_name;

	@Column(unique = true)
	private String c_Email;

	private String c_phone;
	private String c_gender;

	@OneToMany(mappedBy = "customer")
	private List<Aeroplane_Entity> aeroplane;

	@OneToMany(mappedBy = "customer")
	private List<Ticket_Entity> ticket;

	@OneToMany(mappedBy = "customer")
	private List<PaymentServices_Entity> payment;

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_Email() {
		return c_Email;
	}

	public void setC_Email(String c_Email) {
		this.c_Email = c_Email;
	}

	public String getC_phone() {
		return c_phone;
	}

	public void setC_phone(String c_phone) {
		this.c_phone = c_phone;
	}

	public String getC_gender() {
		return c_gender;
	}

	public void setC_gender(String c_gender) {
		this.c_gender = c_gender;
	}

	public List<Aeroplane_Entity> getAeroplane() {
		return aeroplane;
	}

	public void setAeroplane(List<Aeroplane_Entity> aeroplane) {
		this.aeroplane = aeroplane;
	}

	public List<Ticket_Entity> getTicket() {
		return ticket;
	}

	public void setTicket(List<Ticket_Entity> ticket) {
		this.ticket = ticket;
	}

	public List<PaymentServices_Entity> getPayment() {
		return payment;
	}

	public void setPayment(List<PaymentServices_Entity> payment) {
		this.payment = payment;
	}

}
