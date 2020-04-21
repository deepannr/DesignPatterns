package com.designpatterns.behavioral.observer.excercise;

class CricketScore {
	private int runs;

	private int overs;

	private int wickets;

	public CricketScore(int runs, int overs, int wickets) {
		super();
		this.runs = runs;
		this.overs = overs;
		this.wickets = wickets;
	}

	public int getRuns() {
		return runs;
	}

	public int getOvers() {
		return overs;
	}

	public int getWickets() {
		return wickets;
	}
}
