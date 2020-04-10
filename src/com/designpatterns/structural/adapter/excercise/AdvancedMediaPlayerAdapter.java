package com.designpatterns.structural.adapter.excercise;

class AdvancedMediaPlayerAdapter implements MediaPlayer {
	private AdvancedMediaPlayer advMediaPlayer;
	private MediaPlayer mp3Player;
	
	public AdvancedMediaPlayerAdapter(AdvancedMediaPlayer advMediaPlayer) {
		this.advMediaPlayer = advMediaPlayer;
	}

	@Override
	public void play(String audioType, String fileName) {
		if ("mp3".equalsIgnoreCase(audioType)) {
			mp3Player = new AudioPlayer();
			mp3Player.play(audioType, fileName);
		} else if ("mp4".equalsIgnoreCase(audioType)) {
			System.out.println("Loads AudioType : " + audioType + " file name : " + fileName);
			advMediaPlayer.loadFileName(fileName);
			advMediaPlayer.listen();
		} else {
			System.out.println("Invalid format " + audioType);
		}
	}
}
