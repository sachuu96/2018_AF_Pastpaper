package com.springwithmongo.app.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="subjects")
public class Subject {
	private String Name;
	private String Description;
	private float Amount;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		this.Description = description;
	}
	public float getAmount() {
		return Amount;
	}
	public void setAmount(float amount) {
		this.Amount = amount;
	}
}
