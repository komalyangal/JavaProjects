package com.sunbeam;

public class Employee implements Comparable<Employee> {
	int empid;
	String name;
	double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

	// Natural ordering of the elements
	@Override
	public int compareTo(Employee o) {
		// return this.empid - o.empid;
		return Double.compare(o.salary, this.salary);
	}

}
