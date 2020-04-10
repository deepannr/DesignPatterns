package com.designpatterns.structural.adapter.excercise;

interface MediaPlayer {
	void play(String audioType, String fileName);
}

class AudioPlayer implements MediaPlayer {
	@Override
	public void play(String audioType, String fileName) {
		if ("mp3".equalsIgnoreCase(audioType)) {
			System.out.println("Play Audio type: " + audioType + " File: " + fileName);
		} else {
			System.out.println("Invalid audio type " + audioType);
		}
	}
}