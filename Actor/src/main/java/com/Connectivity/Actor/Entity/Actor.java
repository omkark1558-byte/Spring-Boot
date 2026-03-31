package com.Connectivity.Actor.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Actor {

	@Id
	private int id;
	private String actor_Name;
	private String actor_Village;
	private String actor_Gender;
	private int actor_Experience;
	private double actor_Income;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getActor_Name() {
		return actor_Name;
	}
	public void setActor_Name(String actor_Name) {
		this.actor_Name = actor_Name;
	}
	public String getActor_Village() {
		return actor_Village;
	}
	public void setActor_Village(String actor_Village) {
		this.actor_Village = actor_Village;
	}
	public String getActor_Gender() {
		return actor_Gender;
	}
	public void setActor_Gender(String actor_Gender) {
		this.actor_Gender = actor_Gender;
	}
	public int getActor_Experience() {
		return actor_Experience;
	}
	public void setActor_Experience(int actor_Experience) {
		this.actor_Experience = actor_Experience;
	}
	public double getActor_Income() {
		return actor_Income;
	}
	public void setActor_Income(double actor_Income) {
		this.actor_Income = actor_Income;
	}
	
}
