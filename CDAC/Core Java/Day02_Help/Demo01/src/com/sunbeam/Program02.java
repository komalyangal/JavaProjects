package com.sunbeam;

class Employee {
	private int empid;
	private String name;
	private double salary;

	// constructor-paramterless
	Employee() {
		System.out.println("Parameterless Ctor called");
	}

	// constructor - paramterized
	Employee(int empid, String name, double salary) {
		System.out.println("Parameterized Ctor called");
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	// setters
	void setEmpId(int empid) {
		this.empid = empid;
	}

	void setName(String name) {
		this.name = name;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	// Getter
	int getEmpId() {
		return empid;
	}

	String getName() {
		return name;
	}

	// facilitators
	void acceptEmployee() {
		// To-Do
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
		e1.displayEmployee();
		e2.displayEmployee();

		// e1.empid = 1;
		e1.setEmpId(1);

		// System.out.println("e1.empid = " + e1.empid);
		System.out.println("e1.empid = " + e1.getEmpId());

	}

}
