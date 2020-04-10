package com.designpatterns.structural.adapter.excercise;

interface AdvancedMediaPlayer {
	void loadFileName(String fileName);

	void listen();
}

class VLCPlayer implements AdvancedMediaPlayer {
	private String fileName;

	@Override
	public void loadFileName(String fileName) {
		this.fileName = fileName;
		
	}

	@Override
	public void listen() {
		System.out.println("VLCPlayer Playing file: " + fileName);
	}
	
}

class MP4Player implements AdvancedMediaPlayer {
	private String fileName;

	@Override
	public void loadFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void listen() {
		System.out.println("MP4Player Playing File: " + fileName);
	}
	
}