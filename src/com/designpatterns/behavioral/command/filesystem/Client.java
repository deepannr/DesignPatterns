package com.designpatterns.behavioral.command.filesystem;

class Client {
	public static void main(String[] args) {
		// Create receiver
		FileSystemReceiver receiver = FileSystemInvokerUtil.getUnderlyingSystem();

		// Create command with the associated receiver
		Command openFile = new OpenFileCommand(receiver);

		// Create invoker to associate with the command
		FileInvoker openInvoker = new FileInvoker(openFile);

		openInvoker.execute();
	}

}
