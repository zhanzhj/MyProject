package com.design.singleton;

/**
 * 双重锁定的懒汉模式有致命缺陷-重排序导致的多线程访问可能获得一个未初始化的对象
 * 所以使用volatile禁止重排序
 */
public class VolatileDCLSingleton {

	private VolatileDCLSingleton() {
	}

	private static volatile VolatileDCLSingleton singleton;

	public static VolatileDCLSingleton getSingleton(){
		if(singleton == null){
			synchronized (VolatileDCLSingleton.class){
				if(singleton == null){
					singleton = new VolatileDCLSingleton();
				}
			}
		}
		return singleton;
	}
}
