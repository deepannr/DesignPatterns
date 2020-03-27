package com.designpatterns.dependencyinj.cons;

public class ServiceImpl implements Service {

	@Override
	public void write(String message) {
		System.out.println("Constructor " + message);
	}
}
