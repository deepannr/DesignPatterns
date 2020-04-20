package com.designpatterns.behavioral.iterator.elements;

interface DataCollection {
	Iterator createIterator();
	
	void printData();
}

class CollectionDataImpl implements DataCollection {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	Data[] dataList; 
	

	public CollectionDataImpl() {
		dataList = new Data[MAX_ITEMS];
		addItems("Notification 1");
		addItems("Notification 2");
		addItems("Notification 3");
		addItems("Notification 4");
	}


	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(dataList);
	}
	
	private void addItems(String text) {
		if (numberOfItems == MAX_ITEMS) {
			System.err.println("Can't add new Items");
		} else {
			Data data = new Data(text);
			dataList[numberOfItems] = data;
			++numberOfItems;
		}
	}
	
	@Override
	public void printData() {
		Iterator iterator = createIterator();
		while(iterator.hasNext()) {
			Data notification = (Data)iterator.next();
			System.out.println(notification.getData());
		}
	}
}