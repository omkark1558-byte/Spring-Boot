package com.ecom.Amazon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Amazon_User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int user_Id;

	String user_name;
	String user_address;
	String user_pincode;
	String user_City;

	@Column(unique = true)
	String user_Email;

	public String getUser_Email() {
		return user_Email;
	}

	public void setUser_Email(String user_Email) {
		this.user_Email = user_Email;
	}

	public int getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public String getUser_pincode() {
		return user_pincode;
	}

	public void setUser_pincode(String user_pincode) {
		this.user_pincode = user_pincode;
	}

	public String getUser_City() {
		return user_City;
	}

	public void setUser_City(String user_City) {
		this.user_City = user_City;
	}


}
