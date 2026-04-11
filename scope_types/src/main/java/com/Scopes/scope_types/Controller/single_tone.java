package com.Scopes.scope_types.Controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Scopes.scope_types.Classes.singletone;


@RestController
public class single_tone {

	@Autowired
	private ApplicationContext context;
	
//	@Autowired
//	private singletone tone;
//	
//	@GetMapping("/get")
//	public int getHashcode()
//	{
//		return tone.hashCode();
//	}
	
	
	
	@GetMapping("/get")
	public UUID getuuid()
	{
		return context.getBean(singletone.class).getId();
//		return tone.getId();
	}
}
