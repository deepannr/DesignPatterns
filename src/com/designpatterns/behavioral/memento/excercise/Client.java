package com.designpatterns.behavioral.memento.excercise;

class Client {
	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();
		Originator originator = new Originator("sampleFile.txt");
		originator.writeStateData("First Set of State: \nOpen\nRunning\nPaused");
		
		System.out.println("---Writing & Saving 1st set of state---");
		System.out.println(originator.print());
		caretaker.save(originator);
		
		System.out.println("\n\n---Writing & Saving 2nd set of state---");
		originator.writeStateData("\nSecond Set of State: \nStopped\nExit");
		System.out.println(originator.print());
		caretaker.save(originator);
		
		System.out.println("\n\n---Writing 3rd set of state---");
		originator.writeStateData("\nThird Set of State: \nRerun\nSleep");
		System.out.println(originator.print());
		
		System.out.println("\n\n---Undo 3rd set of data---");
		caretaker.undo(originator);
		System.out.println(originator.print());
	}
}
