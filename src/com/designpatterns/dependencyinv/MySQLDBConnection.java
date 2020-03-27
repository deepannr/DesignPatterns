package com.designpatterns.dependencyinv;

public class MySQLDBConnection implements DBConnection {

	@Override
	public int connect() {
		return 1;
	}
}
