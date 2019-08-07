package com.sort;

public abstract class AbstractSort {

	public int[] array;

	public AbstractSort(int[] array) {
		this.array = array;
	}

	public void display(){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	}
}
