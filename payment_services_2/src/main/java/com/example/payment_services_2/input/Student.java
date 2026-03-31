package com.example.payment_services_2.input;

//impo rt org.springframework.stereotype.Component;

//@Component
public class Student {
	
//	public Student()
//	{
//		System.out.println("Student Object Created...!");
//	}
//	public int getID()
//	{
//		return 102020;
//	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	String name;
	int id;
	String city;
	int[] marks;

}
