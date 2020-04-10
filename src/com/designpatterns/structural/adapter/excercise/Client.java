package com.designpatterns.structural.adapter.excercise;

public class Client {

	public static void main(String[] args) {
		
		AdvancedMediaPlayer advMediaPlayer = new VLCPlayer();
		advMediaPlayer.loadFileName("dssh.mp4");
		advMediaPlayer.listen();
		
		MediaPlayer adapter = new AdvancedMediaPlayerAdapter(advMediaPlayer);
		System.out.println("\n---MP3---");
		adapter.play("MP3", "another.mp3");
		System.out.println("\n---MP4---");
		adapter.play("MP4", "another.mp4");
		System.out.println("\n---AVI---");
		adapter.play("avi", "another.avi");
	}

}
