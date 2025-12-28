package com.sunbeam;

import java.util.Scanner;

public class Employee {
	int empid;
	String name;
	double salary;

	public Employee() {
	}

	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	void accept(Scanner sc) {
		// System.out.println("Employee accept");
		System.out.print("Enter the empid - ");
		empid = sc.nextInt();
		System.out.print("Enter the name - ");
		name = sc.next();
		System.out.print("Enter the salary - ");
		salary = sc.nextDouble();
	}

	void display() {
		// System.out.println("Employee display");
		System.out.println("Empid = " + empid);
		System.out.println("Name = " + name);
		System.out.println("Salary = " + salary);
	}

}
