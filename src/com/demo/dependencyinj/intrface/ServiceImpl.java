package com.demo.dependencyinj.intrface;

public class ServiceImpl implements Service {
	@Override
	public void inject(Client client) {
		client.setService(this);
		
	}

	@Override
	public void write(String message) {
		System.out.println("Interface " + message);
	}

}
