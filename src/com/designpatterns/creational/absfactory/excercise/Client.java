package com.designpatterns.creational.absfactory.excercise;

public class Client {

	public static void main(String[] args) {
		GenreFactory genFactory = MovieProducer.getGenre();
		LanguageFactory lngFactory = MovieProducer.getLanguage();

		Genre action = genFactory.getGenere(Constants.ACTION);
		action.movieGenre();

		Language tamil = lngFactory.getLanguage(Constants.TAMIL);
		tamil.movieType();

		Genre comedy = genFactory.getGenere(Constants.COMEDY);
		comedy.movieGenre();

		Language english = lngFactory.getLanguage(Constants.ENGLISH);
		english.movieType();
	}
}
