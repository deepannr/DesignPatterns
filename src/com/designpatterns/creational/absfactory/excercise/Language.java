package com.designpatterns.creational.absfactory.excercise;

public interface Language {
	void movieType();
}

class HollyWoodMovie implements Language {
	@Override
	public void movieType() {
		System.out.println("Holly Wood Movie");
	}
}

class KollyWoodMovie implements Language {
	@Override
	public void movieType() {
		System.out.println("Kolly Wood Movie");
	}
}