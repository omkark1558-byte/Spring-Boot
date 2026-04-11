package com.Ecomproject.Airlines.Dto;

import com.Ecomproject.Airlines.Entity.Ticket_Entity;

public class Ticket_DTO {

	int t_id;

	double t_price;
	String t_destination;
	String t_boarding;

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

	public static Ticket_DTO convert(Ticket_Entity tick) {
		Ticket_DTO td = new Ticket_DTO();
		td.setT_id(tick.getT_id());
		td.setT_price(tick.getT_price());
		td.setT_boarding(tick.getT_boarding());
		td.setT_destination(tick.getT_destination());
		return td;
	}
}
