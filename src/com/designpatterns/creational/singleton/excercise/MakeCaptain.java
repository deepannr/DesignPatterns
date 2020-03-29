package com.designpatterns.creational.singleton.excercise;

public class MakeCaptain {
	private MakeCaptain() {}
	
	private static class MakeCaptainHelper {
		private static final MakeCaptain captain = new MakeCaptain();
	}
	
	public static MakeCaptain getCaptain() {
		return MakeCaptainHelper.captain;
	}
}
