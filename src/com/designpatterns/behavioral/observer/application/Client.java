package com.designpatterns.behavioral.observer.application;

class Client {

	public static void main(String[] args) {
		SubjectImpl subject = new SubjectImpl();
		
		Observer observerA = new ObserverImpl("observerA");
		Observer observerB = new ObserverImpl("observerB");
		Observer observerC = new ObserverImpl("observerC");
		
		subject.register(observerA);
		subject.register(observerB);
		subject.register(observerC);
		
		observerA.setSubject(subject);
		observerB.setSubject(subject);
		observerC.setSubject(subject);
		
		System.out.println("---Checking messages before no subject is sent---");
		observerA.update();
		observerB.update();
		observerC.update();
		
		System.out.println("\n---Sending new message to all registed subscribers---");
		subject.postMessage("New Message from Subject");
		
		subject.deRegister(observerA);
		System.out.println("\n---Sending another message after deregister A---");
		subject.postMessage("Another Message from Subject");
	}
}
