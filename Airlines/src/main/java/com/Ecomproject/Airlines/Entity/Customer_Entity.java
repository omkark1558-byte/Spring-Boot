package com.Ecomproject.Airlines.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
 

@Entity
public class Customer_Entity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int c_id;
	String c_name;
	String c_email;
	String c_gender;
	String c_mobile;
	
	@OneToMany(mappedBy = "customer")
	private List<Ticket_Entity> ticket;
	
	@ManyToOne
	@JoinColumn(name = "a_id")
	private Aeroplane_Entity aeroplane;
	 
	
	
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
	public String getC_email() {
		return c_email;
	}
	public void setC_email(String c_email) {
		this.c_email = c_email;
	}
	public String getC_gender() {
		return c_gender;
	}
	public void setC_gender(String c_gender) {
		this.c_gender = c_gender;
	}
	public String getC_mobile() {
		return c_mobile;
	}
	public void setC_mobile(String c_mobile) {
		this.c_mobile = c_mobile;
	}
	public List<Ticket_Entity> getTickets() {
		return ticket;
	}
	public void setTickets(List<Ticket_Entity> tickets) {
		this.ticket = tickets;
	} 
	
	
	
}
