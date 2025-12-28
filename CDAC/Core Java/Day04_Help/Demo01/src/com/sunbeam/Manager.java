package com.sunbeam;

import java.util.Scanner;

public class Manager extends Employee {
	double bonus;

	public Manager() {
	}

	public Manager(int empid, String name, double salary, double bonus) {
		super(empid, name, salary);
		this.bonus = bonus;
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Bonus - " + bonus);
	}

	public void calculateTotalSalary() {
		System.out.println("Total Salary - " + (salary + bonus));
	}

}
