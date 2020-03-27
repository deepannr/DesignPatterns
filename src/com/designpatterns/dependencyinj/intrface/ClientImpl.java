package com.designpatterns.dependencyinj.intrface;

public class ClientImpl implements Client {
	Service service;

	@Override
	public void setService(Service service) {
		this.service = service;
	}

	@Override
	public void someCode(Service service) {
		service.write("Injection");
	}

	public static void main(String[] args) {
		Client client = new ClientImpl();
		Service myService = new ServiceImpl();

		myService.inject(client);
		client.someCode(myService);
	}
}