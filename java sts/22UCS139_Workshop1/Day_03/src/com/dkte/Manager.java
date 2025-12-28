package com.dkte;



public class Manager extends Employee {
	double bonus;

	public Manager() {
		System.out.println("Manager Ctor");
	}

	public Manager(double bonus) {
		System.out.println("Manager Ctor(double)");
	}

	public Manager(int empid, String name, double salary, double bonus) {
		super(empid, name, salary);
		System.out.println("Manager Ctor(int,String,double,double)");
		this.bonus = bonus;
	}

	void displayManager() {
		this.displayEmployee();
		System.out.println("Bonus = " + bonus);
	}

}

