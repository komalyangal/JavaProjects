package com.sunbeam;

import java.util.Scanner;

public class Manager extends Employee {
	double bonus;

	public double getBonus() {
		return bonus;
	}

	public Manager() {
	}

	public Manager(int empid, String name, double salary, double bonus) {
		super(empid, name, salary);
		this.bonus = bonus;
	}

	@Override
	void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("Enter the bonus - ");
		bonus = sc.nextDouble();
	}

	@Override
	void display() {
		super.display();
		System.out.println("Manager display");
		System.out.println("Bonus = " + bonus);
	}

}
