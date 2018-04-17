package com.ome.algorithm;

import java.util.Arrays;
/**
 * 冒泡排序的4序算法
 * @author Raynor
 *
 */
public class BubbleSort {
	private static int[] arr = { 5, 4, 7, 9, 8, 3, 10, 6, 1, 2 };
	
	/**
	 * 第一快算法
	 * @param arr
	 */
	public void firstFastAlgorithm(int[] arr) {
		int count = 0;
		for (int i = arr.length; i > -1; i--) {
			count += 1;
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
	
	
	/**
	 * 第二快算法
	 * @param arr
	 */
	public void secondFastAlgorithm(int[] arr) {
		int count = 0;
		for (int i = arr.length; i > -1; i--) {
			count += 1;
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
		BubbleSort bubbleSort =new BubbleSort();
		bubbleSort.secondFastAlgorithm(arr);
	}
}
