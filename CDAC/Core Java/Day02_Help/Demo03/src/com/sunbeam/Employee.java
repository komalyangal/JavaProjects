package com.sunbeam;

import java.util.Scanner;

public class Employee {
	private int empid;
	private String name;
	private double salary;

	public Employee() {
	}

	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	void accept(Scanner sc) {
		System.out.print("Enter Empid - ");
		empid = sc.nextInt();
		// TO-DO
	}

	void display() {
		System.out.println("Employee Display");
		// TO-DO
	}

	void calculateTax() {
		System.out.println("Employee CalculateTax");
		// TO-Do // Calculate 10% tax on the salary
	}

}
