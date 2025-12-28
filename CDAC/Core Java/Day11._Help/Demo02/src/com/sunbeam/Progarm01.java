package com.sunbeam;

public class Progarm01 {
	public static void delay() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Account account = new Account(10000);

		class DepositThread extends Thread {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					delay();
					account.deposit(1000);
					System.out.println("After deposit = " + account.balance);
				}
			}
		}

		class WithdrawThread extends Thread {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					delay();
					account.withdraw(1000);
					System.out.println("After withdraw = " + account.balance);
				}
			}
		}

		Thread dt = new DepositThread();
		Thread wt = new WithdrawThread();

		dt.start();
		wt.start();

		try {
			dt.join();
			wt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Final balance = " + account.balance);

	}

}
