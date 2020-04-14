package com.designpatterns.structural.proxy.image;

class Client {
	public static void main(String[] args) {
		Subject proxy = new Proxy("dees.txt");
		proxy.request();
	}
}
