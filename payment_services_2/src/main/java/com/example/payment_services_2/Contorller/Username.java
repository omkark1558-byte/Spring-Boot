package com.example.payment_services_2.Contorller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
public class Username {

	@PostMapping("/name")
	public String getName(@PathParam(value="fname") String name, @PathParam(value="Scity") String city, @PathParam(value="Sstate") String state)
	{
		return name +" " +city +" "+ state;
		
	}
}

