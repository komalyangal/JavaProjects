package com.sunbeam;

public class Progarm02 {
	public static void delay() {
		try {
			Thread.sleep(1000);
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
					synchronized (account) { // lock
						account.deposit(1000);
						System.out.println("After deposit = " + account.balance);
					} // unlock
				}
			}
		}

		class WithdrawThread extends Thread {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					delay();
					synchronized (account) { // lock
						account.withdraw(1000);
						System.out.println("After withdraw = " + account.balance);

					} // unlock
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
