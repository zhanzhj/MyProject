package com.design.singleton;

/**
 * 懒汉式在调用取得实例方法的时候才会实例化对象。
 */
public class Singleton2 {

	private static Singleton2 singleton;

	private Singleton2(){

	}

	public static synchronized Singleton2 getSingleton(){
		if(singleton == null){
			singleton = new Singleton2();
		}
		return singleton;
	}
}
