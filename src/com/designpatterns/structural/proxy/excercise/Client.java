package com.designpatterns.structural.proxy.excercise;

class Client {
	public static void main(String[] args) throws Exception {
		ServerInterface access = new ProxyServer("goodsite.org");
		access.connect();
		
		ServerInterface denied = new ProxyServer("complexfind.org");
		denied.connect();
	}
}
