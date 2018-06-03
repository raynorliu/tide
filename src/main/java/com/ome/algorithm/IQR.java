package com.ome.algorithm;

import java.util.Arrays;

/**
 * 求四分位数
 * @author Raynor
 *
 */
public class IQR {
	/**
	 * 下四分位数
	 */
	private float Q1;
	/**
	 * 中位数
	 */
	private float Q2;
	/**
	 * 上四分位数
	 */
	private float Q3;
	/**
	 * 四分位间距
	 */
	private float IQR = 0;

	public float getQ1() {
		return Q1;
	}

	public void setQ1(float q1) {
		Q1 = q1;
	}

	public float getQ2() {
		return Q2;
	}

	public void setQ2(float q2) {
		Q2 = q2;
	}

	public float getQ3() {
		return Q3;
	}

	public void setQ3(float q3) {
		Q3 = q3;
	}

	public float getIQR() {
		return IQR;
	}

	public void setIQR(float iQR) {
		IQR = iQR;
	}

	public IQR(float q1, float q2, float q3, float iQR) {
		super();
		Q1 = q1;
		Q2 = q2;
		Q3 = q3;
		IQR = iQR;
	}

	public IQR() {
		super();
	}

	@Override
	public String toString() {
		return "\n下四分位数Q1 = " + Q1 + "\n中位数Q2 = " + Q2 + "\n上四分位数Q3 = " + Q3 + "\n四分位间距IQR = " + IQR;
	}

	/**
	 * 计算四分位数
	 * 
	 * @param arr
	 * @return
	 */
	public void numerationIQR(int[] arr) {
		IQR iQR = new IQR();
		int j;
		int[] arrQ1;// 存放下四分位的数列
		int[] arrQ3;// 存放上四分位的数列

		// 首先对列表排序
		Arrays.sort(arr);

		if (arr.length % 2 == 0) {// 列表为总数量为偶数
			System.out.println("-----进入偶数列表算法-----");
			j = arr.length / 2;

			// 计算下中位数
			Q2 = (arr[j - 1] + (arr[j])) / 2;

			// 判断下分位距的元素列表的数量是基数还是偶数
			arrQ1 = Arrays.copyOfRange(arr, 0, j);
			arrQ3 = Arrays.copyOfRange(arr, j, arr.length);

			if (arrQ1.length % 2 == 0) {
				// 计算下四分位数
				Q1 = (float) (arrQ1[arrQ1.length / 2] + arrQ1[(arrQ1.length / 2) - 1]) / 2;
				System.out.println("下四分位数Q1 = " + Q1);

				// 计算上四分位数

				Q3 = (float) (arrQ3[arrQ3.length / 2] + arrQ3[(arrQ3.length / 2) - 1]) / 2;
			} else {
				// 计算下四分位数
				Q1 = arrQ1[(arrQ1.length - 1) / 2];

				// 计算上四分位数
				Q3 = arrQ3[(arrQ1.length - 1) / 2];
			}
			// 计算四分位距
			IQR = Q3 - Q1;
		} else {
			System.out.println("-----进入奇数列表算法-----");
			j = (arr.length - 1) / 2;
			// 计算下中位数
			Q2 = arr[j];
			System.out.println("中位数Q2= " + Q2);

			// 判断下分位距的元素列表的数量是基数还是偶数
			arrQ1 = Arrays.copyOfRange(arr, 0, j);
			arrQ3 = Arrays.copyOfRange(arr, j + 1, arr.length); 
			if (arrQ1.length % 2 == 0) {
				// 计算下四分位数
				Q1 = (float) (arrQ1[(arrQ1.length / 2) - 1] + arrQ1[(arrQ1.length / 2)]) / 2;

				// 计算上四分位数
				Q3 = (float) (arrQ3[(arrQ3.length / 2) - 1] + arrQ3[arrQ3.length / 2]) / 2;
			} else {
				Q1 = arrQ1[(arrQ1.length - 1) / 2];

				// 计算上四分位数
				Q3 = arrQ3[(arrQ3.length - 1) / 2];
			}
			// 计算四分位距
			IQR = Q3 - Q1;
		}
	}

	public static void main(String[] args) {
		IQR iQR = new IQR();
		int[] list = { 7, 9, 9, 10, 10, 10, 11, 12, 12, 14 };
		iQR.numerationIQR(list);
		System.out.println("列表" + Arrays.toString(list) + "的四分位数为\n" + iQR.toString());
	}
}
