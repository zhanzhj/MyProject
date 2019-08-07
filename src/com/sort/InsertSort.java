package com.sort;

/**
 * 在要排序的一组数中，假设前面(n-1)个数已经是排好序的，
 * 现在要把第N个数找到相应位置并插入
 * 使得这n个数也是排好顺序的。如此反复循环，直到全部拍好顺序
 * @author Alistar_Zhan
 */
public class InsertSort extends AbstractSort {

	public  InsertSort(int[] array) {
		super(array);
	}


	public void insertionSort(){
		int len = array.length;
		int counter = 1;

		for(int i = 1; i < len; i++){
			//存储待排序的元素值
			int temp = array[i];
			//与待排序元素值比较的元素的下标
			int insertPoint = i - 1;
			//当前元素比待排序元素大
			while (insertPoint >= 0 && array[insertPoint] > temp){
				//当前元素后移一位
				array[insertPoint + 1] = array[insertPoint];
				insertPoint--;
			}
			//找到了插入位置，插入待排序元素
			array[insertPoint + 1] = temp;

			System.out.print("第"+counter+"轮排序结果：");
			display();
			counter++;

		}
	}

	public static void main(String[] args){
		int[] array = {8,2,12,4,7,9,6,1};
		InsertSort sort = new InsertSort(array);
		sort.insertionSort();
	}

}
