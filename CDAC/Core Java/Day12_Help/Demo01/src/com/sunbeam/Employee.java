package com.sunbeam;

import java.util.Scanner;

public class Employee {
	int empid;
	String name;
	double salary;
	String dept;

	public Employee() {
	}

	public Employee(int empid, String name, double salary, String dept) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the empname - ");
		name = sc.next();
		System.out.print("Enter the salary - ");
		salary = sc.nextDouble();
		System.out.print("Enter the dept- ");
		dept = sc.next();
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}

}
