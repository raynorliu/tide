package com.ome.mianshiti;

public class CountString {
	private int spaceCount = 0; // 空格出现的次数
	private int numberCount = 0; // 数字出现的次数
	private int letterCount = 0; // 字母出现的次数
	private int othersCount = 0; // 其他出现的次数

	/**
	 * 统计传入字符串字母、数字、空格和其他字符出现的次数
	 * 
	 * @param str
	 *            出入的字符串对象
	 */
	public void countString(String str) {
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {

			if (Character.isLetter(charArray[i])) {
				letterCount++;
			} else if (Character.isDigit(charArray[i])) {
				numberCount++;
			} else if (Character.isSpaceChar(charArray[i])) {
				spaceCount++;
			} else {
				othersCount++;
			}
		}
		System.out.println("字母出现的次数为 " + letterCount + " 次");
		System.out.println("数字出现的次数为 " + numberCount + " 次");
		System.out.println("空格出现的次数为 " + spaceCount + " 次");
		System.out.println("其他出现的次数为 " + othersCount + " 次");
	}

	public static void main(String[] args) {
		CountString cs = new CountString();
		cs.countString("123 AS Dsf  %^&");
	}
}
