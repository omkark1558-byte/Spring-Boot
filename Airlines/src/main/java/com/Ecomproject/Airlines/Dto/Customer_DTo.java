package com.Ecomproject.Airlines.Dto;

import java.util.List;

import com.Ecomproject.Airlines.Entity.Customer_Entity;

public class Customer_DTo {

	int c_id;
	String c_name;

	private List<Aeroplane_DTO> aeroplane;
	private List<Ticket_DTO> tickets;

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

	public List<Aeroplane_DTO> getAeroplane() {
		return aeroplane;
	}

	public void setAeroplane(List<Aeroplane_DTO> aeroplane) {
		this.aeroplane = aeroplane;
	}

	public List<Ticket_DTO> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket_DTO> tickets) {
		this.tickets = tickets;
	}

	public static Customer_DTo convert(Customer_Entity customer) {
		Customer_DTo cm = new Customer_DTo();
		cm.setC_name(customer.getC_name());
		cm.setC_id(customer.getC_id());

		List<Aeroplane_DTO> aerolist = customer.getAeroplane().stream().map(Aeroplane_DTO::convert).toList();

		cm.setAeroplane(aerolist);

		List<Ticket_DTO> ticketlist = customer.getTicket().stream().map(Ticket_DTO::convert).toList();

		cm.setTickets(ticketlist);

		return cm;
	}

}
