package com.designpatterns.behavioral.observer.application;

interface Observer {
	// method to update the observer, used by subject
	void update();

	// Add to the subject for observing. not really required
	void setSubject(Subject subject);
}

class ObserverImpl implements Observer {
	private Subject subject;

	private String name;

	public ObserverImpl(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		String message = (String) subject.getUpdate(this);
		if (message == null) {
			System.out.println(name + " No New Mesage");
		} else {
			System.out.println(name + " New Mesage: " + message);
		}
	}

	@Override
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
}