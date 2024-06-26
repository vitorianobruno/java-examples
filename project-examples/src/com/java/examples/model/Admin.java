package com.java.examples.model;

public class Admin {
	
	private int id;
	private String name;

	public Admin(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Admin() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
