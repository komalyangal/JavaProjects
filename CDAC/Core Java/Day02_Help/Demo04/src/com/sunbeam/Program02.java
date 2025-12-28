package com.sunbeam;

class Employee {
	int empid;
	String name;
	double salary;

	void display() {
		System.out.println("Empid - " + empid);
		System.out.println("Name - " + name);
		System.out.println("Salary - " + salary);
	}

}

public class Program02 {
	public static void main(String[] args) {
		Employee[] empList = new Employee[5];

		// If objects are not created then you will get NullPointerException
		empList[0] = new Employee();
		empList[1] = new Employee();
		empList[2] = new Employee();
		empList[3] = new Employee();
		empList[4] = new Employee();

		for (Employee ele : empList)
			ele.display();
	}

}
