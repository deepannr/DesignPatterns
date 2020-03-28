package com.designpatterns.creational.absfactory.excercise;

public class MovieProducer {
	public static LanguageFactory getLanguage() {
		return new LanguageFactoryImpl();
	}
	
	public static GenreFactory getGenre() {
		return new GenreFactoryImpl();
	}
}
