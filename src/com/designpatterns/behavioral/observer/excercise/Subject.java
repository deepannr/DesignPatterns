package com.designpatterns.behavioral.observer.excercise;

import java.util.ArrayList;
import java.util.List;

interface Subject {
	void register(Observer viewer);

	void deregister(Observer viewer);

	void notifyScores();

	Object sendScore(Observer observer);
}

class CricketScorerSubject implements Subject {
	private List<Observer> viewers;

	private CricketScore score;

	private boolean isChanged;

	public CricketScorerSubject() {
		viewers = new ArrayList<>();
	}

	@Override
	public void register(Observer viewer) {
		this.viewers.add(viewer);
	}

	@Override
	public void deregister(Observer viewer) {
		this.viewers.remove(viewer);
	}

	@Override
	public void notifyScores() {
		if (!isChanged)
			return;
		
		viewers.forEach(Observer::getScore);
		this.isChanged = false;
	}

	@Override
	public Object sendScore(Observer observer) {
		return this.score;
	}
	
	public void updateScore(CricketScore score) {
		this.score = score;
		this.isChanged = true;
		notifyScores();
	}
}