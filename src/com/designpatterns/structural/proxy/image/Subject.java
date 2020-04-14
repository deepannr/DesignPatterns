package com.designpatterns.structural.proxy.image;

interface Subject {
	void request();
}

class RealSubjectImpl implements Subject {
	private String fileName;
	
	public RealSubjectImpl(String fileName) {
		this.fileName = fileName;
		loadFromDisk();
	}
	
	@Override
	public void request() {
		System.out.println("Displaying the file " + fileName);
	}
	
	private void loadFromDisk() {
		System.out.println("Loading " + fileName);
	}
	
}