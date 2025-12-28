package com.sunbeam;

import java.util.Scanner;

public class Program04 {

	public static void delay() {
		try {
			Thread.sleep(2000);
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
		System.out.println("State before starting =  " + th1.getState());
		th1.start();

		Thread th2 = new MyThread();
		th2.start();

		System.out.println("Press any key to continue");
		new Scanner(System.in).next();
		System.out.println("State after starting =  " + th1.getState());

		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("State after ternimation =  " + th1.getState());

	}

}
