package com.designpatterns.creational.prototype.excercise;

public class Client {

	public static void main(String[] args) {
		CarCache.loadCarCache();
		
		BasicCar nano = CarCache.getCarCache("1");
		nano.getCar();
		
		BasicCar ford = (BasicCar) CarCache.getCarCache("2");
		ford.getCar();
	}
}
