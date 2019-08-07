package com.sort;

public class ShellSort {

	static void shellSort(int[] array, int len){
		int i,j;
		//增量
		int increment = len;
		int key;
		while (increment > 1) {
			increment = increment/3 + 1;
			for (i = increment; i < len; i++){
				//从[0]开始，对相距增量步长的元素集合进行修改
				key = array[i];
				//以下和直接插入排序类似
				j = i - increment;
				while (j>=0){
					if(key < array[j]){
						int temp = array[j];
						array[j] = key;
						array[j + increment] = temp;
					}
					j = j - increment;
				}
			}
		}
	}

	public static void main(String[] args){
		int src_ary[] = {9,1,5,8,3,7,6,0,2,4};
		for(int i = 0; i < src_ary.length; i++){
			System.out.print(src_ary[i]+ " , ");
		}
		System.out.println();
		shellSort(src_ary, src_ary.length);
		for(int i = 0; i < src_ary.length; i++){
			System.out.print(src_ary[i]+ " , ");
		}
		System.out.println();

	}
}
