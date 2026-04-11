package com.Scopes.scope_types.Classes;

import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class singletone {


	UUID uuid = UUID.randomUUID();
	public singletone()
	{
		System.out.println("Contrusctor Obj Created..!");
	}
	public UUID getId()
	{
		return uuid;
	}
}
