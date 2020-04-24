package com.designpatterns.behavioral.visitor.excercise;

interface ItemElement {
	double acceptVisitor(PostageFareVisitor visitor);
}

class Book implements ItemElement {
	private int bookWeight;
	
	public Book(int bookWeight) {
		this.bookWeight = bookWeight;
	}
	
	public int getBookWeight() {
		return bookWeight;
	}

	@Override
	public double acceptVisitor(PostageFareVisitor visitor) {
		return visitor.visitItem(this);
	}
}


class CD implements ItemElement {
	private int cdWeight;
	
	public CD(int cdWeight) {
		this.cdWeight = cdWeight;
	}
	
	public int getCdWeight() {
		return cdWeight;
	}

	@Override
	public double acceptVisitor(PostageFareVisitor visitor) {
		return visitor.visitItem(this);
	}
}

class DVD implements ItemElement {
	private int dvdWeight;
	
	public DVD(int dvdWeight) {
		this.dvdWeight = dvdWeight;
	}
	
	public int getDvdWeight() {
		return dvdWeight;
	}

	@Override
	public double acceptVisitor(PostageFareVisitor visitor) {
		return visitor.visitItem(this);
	}
}