package com.ecom.Amazon.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Amazon_Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int order_Id;

	String name_order;
	String order_pincode;
	double order_price;
	int order_quantity;

	@JoinColumn(name = "user_Id")
	@ManyToOne
	private Amazon_User user;

	public Amazon_User getUser() {
		return user;
	}

	public void setUser(Amazon_User user) {
		this.user = user;
	}

	public int getOrder_Id() {
		return order_Id;
	}

	public void setOrder_Id(int order_Id) {
		this.order_Id = order_Id;
	}

	public String getName_order() {
		return name_order;
	}

	public void setName_order(String name_order) {
		this.name_order = name_order;
	}

	public String getOrder_pincode() {
		return order_pincode;
	}

	public void setOrder_pincode(String order_pincode) {
		this.order_pincode = order_pincode;
	}

	public double getOrder_price() {
		return order_price;
	}

	public void setOrder_price(double order_price) {
		this.order_price = order_price;
	}

	public int getOrder_quantity() {
		return order_quantity;
	}

	public void setOrder_quantity(int order_quantity) {
		this.order_quantity = order_quantity;
	}

}
