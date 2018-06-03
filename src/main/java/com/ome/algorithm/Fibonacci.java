package com.ome.algorithm;

/**
 * 斐波那契数算法类 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
 * 
 * @author Raynor
 *
 */
public class Fibonacci {

	/**
	 * 斐波那契数递归算法
	 * 
	 * @param n
	 * @return
	 */
	public static int fibonacciRecursion(int n) {
		if (n < 3) {
			return 1;
		}
		return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
	}

	public static int fibonacciIteration(int n) {
		int n1 = 1;
		int n2 = 1;
		int n3 = 1;
		if (n <= 2) {
			return 1;
		} else {
			for (int j = n; j > 2; j--) {
				n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
			}
//			while (n > 2) {
//				n3 = n1 + n2;
//				n1 = n2;
//				n2 = n3;
//				n--;
//			}
		}
		return n3;
	}

	public static void main(String[] args) {
		System.out.println(Fibonacci.fibonacciIteration(8));
	}
}
