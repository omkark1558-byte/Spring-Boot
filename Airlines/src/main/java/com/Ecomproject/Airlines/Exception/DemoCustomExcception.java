package com.Ecomproject.Airlines.Exception;

public class DemoCustomExcception  extends Exception{
	
	public DemoCustomExcception(int id)
	{
		super("Customer with ID " + id + " Not Found");
	}

}
