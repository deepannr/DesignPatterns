package com.designpatterns.structural.proxy.excercise;

interface ServerInterface {
	void connect() throws Exception;
}

class RealServer implements ServerInterface {
	private String siteName;
	public RealServer(String siteName) {
		this.siteName = siteName;
	}

	@Override
	public void connect() {
		System.out.println("Connected to Internet via site name " + siteName);
	}
}