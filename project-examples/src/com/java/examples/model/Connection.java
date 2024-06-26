package com.java.examples.model;

public class Connection {
	
	private static Connection instance;
	//private static Singleton instance = new Singleton();  not necessary: synchronized
	
	private Connection() {
		super();
	}

	// Solve the concurrency problem with multiples threads
	public static synchronized Connection getInstance(){

		if(instance == null) {
			instance = new Connection();
		}
		return instance;
	}

	public void connect() {
		
	}
	
	public void disconnect() {
		
	}
	
}
