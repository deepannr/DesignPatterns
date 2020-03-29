package com.designpatterns.creational.singleton.excercise;

public class Cricket {
	public static void main(String[] args) {
		MakeCaptain captain1 = MakeCaptain.getCaptain();
		System.out.println("Captain for team is " + captain1);
		
		
		MakeCaptain captain2 = MakeCaptain.getCaptain();
		System.out.println("Want to create Captain For team is " + captain2);
		
		if (captain1 == captain2) {
			System.out.println("Captain already created...");
		}
	}
}
