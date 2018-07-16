package com.ome.threads;

public class ThreadTest1 implements Runnable {
	private int ticket = 10; // 总票数

	public void run() {
		for (int i = 0; i < 2000; i++) {
			// 同一时刻,只允许一个线程进入并且操作,其他线程需要等待
			synchronized (this) { // 表示为程序上锁
				if (this.ticket > 0) { // 表示现在还有票
//					try {
//						Thread.sleep(100);
						System.out.println(Thread.currentThread().getName() + "卖票, ticket = " + this.ticket--);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
				}
			}
		}
	}

}
