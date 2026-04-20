package com.Ecomproject.Airlines.Exception;

@SuppressWarnings("serial")
public class CustomerNotFoundException extends Exception {

	
	
	public CustomerNotFoundException(int c_id)
	{
		super("The Given Customer with the Id "+c_id+" Is Not Present");
	}
}
