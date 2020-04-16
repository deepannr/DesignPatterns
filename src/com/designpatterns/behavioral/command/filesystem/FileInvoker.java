package com.designpatterns.behavioral.command.filesystem;

class FileInvoker {
	private Command command;

	public FileInvoker(Command command) {
		this.command = command;
	}
	
	public void execute() {
		command.execute();
	}
}