package com.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLock {

	public static Lock lock = new ReentrantLock();

	public static void main(String[] args){

		for(int i = 0; i < 5; i++){
			Thread thread = new Thread(()->{
				lock.lock();
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}finally {
					lock.unlock();
				}
			});
			thread.start();
		}
	}
}
