package com.designpatterns.behavioral.observer.excercise;

interface Observer {
	void getScore();
	
	void setSubject(Subject subject);
}

class ViewerObserver implements Observer {
	private String name;
	private Subject subject;
	
	public ViewerObserver(String name) {
		this.name = name;
	}

	@Override
	public void getScore() {
		CricketScore score = (CricketScore) subject.sendScore(this);
		if (null == score) {
			System.out.println(name + " No new Score");
		} else {

			System.out.println(name + " Runs: " + score.getRuns() + " Overs: " + score.getOvers() + " Wickets: " + score.getWickets());
		}
	}

	@Override
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
}