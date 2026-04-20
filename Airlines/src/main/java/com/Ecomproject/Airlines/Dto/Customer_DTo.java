package com.Ecomproject.Airlines.Dto;

import java.util.List;

import com.Ecomproject.Airlines.Entity.Customer_Entity;
import com.Ecomproject.Airlines.Entity.Ticket_Entity;

//import com.Ecomproject.Airlines.Entity.Customer_Entity;

public class Customer_DTO {
	
	int c_id;
	String c_name;
	String c_email;
	String c_gender;
	String c_mobile;
	
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
	
	public List<Ticket_DTO> getTickets() {
		return tickets;
	}
	public void setTickets(List<Ticket_DTO> tickets) {
		this.tickets = tickets;
	}
	
	
	
	public  static Ticket_DTO convertticket(Ticket_Entity entity)
	{
		Ticket_DTO dto=new Ticket_DTO();
		
		
		dto.setDate(entity.getDate());
		dto.setPaymentStatus(entity.getPayment().getP_status());
		dto.setPrice(entity.getPrice());

		dto.setT_id(entity.getT_id());
		
		return dto;
	}
	
	
	
	public static Customer_DTO customdto(Customer_Entity entity)
	{
		 List<Ticket_DTO> list=entity.getTickets().stream().map(Customer_DTO::convertticket).toList();
		 
		 
		          Customer_DTO dto=new Customer_DTO();
		          
		          dto.setC_email(entity.getC_email());
		          dto.setC_gender(entity.getC_gender());
		          dto.setC_mobile(entity.getC_mobile());
		          dto.setTickets(list);
		          
		          
		          return dto;
	}
}
