package com.designpatterns.dependencyinj.intrface;

public interface Client {
	void setService(Service service);

	void someCode(Service service);
}