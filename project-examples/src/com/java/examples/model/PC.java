package com.java.examples.model;

import com.java.examples.dependencyInjection.Playable;

public class PC implements Playable {

	private String model;

	public PC(String model) {
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
		System.out.println("You are using PC: "+ model);
	}
	
}
