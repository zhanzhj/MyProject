package com.design.singleton;

/**
 * 饿汉式单例
 * 饿汉式单例在单例类被加载时候，就实例化一个对象交给自己的引用
 */
public class Singleton {

	private static Singleton singleton = new Singleton();

	private Singleton(){

	}

	public static Singleton getSingleton(){
		return singleton;
	}

}
