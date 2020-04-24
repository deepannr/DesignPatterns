package com.designpatterns.behavioral.visitor.excercise;

interface PostageFareVisitor {
	double visitItem(Book book);

	double visitItem(CD cd);

	double visitItem(DVD dvd);
}

class PostageFareVisitorImpl implements PostageFareVisitor {
	@Override
	public double visitItem(Book book) {
		return book.getBookWeight() * 2;
	}

	@Override
	public double visitItem(CD cd) {
		return cd.getCdWeight() * 2.5;
	}

	@Override
	public double visitItem(DVD dvd) {
		return dvd.getDvdWeight() * 3;
	}
}