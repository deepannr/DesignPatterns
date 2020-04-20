package com.designpatterns.behavioral.iterator.elements;

interface Iterator {
	boolean hasNext();
	
	Object next();
}

class ConcreteIterator implements Iterator {
	private Data[] dataList;
	
	// Maintains the current position
	private int position = 0;
	
	public ConcreteIterator(Data[] dataList) {
		this.dataList = dataList;
	}

	@Override
	public boolean hasNext() {
		if (position >= dataList.length || dataList[position] == null)
			return false;
		return true;
	}

	@Override
	public Object next() {
		Data data = dataList[position];
		++position;
		return data;
	}
}