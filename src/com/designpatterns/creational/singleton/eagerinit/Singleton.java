package com.designpatterns.creational.singleton.eagerinit;

/**
 * Drawback of this approach is whenever the class is loaded, it creates an
 * instance which uses some space even if the client is not called this class.
 * 
 * @author ab75812
 *
 */
public class Singleton {
	private static Singleton instance = new Singleton();

	private int data = 0;

	private Singleton() {
	}

	public static Singleton getInstance() {
		return instance;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}
