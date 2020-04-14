package com.designpatterns.structural.flyweight.extrinsic;

interface Robot {
	void name();
	
	// Extrinsic data
	void setColor(ROBOTCOLOR color);
}

class RobotImpl implements Robot {
	private ROBOTCATEGORY category;
	private ROBOTCOLOR color;
	public RobotImpl(ROBOTCATEGORY category) {
		this.category = category;
	}
	
	@Override
	public void name() {
		System.out.println(category + "Robot with color " + color);
	}

	@Override
	public void setColor(ROBOTCOLOR color) {
		this.color = color;
	}
}
