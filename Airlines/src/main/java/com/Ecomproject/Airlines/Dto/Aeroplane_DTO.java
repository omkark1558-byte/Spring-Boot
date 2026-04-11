package com.Ecomproject.Airlines.Dto;

import com.Ecomproject.Airlines.Entity.Aeroplane_Entity;

public class Aeroplane_DTO {

	
	int a_id;
	String a_name;
	public int getA_id() {
		return a_id;
	}
	public void setA_id(long l) {
		this.a_id = (int) l;
	}
	public String getA_name() {
		return a_name;
	}
	public void setA_name(String a_name) {
		this.a_name = a_name;
	}	
	
	public static Aeroplane_DTO convert(Aeroplane_Entity aro)
	{
		Aeroplane_DTO ad = new Aeroplane_DTO();
		ad.setA_id(aro.getA_id());
		ad.setA_name(aro.getA_name());
		return ad;
		
	}
	
}
