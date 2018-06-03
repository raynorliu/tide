package com.ome.algorithm;

/**
 * 汉诺塔递归算法
 * 
 * @author Raynor
 *
 */
public class Hanoi {
	private static int count = 0;

	public static void moveHanoi(int n, char x, char y, char z) {

		// System.out.println("x= " + x);
		// System.out.println();
		// System.out.println();
		if (n == 1) {
			count++;
			System.out.println("if输出第" + count + "次 n=" + n + " x= " + x + " y= " + y + " z= " + z);
			System.out.println("if输出盘 " + n + " 从 " + x + " ---> " + z);
		} else {
			count++;
			System.out.println("else输出第" + count + "次 n=" + n + "x= " + x + " y= " + y + " z= " + z);
			moveHanoi(n - 1, x, z, y);
			// moveHanoi(1, x, y, z, count);
			System.out.println("else输出盘 " + n + " 从 " + x + " ---> " + z);
			moveHanoi(n - 1, y, x, z);
		}
	}

	public static void main(String[] args) {
		Hanoi.moveHanoi(3, 'x', 'y', 'z');
		System.out.println(count);
	}
}
