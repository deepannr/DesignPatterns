package com.designpatterns.behavioral.command.filesystem;

interface FileSystemReceiver {
	void openFile();

	void writeFile();

	void saveFile();

	void closeFile();
}

class UnixFileSystemReceiver implements FileSystemReceiver {
	@Override
	public void openFile() {
		System.out.println("Open File on Unix OS");
	}

	@Override
	public void writeFile() {
		System.out.println("Write File on Unix OS");		
	}

	@Override
	public void saveFile() {
		System.out.println("Save File on Unix OS");
	}

	@Override
	public void closeFile() {
		System.out.println("Close File on Unix OS");		
	}
}


class WindowsFileSystemReceiver implements FileSystemReceiver {
	@Override
	public void openFile() {
		System.out.println("Open File on Windows OS");
	}

	@Override
	public void writeFile() {
		System.out.println("Write File on Windows OS");		
	}

	@Override
	public void saveFile() {
		System.out.println("Save File on Windows OS");
	}

	@Override
	public void closeFile() {
		System.out.println("Close File on Windows OS");		
	}
}