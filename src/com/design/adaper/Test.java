package com.design.adaper;

public class Test {
	public static void main(String []args){
		Target target = new Adapter();
		target.request();

		Target target1 = new Adapter2(new Adaptee());
		target1.request();
	}
}
