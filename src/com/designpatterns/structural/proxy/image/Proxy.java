package com.designpatterns.structural.proxy.image;

class Proxy implements Subject {
	private String fileName;
	private RealSubjectImpl realSubject;

	public Proxy(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void request() {
		if (null == realSubject) {
			realSubject = new RealSubjectImpl(fileName);
		}
		realSubject.request();
	}
}
