package com.designpatterns.behavioral.iterator.excercise;

interface Iterator {
	void first();
	
	String nextItem();
	
	boolean isDone();
	
	String currentItem();
}

class ArtsIterator implements Iterator {
	private Subject[] subjects;
	
	private int position;
	
	public ArtsIterator(Subject[] subjects) {
		this.subjects = subjects;
	}

	@Override
	public void first() {
		position = 0;
	}

	@Override
	public String nextItem() {
		return subjects[position++].getSubject();
	}

	@Override
	public boolean isDone() {
		return (position == subjects.length) ? true : false;
	}

	@Override
	public String currentItem() {
		return (position >= subjects.length) ? subjects[--position].getSubject() : subjects[position].getSubject();
	}
}