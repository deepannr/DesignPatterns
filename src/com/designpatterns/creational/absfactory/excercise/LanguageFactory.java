package com.designpatterns.creational.absfactory.excercise;

public interface LanguageFactory {
	Language getLanguage(String language);
}

class LanguageFactoryImpl implements LanguageFactory {

	@Override
	public Language getLanguage(String language) {
		switch (language) {
		case Constants.TAMIL:
			return new KollyWoodMovie();

		case Constants.ENGLISH:
			return new HollyWoodMovie();
		}
		return null;
	}
}