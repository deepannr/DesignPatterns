package com.designpatterns.behavioral.command.filesystem;

interface Command {
	void execute();
}

class OpenFileCommand implements Command {
	private FileSystemReceiver receiver;
	
	public OpenFileCommand(FileSystemReceiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		System.out.println("Execute Open File...");
		receiver.openFile();
	}
}

class WriteFileCommand implements Command {
	private FileSystemReceiver fileSystem;
	
	public WriteFileCommand(FileSystemReceiver receiver) {
		this.fileSystem = receiver;
	}

	@Override
	public void execute() {
		System.out.println("Execute Write File...");
		fileSystem.writeFile();
	}
}

class SaveFileCommand implements Command {
	private FileSystemReceiver fileSystem;
	
	public SaveFileCommand(FileSystemReceiver receiver) {
		this.fileSystem = receiver;
	}

	@Override
	public void execute() {
		System.out.println("Execute Save File...");
		fileSystem.saveFile();
	}
}

class CloseFileCommand implements Command {
	private FileSystemReceiver fileSystem;
	
	public CloseFileCommand(FileSystemReceiver receiver) {
		this.fileSystem = receiver;
	}

	@Override
	public void execute() {
		System.out.println("Execute Close File...");
		fileSystem.closeFile();
	}
}