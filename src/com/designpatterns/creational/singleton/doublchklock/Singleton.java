package com.designpatterns.creational.singleton.doublchklock;

public class Singleton {
	private static volatile Singleton instance;
	
	private int data = 0;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if (null == instance) {
			synchronized(Singleton.class) {
				if (null == instance) {
					instance = new Singleton();
				}
			}
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
