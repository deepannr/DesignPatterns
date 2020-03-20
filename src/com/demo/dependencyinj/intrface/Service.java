package com.demo.dependencyinj.intrface;

public interface Service {
	void inject(Client client);

	void write(String message);
}