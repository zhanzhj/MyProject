package com.design.factory;

public class TestFactory {
	public static void main(String[] args){
		ICarFactory factory = null;

		//Bike
		factory = new BikeFactory();
		factory.getCar().gotoWork();

		//bus
		factory = new BusFactory();
		factory.getCar().gotoWork();
	}
}
