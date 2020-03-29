package com.designpatterns.creational.singleton.synceval;

public class Singleton {
	private static Singleton instance = null;
	
	private int data = 0;
	
	private Singleton() {}
	
	/*
	 * Synchronized is thread safe. Every thread will wait for its turn to get the instance.
	 */
	public static synchronized Singleton getInstance() {
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
