package com.Ecomproject.Airlines.Dto;

import java.time.LocalDate;

public class Ticket_DTO {

	int t_id;
	String t_status;
	LocalDate date;
	double price;
	private String aeroplaneName;
	private String paymentStatus;

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
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

	public String getAeroplaneName() {
		return aeroplaneName;
	}

	public void setAeroplaneName(String aeroplaneName) {
		this.aeroplaneName = aeroplaneName;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
}