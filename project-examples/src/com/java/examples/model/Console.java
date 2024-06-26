package com.java.examples.model;

import com.java.examples.dependencyInjection.Playable;

public class Console implements Playable{

	private String model;

	public Console(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public void play() {
		System.out.println("You are playing: "+ model);
	}
	
}
