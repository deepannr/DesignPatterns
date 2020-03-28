package com.designpatterns.creational.absfactory.excercise;

public interface Genre {
	void movieGenre();
}

class Comedy implements Genre {
	@Override
	public void movieGenre() {
		System.out.print("Its a Comedy ");
	}
}

class Action implements Genre {
	@Override
	public void movieGenre() {
		System.out.print("Its an Action ");
	}
}