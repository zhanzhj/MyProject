package com.sort;

public class BubbleSort {

	private int[] array;

	public BubbleSort(int[] array) {
		this.array = array;
	}

	public void display(){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	}

	public void bubbleSort(){
		int temp;
		int len = array.length;
		//外层循环：每循环一次就确定了一个相对最大元素
		for(int i = 0; i < len - 1; i++){
			//内层循环：有i个元素已经排好，根据i确定本次的比较次数
			for(int j = 1; j < len - i; j++){
				if(array[j-1] > array[j]){
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
			System.out.print("第"+(i+1)+"轮排序结果：");
			display();
		}
	}

	/**
	 * 最简单的改进方法是加入一标志性变量exchange，
	 * 用于标志某一趟排序过程中是否有数据交换，
	 * 如果进行某一趟排序时并没有进行数据交换，
	 * 则说明数据已经按要求排列好，可立即结束排序
	 */
	public void bubbleSort_improvement_1(){
		int temp;
		int len = array.length;
		for(int i = 0; i < len - 1; i++){
			boolean exchange = false;
			for(int j = 1; j < len - i; j++){
				if(array[j-1] > array[j]){
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;

					//发生了交换操作
					if(!exchange){
						exchange = true;
					}
				}
			}
			System.out.print("第"+(i+1)+"轮排序结果：");
			display();

			//如果上一轮没有发生交换数据，证明已经是有序的了，结束排序
			if(!exchange)
				break;

		}
	}


	public static void main(String[] args){
		int[] arr = {3, 6, 4, 2, 11, 10, 5};
		BubbleSort sort = new BubbleSort(arr);
		sort.display();
		//sort.bubbleSort();
		sort.bubbleSort_improvement_1();
	}



















}
