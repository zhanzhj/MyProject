package com.design.factory;

public class Bike implements Car{
	@Override
	public void gotoWork() {
		System.out.println("骑自行车去上班");
	}
}
