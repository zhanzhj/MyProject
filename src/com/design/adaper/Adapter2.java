package com.design.adaper;

public class Adapter2 implements Target{

	private Adaptee adaptee;

	public Adapter2(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void request() {
		this.adaptee.specificRequest();
	}
}
