package com.example.payment_services_2;

//import org.springframework.stereotype.Component;

//@Component(value="second")
public class GooglePay implements PaymentService{
 
 
	@Override
	public String Payment() {
		 
		return "Google Payment Paid..!";
	}

}
