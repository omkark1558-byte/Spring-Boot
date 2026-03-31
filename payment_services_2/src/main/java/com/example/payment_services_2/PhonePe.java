package com.example.payment_services_2;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component()
@Primary
public class PhonePe implements PaymentService{

	 
	@Override
	public String Payment() {
		 
		return "Payment Sucessfully...✅";
	}
}

