package com.designpatterns.behavioral.memento.texteditor;

class FileWriterCareTaker {
	private Object object;

	public void save(FileWriterOriginator originator) {
		this.object = originator.save();
	}

	public void undo(FileWriterOriginator originator) {
		originator.undoToLastSave(object);
	}

}
