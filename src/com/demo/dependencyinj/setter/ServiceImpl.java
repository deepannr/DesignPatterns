package com.demo.dependencyinj.setter;

public class ServiceImpl implements Service {

	@Override
	public void write(String message) {
		System.out.println("Setter " + message);
	}
}
