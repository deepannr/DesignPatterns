package com.designpatterns.dependencyinj.cons;

public class Client {
	private Service service;
	
	public Client(Service service) {
		this.service = service;
	}
	
	public void someCode() {
		service.write("Injection");
	}
	
	public static void main(String ar[]) {
		/**
		 * Here instantiation of Service happens in lower level class.
		 */
		Service service = new ServiceImpl(); // Actual Injector
		Client client = new Client(service); // Injector via constructor
		client.someCode();
	}
}
