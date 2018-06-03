package com.ome.algorithm;

import java.util.Arrays;

/**
 * 冒泡排序的4种算法
 * 
 * @author Raynor
 *
 */
public class BubbleSort {
	// private static int[] arr = { 5, 4, 7, 9, 8, 3, 10, 6, 1, 2 };
	private static int[] arr = { 5, 4, 7, 9, 8, 3, 9, 10, 11, 12 };

	/**
	 * 第一种的冒泡排序算法<br>
	 * 总循环次数为54次
	 * 
	 * 比如，现在有一个包含1000个数的数组，仅前面100个无序，后面900个都已排好序且都大于前面100个数字，
	 * 那么在第一趟遍历后，最后发生交换的位置必定小于100，且这个位置之后的数据必定已经有序了，也就是这个位置以后的数据不需要再排序了，
	 * 于是记录下这位置，第二次只要从数组头部遍历到这个位置就可以了。
	 * 
	 * @param arr
	 */
	public void firstAlgorithm(int[] arr) {
		int count = 0;// 用于统计该算法总循环次数
		int k;
		int flag = arr.length;
		while (flag > 0) {
			count += 1;
			k = flag; // 记录遍历的尾边界
			flag = 0;// 设置while退出条件

			for (int i = 1; i < k; i++) {
				count += 1;
				if (arr[i - 1] > arr[i]) {
					System.out.println(i);
					int temp;
					temp = arr[i - 1];
					arr[i - 1] = arr[i];
					arr[i] = temp;
					flag = i;// 记录最新的尾边界
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

	/**
	 * 求四分位距
	 * 
	 * @param arr
	 */
	public float numerationIQR(int[] arr) {
		float Q2;// 中位数
		float Q1;// 下四分位数
		float Q3;// 上四分位数
		float IQR = 0; // 四分位距
		int j;
		int[] arrQ1;// 存放下四分位的数列
		int[] arrQ3;// 存放上四分位的数列

		// 对列表排序
		Arrays.sort(arr);
		// 计算四分位距
		if (arr.length % 2 == 0) {// 列表为总数量为偶数
			System.out.println("进入偶数列表算法");
			j = arr.length / 2;

			// 计算下中位数
			Q2 = (arr[j - 1] + (arr[j])) / 2;
			System.out.println("中位数Q2= " + Q2);

			// 判断下分位距的元素列表的数量是基数还是偶数
			arrQ1 = Arrays.copyOfRange(arr, 0, j);
			arrQ3 = Arrays.copyOfRange(arr, j, arr.length);
			System.out.println(Arrays.toString(arrQ1));
			System.out.println(Arrays.toString(arrQ3));

			if (arrQ1.length % 2 == 0) {
				// 计算下四分位数
				Q1 = (float) (arrQ1[arrQ1.length / 2] + arrQ1[(arrQ1.length / 2) - 1]) / 2;
				System.out.println("下四分位数Q1 = " + Q1);

				// 计算上四分位数

				Q3 = (float) (arrQ3[arrQ3.length / 2] + arrQ3[(arrQ3.length / 2) - 1]) / 2;
				System.out.println("上四分位数Q3 = " + Q3);
			} else {
				// 计算下四分位数
				Q1 = arrQ1[(arrQ1.length - 1) / 2];
				System.out.println("下四分位数Q1 = " + Q1);

				// 计算上四分位数
				Q3 = arrQ3[(arrQ1.length - 1) / 2];
				System.out.println("上四分位数Q3 = " + Q3);

			}
			// 计算四分位距
			IQR = Q3 - Q1;
			System.out.println("四分位距IQR = Q3 - Q1 = " + Q3 + " - " + Q1 + " = " + IQR);
		} else {
			System.out.println("进入奇数列表算法");
			j = (arr.length - 1) / 2;
			// 计算下中位数
			Q2 = arr[j];
			System.out.println("中位数Q2= " + Q2);

			// 判断下分位距的元素列表的数量是基数还是偶数
			arrQ1 = Arrays.copyOfRange(arr, 0, j);
			arrQ3 = Arrays.copyOfRange(arr, j + 1, arr.length);
			System.out.println(Arrays.toString(arrQ1));
			System.out.println(Arrays.toString(arrQ3));
			if (arrQ1.length % 2 == 0) {
				// 计算下四分位数
				Q1 = (float) (arrQ1[(arrQ1.length / 2) - 1] + arrQ1[(arrQ1.length / 2)]) / 2;
				System.out.println("下四分位数Q1 = " + Q1);

				// 计算上四分位数
				Q3 = (float) (arrQ3[(arrQ3.length / 2) - 1] + arrQ3[arrQ3.length / 2]) / 2;
				System.out.println("上四分位数Q3 = " + Q3);
			} else {
				Q1 = arrQ1[(arrQ1.length - 1) / 2];
				System.out.println("下四分位数Q1 = " + Q1);

				// 计算上四分位数
				Q3 = arrQ3[(arrQ3.length - 1) / 2];
				System.out.println("上四分位数Q3 = " + Q3);
			}
			// 计算四分位距
			IQR = Q3 - Q1;
			System.out.println("四分位距IQR = Q3 - Q1 = " + Q3 + " - " + Q1 + " = " + IQR);
		}
		return IQR;
	}

	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		// bubbleSort.firstAlgorithm(arr);
		// bubbleSort.secondAlgorithm(arr);
		// bubbleSort.thirdAlgorithm(arr);
		// bubbleSort.fourthlyAlgorithm(arr);
		// bubbleSort.fifthAlgorithm(arr);
		// int[] list = { 7, 9, 9, 10, 10, 10, 11, 12, 12, 14 };
		// int[] list = { 4, 5, 6, 7, 10, 11, 12, 14, 15 };
		// int[] list = { 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15 };
		// int[] list = { 3, 4, 4, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18 };
		 int[] list = { 3, 4, 4, 5, 5, 5, 6, 7 };
		 bubbleSort.numerationIQR(list);
	}
}
