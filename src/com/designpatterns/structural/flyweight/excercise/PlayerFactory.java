package com.designpatterns.structural.flyweight.excercise;

import java.util.HashMap;
import java.util.Map;

class PlayerFactory {
	private static Map<TYPE, Player> players = new HashMap<>();

	public static int getPlayerCount() {
		return players.size();
	}

	public static Player getTerroristFromFactory(TYPE type) {
		Player player = null;

		if (players.containsKey(type)) {
			player = players.get(type);
		} else {
			switch (type) {
			case TERRORIST:
				System.out.println("Creating Terrorist class");
				player = new Terrorist();
				players.put(type, player);
				break;

			case COUNTER_TERRORIST:
				System.out.println("Creating counter Terrorist class");
				player = new CounterTerrorist();
				players.put(type, player);
				break;
			}
		}
		return player;
	}
}
