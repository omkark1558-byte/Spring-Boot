package com.revssion.session.Revision;

import org.springframework.stereotype.Component;

@Component
public class Practice_2 {

	public Practice_2()
	{
		System.out.println("Second Constructor Calling......⚠️");
	}
	
	public String greet()
	{
		return " ' He I am Using The bean of the type Practice_2 ' ";
	}
}

