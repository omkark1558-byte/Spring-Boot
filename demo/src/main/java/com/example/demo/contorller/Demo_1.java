package com.example.demo.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Classes.Practice_1;

@RestController
public class Demo_1 {

//	@PostMapping("/add-in/{name}/{Value}/{mo_Number}/{Price}")
//	public String getadd(@PathVariable(value = "name") String name, @PathVariable(value = "Value") String Value,@PathVariable(value = "mo_Number") int mo_Number, @PathVariable(value = "Price") double Price) {
//		System.out.println("Hellow");
//		return name+"\n"+Value+"\n"+mo_Number+"\n"+Price;
//		
//	}
	
	
	@Autowired
	private Practice_1 pra;
	
	@GetMapping("/get")
	public int getHascode()
	{
		return pra.hashCode();
		
	}

}
