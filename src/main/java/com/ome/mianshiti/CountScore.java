package com.ome.mianshiti;

public class CountScore {

	/**
	 * 通过分数求学生成绩标准
	 * 
	 * @param score
	 *            成绩
	 * @param specialScore
	 *            特殊分数
	 */
	public void countScoreMethod(int score, int specialScore) {
		if ((score + 5) == specialScore) {
			System.out.println("学习成绩为D");
		} else {
			System.out.println("学习成绩为：" + ((score < 60) ? "C" : (score < 90) ? "B" : "A"));
		}
	}

	public static void main(String[] args) {
		CountScore cs = new CountScore();
		cs.countScoreMethod(59, 95);
	}
}
