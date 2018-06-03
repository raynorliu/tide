package com.ome.algorithm;

/**
 * 算法类
 * 
 * @author Raynor
 *
 */
public class Factorial {
	/**
	 * 阶乘迭代算法
	 * 
	 * @param n
	 * @return
	 */
	public static long factorialIteration(int n) {
		long sum = n;
		for (int i = 1; i < n; i++) {
			sum *= i;
		}
		return sum;
	}

	/**
	 * 阶乘递归算法
	 * 
	 * @param n
	 * @return
	 */
	public static long factorialIecursion(int n) {
		if (n == 1)
			return 1;
		return n * factorialIecursion(n - 1);
	}

	public static void main(String[] args) {
		System.out.println(Factorial.factorialIecursion(5));
	}
}
