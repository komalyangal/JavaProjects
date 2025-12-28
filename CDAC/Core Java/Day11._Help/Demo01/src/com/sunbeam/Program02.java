package com.sunbeam;

public class Program02 {

	public static void delay() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		class MyThread extends Thread {
			@Override
			public void run() {
				for (int i = 1; i <= 8; i++) {
					System.out.println("MyThread - " + i);
					delay();
				}
			}
		}
		Thread th1 = new MyThread();
		th1.start();

		class MyRunnable implements Runnable {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("MyRunnable - " + i);
					delay();
				}
			}
		}
		Thread th2 = new Thread(new MyRunnable());
		th2.start();

		for (int i = 1; i <= 5; i++) {
			System.out.println("Main - " + i);
			delay();
		}

		try {
			// waiting for the other threads to complete their execution
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("All task is done...");
	}

}
