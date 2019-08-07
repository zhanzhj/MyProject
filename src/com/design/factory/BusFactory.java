package com.design.factory;

public class BusFactory implements ICarFactory{
	@Override
	public Car getCar() {
		return new Bus();
	}
}
