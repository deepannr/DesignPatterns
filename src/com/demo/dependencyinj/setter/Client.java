package com.demo.dependencyinj.setter;

public class Client {

	private Service service;

	public void setService(Service service) {
		this.service = service;
	}

	public void someCode() {
		service.write("Injection");
	}

	public static void main(String[] args) {
		/**
		 * Here instantiation of Service happens in lower level class.
		 */
		Service myService = new ServiceImpl(); // Actual Injector
		Client client = new Client();
		
		client.setService(myService); // Setter Injection
		client.someCode();
	}
}
