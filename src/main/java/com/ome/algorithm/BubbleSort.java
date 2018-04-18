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
	 * 第一种的冒泡排序算法<br>
	 * 总循环次数为54次
	 * 
	 * @param arr
	 */
	public void firstAlgorithm(int[] arr) {
		int count = 0;// 用于统计该算法总循环次数
		int k;
		int flag = arr.length;
		while (flag > 0) {
			count += 1;
			k = flag;
			flag = 0;// 设置while退出条件

			for (int i = 1; i < k; i++) {
				count += 1;
				if (arr[i - 1] > arr[i]) {
					int temp;
					temp = arr[i - 1];
					arr[i - 1] = arr[i];
					arr[i] = temp;
					flag = i;
				}
			}
		}
		System.out.println("该算法总计循环次数为: " + count);
		System.out.println("排序后的数组元素arr = " + Arrays.toString(arr));
	}

	/**
	 * 第二种的冒泡排序算法<br>
	 * 总循环次数为54次
	 * 
	 * @param arr
	 */
	public void secondAlgorithm(int[] arr) {
		int count = 0;// 用于统计该算法总循环次数
		int k = arr.length;
		boolean flag = true;
		while (flag) {
			flag = false;// 设置while退出条件
			count += 1;

			for (int i = 1; i < k; i++) {
				count += 1;
				if (arr[i - 1] > arr[i]) {
					int temp;
					temp = arr[i - 1];
					arr[i - 1] = arr[i];
					arr[i] = temp;
					flag = true;
				}
			}
			k--;// 减小一次排序的尾边界
		}
		System.out.println("该算法总计循环次数为: " + count);
		System.out.println("排序后的数组元素arr = " + Arrays.toString(arr));
	}

	/**
	 * 第三种冒泡排序算法<br>
	 * 总循环次数为55次
	 * 
	 * @param arr
	 */
	public void thirdAlgorithm(int[] arr) {
		int count = 0;// 用于统计该算法总循环次数
		for (int i = 0; i < arr.length; i++) {
			count += 1;
			for (int j = 1; j < arr.length - i; j++) {
				count += 1;
				int temp;
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("该算法总计循环次数为: " + count);
		System.out.println("排序后的数组元素arr = " + Arrays.toString(arr));
	}

	/**
	 * 第四种的冒泡排序算法<br>
	 * 总循环次数为56次
	 * 
	 * @param arr
	 */
	public void fourthlyAlgorithm(int[] arr) {
		int count = 0;// 用于统计该算法总循环次数
		for (int i = arr.length; i > -1; i--) {
			count += 1;
			// 每次第二层循环走完后数组中最大的值都会排在最后,因此下一次进入该循环时只需判断拍好序之前的元素即可。
			for (int j = 1; j < i; j++) {
				count += 1;
				int temp;
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("该算法总计循环次数为: " + count);
		System.out.println("排序后的数组元素arr = " + Arrays.toString(arr));
	}

	/**
	 * 第五种冒泡排序算法<br>
	 * 总循环次数为100次
	 * 
	 * @param arr
	 */
	public void fifthAlgorithm(int[] arr) {
		int count = 0;// 用于统计该算法总循环次数
		for (int i = 0; i < arr.length; i++) {
			count += 1;
			for (int j = 1; j < arr.length; j++) {
				count += 1;
				int temp;
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("该算法总计循环次数为: " + count);
		System.out.println("排序后的数组元素arr = " + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		// bubbleSort.firstAlgorithm(arr);
		// bubbleSort.secondAlgorithm(arr);
		// bubbleSort.thirdAlgorithm(arr);
		// bubbleSort.fourthlyAlgorithm(arr);
		// bubbleSort.fifthAlgorithm(arr);
	}
}
