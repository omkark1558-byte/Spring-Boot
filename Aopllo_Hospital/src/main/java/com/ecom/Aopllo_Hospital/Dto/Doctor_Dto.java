package com.ecom.Aopllo_Hospital.Dto;

import com.ecom.Aopllo_Hospital.entity.Aopllo_Doctor;

public class Doctor_Dto {

	int d_id;
	String d_name;
	String d_date;

	public int getD_id() {
		return d_id;
	}

	public void setD_id(int d_id) {
		this.d_id = d_id;
	}

	public String getD_name() {
		return d_name;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}

	public String getD_date() {
		return d_date;
	}

	public void setD_date(String d_date) {
		this.d_date = d_date;
	}

	public static Doctor_Dto convert(Aopllo_Doctor doc) {
		Doctor_Dto Dr = new Doctor_Dto();
		Dr.setD_id(doc.getD_id());
		Dr.setD_name(doc.getD_name());
		Dr.setD_date(doc.getD_date());

		return Dr;

	}

}
