package com.ome.mianshiti;

public class DaffodilNumber {

	/**
	 * 求能被3整除的水仙花数
	 */
	public void countDaffodil() {
		int a, b, c;
		for (int i = 100; i < 1000; i++) {
			a = i / 100;
			b = (i % 100) / 10;
			c = i % 10;

			if (a * a * a + b * b * b + c * c * c == i) {
				if (i % 3 == 0) {
					System.out.println(i);
				}
			}
		}
	}

	public static void main(String[] args) {
		DaffodilNumber dn = new DaffodilNumber();
		dn.countDaffodil();
	}
}
