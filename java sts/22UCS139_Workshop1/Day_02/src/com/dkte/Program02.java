package com.dkte;

import java.util.Scanner;

class Employee {
	private int empid;
	private String name;
	private double salary;

	
	Employee() {
		System.out.println("Parameterless Ctor called");
	}

	
	Employee(int empid, String name, double salary) {
		System.out.println("Parameterized Ctor called");
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	
	void setEmpId(int empid) {
		this.empid = empid;
	}

	void setName(String name) {
		this.name = name;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	
	int getEmpId() {
		return empid;
	}

	String getName() {
		return name;
	}

	
	void acceptEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee name ");
		name=sc.next();
		System.out.println("Enter the employee id ");
		empid=sc.nextInt();
		System.out.println("Enter the employee salary ");
		salary=sc.nextDouble();
		
		
	}

	void displayEmployee() {
		System.out.println("Empid - " + empid);
		System.out.println("Name - " + name);
		System.out.println("Salary - " + salary);
	}
}

public class Program02 {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee(1, "Anil", 10000);
		e1.acceptEmployee();
		e1.displayEmployee();


	}

}
