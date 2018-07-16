package com.ome.threads;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Demo {
	private String str = null;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		final Demo d = new Demo();
		new Timer().schedule(new TimerTask() {

			@Override
			public void run() {
				d.str = "00";
				System.out.println("BOM");

			}
		}, 10000,3000);

		int i = 15;
		while (i > 0) {

			System.out.println(new Date().getSeconds());
			i--;
			try {
				Thread.sleep(1000);
				if (d.str != null) {
					System.out.println("跳出循环程序结束");
					break;
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
