package com.ome.algorithm;

import java.util.Arrays;

/**
 * 冒泡排序的4种算法
 * 
 * @author Raynor
 *
 */
public class BubbleSort {
	private static int[] arr = { 5, 4, 7, 9, 8, 3, 10, 6, 1, 2 };

	/**
	 * 最慢的冒泡排序算法<br>
	 * 总循环次数为100次
	 * 
	 * @param arr
	 */
	public void fourthlyFastAlgorithm(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count += 1;
			for (int j = 0; j < arr.length - 1; j++) {
				count += 1;
				int temp;
				if (arr[j] > arr[j + 1]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("该算法总计循环次数为: " + count);
		System.out.println("排序后的数组元素arr = " + Arrays.toString(arr));
	}

	/**
	 * 第二快的冒泡排序算法<br>
	 * 总循环次数为56次
	 * 
	 * @param arr
	 */
	public void secondFastAlgorithm(int[] arr) {
		int count = 0;// 用于统计该算法总循环次数
		for (int i = arr.length; i > -1; i--) {
			count += 1;
			// 每次第二层循环走完后数组中最大的值都会排在最后,因此下一次进入该循环时只需判断拍好序之前的元素即可。
			for (int j = 0; j < i - 1; j++) {
				count += 1;
				int temp;
				if (arr[j] > arr[j + 1]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("该算法总计循环次数为: " + count);
		System.out.println("排序后的数组元素arr = " + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.fourthlyFastAlgorithm(arr);
	}
}
