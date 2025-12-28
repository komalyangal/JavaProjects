package com.sunbeam;

public class Program03 {

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
				for (int i = 1; i <= 5; i++) {
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
		th2.setDaemon(true); // to make a deamon thread.
		// by default all the threads are non deamon threads.
		th2.start();

		for (int i = 1; i <= 5; i++) {
			System.out.println("Main - " + i);
			delay();
		}

	}

}
