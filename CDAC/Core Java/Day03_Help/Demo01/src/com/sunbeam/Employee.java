package com.sunbeam;

public class Employee {
	int empid;
	String name;
	double salary;

	public Employee() {
		System.out.println("Employee ctor");
	}

	public Employee(int empid, String name, double salary) {
		System.out.println("Employee ctor(int,String,double)");
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	void displayEmployee() {
		System.out.println("Empid = " + empid);
		System.out.println("Name = " + name);
		System.out.println("Salary = " + salary);
	}

}
