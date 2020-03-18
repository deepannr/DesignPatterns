package com.demo.dependencyinv;

public class MySQLDBConnection implements DBConnection {

	@Override
	public int connect() {
		return 1;
	}
}
