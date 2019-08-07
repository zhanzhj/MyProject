package com.design.adaper;

public class Adapter extends Adaptee implements Target {

	@Override
	public void request() {
		super.specificRequest();
	}
}
