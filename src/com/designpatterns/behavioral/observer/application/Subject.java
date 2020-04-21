package com.designpatterns.behavioral.observer.application;

import java.util.ArrayList;
import java.util.List;

interface Subject {
	// Register and deregister the observers
	void register(Observer observer);

	void deRegister(Observer observer);

	// Notifies all the observers
	void notifyObservers();

	// Observers want to get update from subject can use this method (really not
	// mandatory)
	public Object getUpdate(Observer observer);
}

class SubjectImpl implements Subject {
	private List<Observer> observers;
	private String message;
	private boolean isChanged;

	public SubjectImpl() {
		observers = new ArrayList<>();
	}

	@Override
	public void register(Observer observer) {
		if (null == observer) {
			throw new NullPointerException("Null Observer");
		}
		if (!observers.contains(observer)) {
			observers.add(observer);
		}
	}

	@Override
	public void deRegister(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		List<Observer> localObserver = null;
		if (!isChanged)
			return;

		// To remove any race condition
		localObserver = new ArrayList<>(this.observers);
		this.isChanged = false;

		localObserver.forEach(Observer::update);
	}

	@Override
	public Object getUpdate(Observer observer) {
		return this.message;
	}

	public void postMessage(String message) {
		this.message = message;
		this.isChanged = true;
		notifyObservers();
	}
}