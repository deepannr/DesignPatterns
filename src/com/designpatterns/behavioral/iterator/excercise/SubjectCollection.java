package com.designpatterns.behavioral.iterator.excercise;

interface SubjectCollection {
	Iterator createIterator();
	
	void printSubjects();
}

class SubjectCollectionImpl implements SubjectCollection {
	Subject[] subjects;
	
	final static int SUBJECTS = 6;
	
	private int position = 0;
	
	public SubjectCollectionImpl() {
		subjects = new Subject[SUBJECTS];
		addNewData("Mathematics");
		addNewData("Computer");
		addNewData("Economics");
		addNewData("Physics");
		addNewData("Commerce");
		addNewData("Science");
		addNewData("GK");
	}

	@Override
	public Iterator createIterator() {
		return new ArtsIterator(subjects);
	}
	
	private void addNewData(String name) {
		if (SUBJECTS == position) {
			System.err.println("Array Filled");
		} else {
			Subject subject = new Subject(name);
			subjects[position] = subject;
			++position;
		}
	}

	@Override
	public void printSubjects() {
		System.out.println("---Print All Subjects---");
		Iterator iterator = new ArtsIterator(subjects);
		iterator.first();
		while(!iterator.isDone()) {
			System.out.println(iterator.nextItem());
		}
		System.out.println("Current Iteration: " + iterator.currentItem());
		System.out.println("Resetting to first position");
		iterator.first();
		System.out.println("Current Iteration after reset: " + iterator.currentItem());
	}
}