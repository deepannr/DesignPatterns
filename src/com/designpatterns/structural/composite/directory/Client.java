package com.designpatterns.structural.composite.directory;

public class Client {

	public static void main(String[] args) {
		Employee dev1 = new Developer(100, "Dee", "TL");
		Employee dev2 = new Developer(101, "Jar", "SSE");
		Employee dev3 = new Developer(103, "BJE", "SSE");
		
		Manager man = new Manager("MAN1", 10000);
		man.addEmployee(dev2);
		man.addEmployee(dev3);
		
		Manager cto = new Manager("CTO", 200000);
		cto.addEmployee(dev1);
		cto.addEmployee(man);
		System.out.println("---Manager---");
		man.showEmployeeDetails();
		
		System.out.println("\n---CTO---");
		cto.showEmployeeDetails();
	}
}
