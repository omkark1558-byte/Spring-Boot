package com.Ecomproject.Airlines.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne; 

@Entity
public class PaymentServices_Entity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int p_id;
	String p_status;
	
	 @OneToOne
	 @JoinColumn(name = "t_id")
	 private Ticket_Entity ticket;
	 
	
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_status() {
		return p_status;
	}
	public void setP_status(String p_status) {
		this.p_status = p_status;
	}
	public Ticket_Entity getTickets() {
		return ticket;
	}
	public void setTickets(Ticket_Entity tickets) {
		this.ticket = tickets;
	} 
	
	
}
