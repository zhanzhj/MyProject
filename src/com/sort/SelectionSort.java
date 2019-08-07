package com.sort;

/**
 * 选择排序，从第一个元素开始，扫描整个待排序数组，
 * 找到最小的元素之后再与第一个元素交换位置，
 * 然后再从第二个元素开始，继续寻找最小的元素与第二个元素交换位置，依次类推
 * @author Alistar_Zhan
 */
public class SelectionSort extends AbstractSort {


	public SelectionSort(int[] array) {
		super(array);
	}

	public void selectionSort(){
		//存储最小元素的下标
		int minPoint;
		int len = array.length;
		int temp;
		int counter = 1;
		for(int i = 0; i < len - 1; i++){
			minPoint = i;
			//每完成一轮排序，就确定了一个相对最小元素，下一轮排序只对后面的元素排序
			for(int j = i + 1; j <= len - 1; j++){
				//如果待排序数组中的某个元素比当前元素小，minPoint指向该元素的下标
				if(array[j] < array[minPoint]){
					minPoint = j;
				}
			}

			//如果发现了更小的元素，交换位置
			if(minPoint != i){
				temp = array[i];
				array[i] = array[minPoint];
				array[minPoint] = temp;
			}

			System.out.print("第"+counter+"轮排序结果：");
			display();
			counter++;
		}
	}
}
