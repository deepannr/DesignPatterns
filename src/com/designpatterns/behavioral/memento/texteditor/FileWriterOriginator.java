package com.designpatterns.behavioral.memento.texteditor;

class FileWriterOriginator {
	private String filename;

	private StringBuilder content;

	public FileWriterOriginator(String filename) {
		this.filename = filename;
		this.content = new StringBuilder();
	}

	@Override
	public String toString() {
		return content.toString();
	}

	public void write(String text) {
		this.content.append(text);
	}

	// Create memento
	public Memento save() {
		return new Memento(this.filename, this.content);
	}

	// Create undo for memento
	public void undoToLastSave(Object object) {
		Memento memento = (Memento) object;
		this.filename = memento.filename;
		this.content = memento.content;
	}

	private class Memento {
		private String filename;

		private StringBuilder content;

		public Memento(String filename, StringBuilder content) {
			this.filename = filename;
			this.content = new StringBuilder(content);
		}
	}
}
