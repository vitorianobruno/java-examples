package com.java.examples;

import com.java.examples.dependencyInjection.Playable;
import com.java.examples.dependencyInjection.PlayableFactory;
import com.java.examples.model.Player;

public class DependencyInjectionApplication {

	public static void main(String[] args) {
		//Playable device = new Console("PS4");
		Playable device1 = PlayableFactory.create(PlayableFactory.PlayableType.Console);
		Player player1 = new Player("Bruno",device1);
		player1.play();
		
		Playable device2 = PlayableFactory.create(PlayableFactory.PlayableType.PC);
		Player player2 = new Player("Ricardo",device2);
		player2.play();
	}

}
