package com.designpatterns.behavioral.template.house;

abstract class HouseTemplate {

	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
	}

	abstract void buildPillars();

	abstract void buildWalls();

	// This is a hook method so that sub class may or may not override
	void buildWindows() {
		System.out.println("Building windows");
	}

	private void buildFoundation() {
		System.out.println("Building Foundation with Iron rods, Cement, Sand");
	}
}

class BuildWoodenHouse extends HouseTemplate {
	@Override
	void buildPillars() {
		System.out.println("Build pillars with Wooden Coating");
	}

	@Override
	void buildWalls() {
		System.out.println("Build Wooden Walls");
	}
}

class BuildGlassHouse extends HouseTemplate {
	@Override
	void buildPillars() {
		System.out.println("Build pillars with Glass Coating");
	}

	@Override
	void buildWalls() {
		System.out.println("Build Glass Walls");
	}
	
	@Override
	void buildWindows() {
		System.out.println("Building Glass Windows");
	}
}