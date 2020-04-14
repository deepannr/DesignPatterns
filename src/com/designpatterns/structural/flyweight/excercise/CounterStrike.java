package com.designpatterns.structural.flyweight.excercise;

import java.util.Random;

class CounterStrike {

	public static void main(String[] args) {
		System.out.println("---Terrorist---");
		for (int i = 0; i < 5; ++i) {
			Player terrorist = PlayerFactory.getTerroristFromFactory(TYPE.TERRORIST);
			terrorist.assignWeapon(getRandomWeapon());
			terrorist.mission();
		}
		System.out.println("Number of Plyers: " + PlayerFactory.getPlayerCount());

		System.out.println("\n---Counter Terrorist---");
		for (int i = 0; i < 5; ++i) {
			Player counterTerrorist = PlayerFactory.getTerroristFromFactory(TYPE.COUNTER_TERRORIST);
			counterTerrorist.assignWeapon(getRandomWeapon());
			counterTerrorist.mission();
		}
		System.out.println("Number of Plyers: " + PlayerFactory.getPlayerCount());
	}

	private static WEAPON getRandomWeapon() {
		Random random = new Random();
		int randomInt = random.nextInt(20);
		if (randomInt % 4 == 0)
			return WEAPON.GUN;
		else if (randomInt % 4 == 1)
			return WEAPON.AK47;
		else if (randomInt % 4 == 2)
			return WEAPON.GUT_KNIFE;
		return WEAPON.DESERT_EAGLE;
	}
}
