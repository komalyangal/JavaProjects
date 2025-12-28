package com.sunbeam.entities;

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
	public String toString() {
		return "Manager [bonus=" + bonus + ", empid=" + empid + ", name=" + name + ", salary=" + salary
				+ ", toString()=" + super.toString() + "]";
	}

}
