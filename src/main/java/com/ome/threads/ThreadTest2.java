package com.ome.threads;

public class ThreadTest2 extends Thread {
	public ThreadTest2(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i < 30; i++) {
//				Thread.sleep(100);
			System.out.println("当前线程 " + Thread.currentThread().getName() + "--->" + i);
		}
	}

}

