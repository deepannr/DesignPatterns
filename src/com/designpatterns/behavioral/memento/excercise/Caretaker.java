package com.designpatterns.behavioral.memento.excercise;

class Caretaker {
	private Object object;
	
	public void save(Originator originator) {
		this.object = originator.saveStateData();
	}
	
	public void undo(Originator originator) {
		originator.undoStateData(object);
	}
}