package com.designpatterns.dependencyinv;

public class BaseClass {
	DBConnection connection;
	
	public BaseClass(DBConnection connection) {
		this.connection = connection;
	}
}
