package com.designpatterns.behavioral.iterator.excercise;

class Client {
	public static void main(String[] args) {
		SubjectCollection subjects= new SubjectCollectionImpl();
		subjects.printSubjects();
	}
}