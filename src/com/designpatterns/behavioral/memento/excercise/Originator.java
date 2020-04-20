package com.designpatterns.behavioral.memento.excercise;

class Originator {
	private String fileName;

	private StringBuilder stateData;

	public Originator(String fileName) {
		this.fileName = fileName;
		stateData = new StringBuilder();
	}

	public String print() {
		return stateData.toString();
	}

	public void writeStateData(String state) {
		this.stateData.append(state);
	}

	// Create memento
	public Memento saveStateData() {
		return new Memento(this.fileName, this.stateData);
	}

	// Create undo for memento
	public void undoStateData(Object object) {
		Memento memento = (Memento) object;
		this.fileName = memento.fileName;
		this.stateData = memento.stateData;
	}

	private class Memento {
		private String fileName;

		private StringBuilder stateData;

		public Memento(String fileName, StringBuilder stateData) {
			this.fileName = fileName;
			this.stateData = new StringBuilder(stateData);
		}
	}
}
