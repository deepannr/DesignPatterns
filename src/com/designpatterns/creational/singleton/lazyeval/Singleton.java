package com.designpatterns.creational.singleton.lazyeval;

public class Singleton {
	private static Singleton instance = null;
	
	private Singleton() {}
	
	private int data = 0;
	
	public static Singleton getInstance() {
		if (null == instance) {
			instance = new Singleton();
		}
		return instance;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	
}
