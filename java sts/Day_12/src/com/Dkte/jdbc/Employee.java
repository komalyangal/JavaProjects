package com.Dkte.jdbc;

import java.util.Scanner;

public class Employee {

	String name;
	int empid;
	String dept;
	double salary;
	
	public Employee()
	{
		
	}
	public Employee(String name, int empid, String dept, double salary) {
		this.name = name;
		this.empid = empid;
		this.dept = dept;
		this.salary = salary;
	}
	
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name ");
		name=sc.next();
		System.out.println("Enter the Department ");
		dept=sc.next();
		System.out.println("Enter the salary ");
		salary=sc.nextDouble();
		
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	
}
