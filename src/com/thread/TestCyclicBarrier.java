package com.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class TestCyclicBarrier {
	public static void main(String[] args){
		int parties = 4;
		CyclicBarrier barrier = new CyclicBarrier(parties);
		for(int i = 0; i < parties; i++){
			new Writer(barrier).start();
		}
	}

	private static class Writer extends Thread{
		private CyclicBarrier cyclicBarrier;
		public Writer(CyclicBarrier barrier) {
			this.cyclicBarrier = barrier;
		}

		@Override
		public void run(){
			System.out.println("子线程"+ Thread.currentThread().getName()+"正在执行");
			try {
				Thread.sleep(3000);
				System.out.println("子线程"+ Thread.currentThread().getName()+"执行完毕");
				cyclicBarrier.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				e.printStackTrace();
			}
			System.out.println("所有线程执行完毕");
		}
	}
}
