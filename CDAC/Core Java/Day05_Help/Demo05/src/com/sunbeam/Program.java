package com.sunbeam;

class Person {
	private String name;

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

}

class Employee extends Person {
	int empid;
	double salary;

	public Employee() {
		this(1000, 500); // ctor chaining
	}

	public Employee(int empid, double salary) {
		this.empid = empid;
		this.salary = salary;

	}

	public Employee(int empid, String name, double salary) {
		// super(name);
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
}

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
