package com.designpatterns.behavioral.observer.excercise;

class Client {

	public static void main(String[] args) {
		CricketScorerSubject scorer = new CricketScorerSubject();
		Observer viewerA = new ViewerObserver("viewerA");
		Observer viewerB = new ViewerObserver("viewerB");
		Observer viewerC = new ViewerObserver("viewerC");
		
		scorer.register(viewerA);
		scorer.register(viewerB);
		scorer.register(viewerC);
		
		viewerA.setSubject(scorer);
		viewerB.setSubject(scorer);
		viewerC.setSubject(scorer);
		
		System.out.println("---Check if any score update---");
		viewerA.getScore();
		viewerB.getScore();
		viewerC.getScore();
		
		System.out.println("\n---Update on score after 48 overs---");
		CricketScore score = new CricketScore(290, 48, 5);
		scorer.updateScore(score);
		
		System.out.println("\n---Update on score after 49 overs---");
		score = new CricketScore(298, 49, 7);
		scorer.updateScore(score);
		
		scorer.deregister(viewerB);
		
		System.out.println("\n---Update on score after 50 overs---");
		score = new CricketScore(326, 50, 7);
		scorer.updateScore(score);
	}
}
