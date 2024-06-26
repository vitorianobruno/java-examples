package com.java.examples.dependencyInjection;

import com.java.examples.model.Console;
import com.java.examples.model.PC;

public class PlayableFactory {

	public enum PlayableType {PC, Console}
	
	public static Playable create(PlayableType type){

		Playable device;

		switch (type) {
			case PC:
				device = new PC("Windows");
				break;
			default:
				device = new Console("PS4");
				break;
		}
		return device;
	}
}
