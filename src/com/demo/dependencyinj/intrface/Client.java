package com.demo.dependencyinj.intrface;

public interface Client {
	void setService(Service service);

	void someCode(Service service);
}