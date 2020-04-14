package com.designpatterns.structural.flyweight.intrinsic;

import java.util.HashMap;
import java.util.Map;

class RobotFactory {
	private Map<Enum<ROBOTCATEGORY>, Robot> robots = new HashMap<>();

	public int robotsCreated() {
		return robots.size();
	}

	public Robot getRobotFromFactory(ROBOTCATEGORY category) throws Exception {
		Robot robot = null;

		if (robots.containsKey(category)) {
			robot = robots.get(category);
		} else {
			switch (category) {
			case SMALL:
				System.out.println("Creating small robot as already not exists..");
				robot = new SmallRobot();
				robots.put(category, robot);
				break;

			case BIG:
				System.out.println("Creating big robot as already not exists..");
				robot = new BigRobot();
				robots.put(category, robot);
				break;

			case INVALID:
			default:
				throw new Exception("Invalid robo category..");

			}
		}
		return robot;
	}
}
