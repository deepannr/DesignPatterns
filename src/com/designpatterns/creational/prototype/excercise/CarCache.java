package com.designpatterns.creational.prototype.excercise;

import java.util.Hashtable;

public class CarCache {
	private static Hashtable<String, BasicCar> carMap = new Hashtable<>();

	public static BasicCar getCarCache(String carId) {
		BasicCar car = carMap.get(carId);
		System.out.println("Non Cloned Car : " + car);
		BasicCar clonedCar = (BasicCar) car.clone() ;
		System.out.println("Cloned Car : " + clonedCar);
		return clonedCar;
	}
	
	public static void loadCarCache() {
		Nano nano = new Nano();
		nano.setId("1");
		carMap.put(nano.getId(), nano);
		
		Ford ford = new Ford();
		ford.setId("2");
		carMap.put(ford.getId(), ford);
	}
}
