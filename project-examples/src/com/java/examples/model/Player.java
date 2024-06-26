package com.java.examples.model;

import com.java.examples.dependencyInjection.Playable;

public class Player {

	private String name;
	private Playable device;
	
	public Player(String name, Playable device) {
		this.name = name;
		this.device = device;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Playable getDevice() {
		return device;
	}

	public void setDevice(Playable device) {
		this.device = device;
	}
	
	// That method does the link with interface class
	public void play() {
		System.out.print("Hola "+name+"! ");
		device.play();
	}
	
}
