package com.designpatterns.structural.adapter.clas;

interface IntegerInterface {
	public int getInteger();
}

class IntegerValue implements IntegerInterface {
	@Override
	public int getInteger() {
		return 10;
	}
}

class ClassAdapter extends IntegerValue {
	@Override
	public int getInteger() {
		return 10 + super.getInteger();
	}
}

class ObjectAdapter implements IntegerInterface {
	IntegerInterface integer;
	
	public ObjectAdapter(IntegerInterface integer) {
		this.integer = integer;
	}

	@Override
	public int getInteger() {
		return 20 + integer.getInteger();
	}
}