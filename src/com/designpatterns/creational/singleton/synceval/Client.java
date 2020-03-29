package com.designpatterns.creational.singleton.synceval;


public class Client {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		singleton.setData(52);
		
		System.out.println("Reference :" + singleton);
		System.out.println("Data : " + singleton.getData());
		
		singleton = null;
		singleton = Singleton.getInstance();
		System.out.println("Getting Reference again :" + singleton);
		System.out.println("Data : " + singleton.getData());
	}
}
