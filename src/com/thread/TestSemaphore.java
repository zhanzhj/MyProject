package com.thread;

import java.util.concurrent.Semaphore;

public class TestSemaphore {

	public static void main(String[] args){
		int N = 8;
		//机器数目
		Semaphore semaphore = new Semaphore(5);
		for (int i = 0; i<N; i++){
			new Worker(i,semaphore).start();
		}
	}

	static class Worker extends Thread{
		Semaphore semaphore;
		int num;
		public Worker(int i, Semaphore semaphore) {
			this.num = i;
			this.semaphore = semaphore;
		}
		@Override
		public void run(){
			try {
				semaphore.acquire();
				System.out.println("工人"+ num +"占用一个机器");
				Thread.sleep(2000);
				System.out.println("工人"+ num +"释放一个机器");
				semaphore.release();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
