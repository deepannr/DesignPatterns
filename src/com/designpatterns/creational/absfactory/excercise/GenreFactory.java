package com.designpatterns.creational.absfactory.excercise;

public interface GenreFactory {
	Genre getGenere(String genre);
}

class GenreFactoryImpl implements GenreFactory {
	@Override
	public Genre getGenere(String genre) {
		switch (genre) {
		case Constants.ACTION:
			return new Action();

		case Constants.COMEDY:
			return new Comedy();
		}
		return null;
	}
}